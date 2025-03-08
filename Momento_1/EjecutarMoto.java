package Momento_1;

import java.util.Scanner;

public class EjecutarMoto {

    public static void parquederoBajocc (Moto i[]) {
        String parqueaderoBajocc =" PAQUEADERO DE BAJO CILINDRAJE \n";
        parqueaderoBajocc += "1   2   3   4   5   6   7   8   9   10   11   12   13   14   15   16   17   18   19   20 \n";
        for(int ubicacion = 0; ubicacion < i.length; ubicacion++){
            if (i[ubicacion] == null){
                parqueaderoBajocc += "[Vacio, la puede meter aca]";
            }
            else{
                parqueaderoBajocc += "[Ocupado por otra moto]";
            }        
        }
        System.out.println(parqueaderoBajocc);     
    }

    public static void parquederoAltocc (Moto a[]) {
        String parqueaderoAltocc =" PAQUEADERO DE ALTO CILINDRAJE \n";
        parqueaderoAltocc += "1   2   3   4   5   6   7   8   9   10   \n";
        for(int ubicacion = 0; ubicacion < a.length; ubicacion++){
            if (a[ubicacion] == null){
                parqueaderoAltocc += "[Vacio, la puede meter aca]";
            }
            else{
                parqueaderoAltocc += "[Ocupado por otra moto]";
            }        
        }
        System.out.println(parqueaderoAltocc);     
    }
    
    
    private static Moto buscarMoto(String placa, Moto[] Bajocc, Moto[] Altocc) {
        // Buscar en el arreglo de bajo cilindraje
        for (Moto moto : Bajocc) {
            if (moto != null && moto.getPlaca().equals(placa)) {
                return moto; // Moto encontrada
            }
        }
        // Buscar en el arreglo de alto cilindraje
        for (Moto moto : Altocc) {
            if (moto != null && moto.getPlaca().equals(placa)) {
                return moto; // Moto encontrada
            }
        }
        return null; // Moto no encontrada
    }
    
    public static void main(String[] args) {
        Moto Bajocc[] = new Moto[20];
        Moto Altocc[] = new Moto[10];

        String placa;
        double cilindraje;

        //Scanner es para la toma y captura de datos que ingresados por el usuario
        Scanner entrada = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Registro de moto");
            System.out.println("2. Cobro del parqueadero");
            System.out.println("3. Cerrar la aplicación");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                
                System.out.println("Ingrese por favor su placa: ");
            placa = entrada.next();
            System.out.println("Ingrese por favor el cilindraje de su moto: ");
            cilindraje = entrada.nextDouble();

            // Bajo Cilindraje
            if (cilindraje > 0 && cilindraje <= 400) {
                boolean registrado = false;
                for (int i = 0; i < Bajocc.length; i++) {
                    if (Bajocc[i] == null) {
                        Bajocc[i] = new Moto(placa, cilindraje, 0); // Iniciar tiempo en 0
                        System.out.println("Moto registrada en bajo cilindraje.");
                        registrado = true;
                        break;
                    }
                }
                if (!registrado) {
                    System.out.println("No hay espacio disponible para motos de bajo cilindraje.");
                }
            } 
            // Alto Cilindraje
            else if (cilindraje > 400) {
                boolean registrado = false;
                for (int a = 0; a < Altocc.length; a++) {
                    if (Altocc[a] == null) {
                        Altocc[a] = new Moto(placa, cilindraje, 0); // Iniciar tiempo en 0
                        System.out.println("Moto registrada en alto cilindraje.");
                        registrado = true;
                        break;
                    }
                }
                if (!registrado) {
                    System.out.println("No hay espacio disponible para motos de alto cilindraje.");
                }
            }
            else {
                System.out.println(" Este cilindraje no es válido.");
            }
            break;

                case 2:
                    System.out.println("Menu de cobro");
                    System.out.println("Ingrese la placa de la moto para el cobro: ");
                    String placaCobro = entrada.next();

                    Moto motoCobro = buscarMoto(placaCobro, Bajocc, Altocc);
                    
                    if (motoCobro != null) {
                        System.out.println("Ingrese el tiempo en minutos: ");
                        int tiempoCobro = entrada.nextInt();
                        
                        // Actualizar el tiempo en la moto
                        motoCobro.setTiempo(tiempoCobro);
                        
                        // Calcular el costo
                        double costo = motoCobro.calcularCosto();
                        System.out.println("El costo del parqueo es: $" + costo);
                    } else {
                        System.out.println("Moto no encontrada.");
                    }
                break;

                case 3:
                    System.out.println("Cerrando la aplicación...");
                break;

                default:{System.out.println("La opcion no es valida. ");}break;

            }
        } while (opcion!=3);
        
    }
}
