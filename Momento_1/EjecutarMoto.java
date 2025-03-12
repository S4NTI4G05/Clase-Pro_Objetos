package Momento_1;

import java.util.Scanner;

public class EjecutarMoto {
    //Arreglo que designa los espacios dde los parqueaderos
    public static Moto [] Bajocc = new Moto[20]; 
    public static Moto [] Altocc = new Moto[10];
    //Se usa Scanner para la toma y captura de datos
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Se crea el menu usando Do While y Shitch

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
                registrarMoto(Alto,400, "Moto de Alto cilindraje");
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
        } while (opcion !5);
    }
    //
}
