package Momento_1;

import java.util.Scanner;

public class EjecutarMoto {
    // Arreglo que designa los espacios dde los parqueaderos
    public static Moto [] Bajocc = new Moto[20]; 
    public static Moto [] Altocc = new Moto[10];
    //Se usa Scanner para la toma y captura de datos
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Se crea el menu usando Do While y Shitch

    int opcion;
        do {
            System.out.println("---  MENU PRINCILPAL ---");
            System.out.println("1. Resgistrar moto de bajo cilidraje");
            System.out.println("2. Resgistrar moto de alto cilidraje");
            System.out.println("3. Cobro del parqueadero");
            System.out.println("4. Mostar estado del parqueadero");
            System.out.println("5. Cerrar el menu");
            System.out.println("Seleccione alguna de las 5 opciones");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    registrarMoto(Bajocc,250, "Moto de bajo cilindraje");  
                break;

                case 2:
                    registrarMoto(Altocc,400, "Moto de Alto cilindraje");
                break;

                case 3: 
                    cobrarTarifa();
                break;

                case 4:
                    mostrarEstadoParqueadero();
                break;

                case 5:
                    System.out.println("---  CERRANDO MENU  ---");
                break;

                default:
                System.out.println("Opcion no valida, ingrese una de las 5 opciones");
            }
        } while (opcion !=5);
    }
    // Funcion para registrar una Moto
    public static void registrarMoto(Moto[] motos, double cilindrajeLimite, String tipo) {
        System.out.println("---  REGRISTRO DE MOTO (" + tipo + ")  ---");
        System.out.println("Ingrese la placa de su moto");
        String Placa = entrada.next();
        Placa = Placa.toUpperCase();//Se usa .toUpperCase Para que lea la placa en mayuscula y en minuscula

        // Verificacion para saber si la moto ya se encuentra registrada
        if(buscarMoto(Placa)!= null){
            System.out.println("Error en la moto con placa " + Placa + "Ya se encuentra registrada");
            return;
        }
        System.out.println("Ingrese el cilindraje de su moto");
        double Cilindraje = entrada.nextDouble();

        // Segun el cilindraje ingresado, se va mostrar el tipo de parqueadero al que pertenece
        if (tipo.equals("Bajo Cilindraje")) {
            if (Cilindraje > 400) {
                System.out.println("Error: Esta moto debe registrarse en el parqueadero de Alto Cilindraje");
            }
        }
        else if (tipo.equals("Alto Cilindraje")) {
            if (Cilindraje < 401) {
                System.out.println("Error: Esta moto debe registrarse en el parqueadero de Bajo Cilindraje");
            }
        }

        // Se van a mostrar los puestos disponibles
        Moto moto = new Moto(Placa,Cilindraje, 0);
        System.out.println("Puestos Disponibles: ");
        for(int i = 0; i < motos.length; i++){
            // i es la posicion del arreglo dentro del ciclo, inicia en 0
            // moto.length es la cantidad de espacios totales dentro del parqueadero
            if (motos[i]== null){
                System.out.println((i + 1)+ " ");
            }
        }
        System.out.println();

        // Seleccionar el lugar que quiere el usuario en el aprqueadero  
        System.out.println("Seleccione un puesto disponible");
        int puesto = entrada.nextInt()-1;

        // Verificar que el puesto esta dentro del rango permitido 
        // Puesto >= a motos.length, evitando que el usuario indique un numero mayor al numero total de puestos establecidos
        if(puesto < 0 || puesto >= motos.length){
            System.out.println("Error: Puesto no valido");
            return; // Se usa return para que muestre el error y salga del metodo
        }

        // Se crea una condicion que comprueba si el puesto esta ocupado, asociandolo a diferente de null, muestra error
        if (motos[puesto]!=null) {
            System.out.println("Error en el puesto" +(puesto + 1)+ "ya esta ocupado.");
            return;
        }
    }
    // Funcion para generar el cobro 
    public static void cobrarTarifa(){
        System.out.println("---  COBRO DE TARIFA  ---");
        System.out.println("Ingrese la placa de su moto");
        String Placa = entrada.next();

        Placa = Placa.toUpperCase();
        // llamamos la funcion que recorre los arreglos bajo cc y alto cc para encontrar la moto
        // Si la moto exite, devuelve el objeto moto
        // Si no se encuentra, sera null
        Moto moto = buscarMoto(Placa);

        // Si la moto != null fue encontrada.
        // Se solicita el tiempo de estacionamiento en minutos.
        if (moto != null) {
            System.out.println("Ingrese el tiempo del estacionamiento en minutos:");
            int Tiempo = entrada.nextInt();

            // Se calcula el valor de la tarifa usando calcularTarifa(tiempo).
            double tarifa = calcularTarifa(Tiempo);
            System.out.println("La tarifa a pagar es :$" + tarifa);

            // Se llama a liberar puesto(moto), lo que hace es eliminar del arreglo la moto y deja disponible el puesto.
            liberarPuesto(moto);
        }
        else{
             // Si la moto no es encontrada muestra mensaje error
            System.out.println("Moto no encontrada.");
        }
    }   

    // Funcion para calcular la tarifa
    public static double calcularTarifa(int Tiempo){
        if(Tiempo <= 30){
            return 0;
        }
        else if(Tiempo <= 60 ){
            return 800;
        }
        else{
            return 2000;
        }
    }

    // Funcion para liberar un puesto,busca en el arreglo de Bajo cilindraje, si lo encuentra , lo elimina
    public static void liberarPuesto(Moto moto) {
        for(int i = 0; i < Bajocc.length; i++){
            if (Bajocc[i] != null && Bajocc[i].getPlaca().equals(moto.getPlaca())) {
                Bajocc[i] = null; // Identidica si el arreglo es = null y libera el puesto
                System.out.println("Puesto liberado en el parquedejo de Bajo cilindraje");
                return;
            }
        }
        for(int i = 0; i < Altocc.length; i++){
            if (Altocc[i] != null && Altocc[i].getPlaca().equals(moto.getPlaca())) {
                Altocc[i] = null; // Identidica si el arreglo es = null y libera el puesto
                System.out.println("Puesto liberado en el parquedejo de Alto cilindraje");
                return;
            }
        }
    }

    // Funcion para mostrar el estado del parquedero
    public static void mostrarEstadoParqueadero() {
        System.out.println("---  ESTA DEL PARQUEADERO  ---");
        System.out.println("Bajo Cilindraje (20 puestos):");
        for(int i = 0; i < Bajocc.length; i++){
            System.out.println("Puesto" + (i + 1)+ ":" + (Bajocc[i]==null? "Disponible" : "Ocupado"));
        }

        System.out.println("Alto Cilindraje (10 puestos)");
        for (int i = 0; i < Altocc.length; i++) {
            System.out.println("Puesto" + (i + 1)+ ":" + (Altocc[i]==null?"Disponible" : "Ocupado"));     
        }
    }

    // Funcion para buscar la moto con su respectiva placa
    public static Moto buscarMoto(String Placa) {
        // Recorre el arreglo con un ciclo, si encuentra moto con la misma placa la va a retornar
        for(Moto moto : Bajocc){
            if (moto != null && moto.getPlaca().equals(Placa)) {
                return moto;
            }
        }
        for(Moto moto : Altocc){
            if (moto != null && moto.getPlaca().equals(Placa)) {
                return moto;
            }
        }
        return null;
    }
}