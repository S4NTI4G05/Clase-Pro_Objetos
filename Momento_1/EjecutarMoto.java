package Momento_1;

import java.util.Scanner;

public class EjecutarMoto {

    public static Moto[] Bajocc = new Moto[20]; // Parqueadero Bajo Cilindraje
    public static Moto[] Altocc = new Moto[10]; // Parqueadero Alto Cilindraje

    public static Scanner entrada = new Scanner(System.in); // Se importa el Scanner para la toma y captura de datos

    public static void main(String[] args) {
        
        // Menú de registro
        int opcion;
        do {
            System.out.println("---  MENU PRINCIPAL  ---");
            System.out.println("1. Registre una moto de Bajo Cilindraje");
            System.out.println("2. Registre una moto de Alto Cilindraje");
            System.out.println("3. Calcule y genere su cobro");
            System.out.println("4. Mostrar estado de los parqueaderos");
            System.out.println("5. Salir del menu");
            System.out.print("SELECCIONE ALGUNA OPCION: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    registrarMoto(Bajocc, 250, "Bajo Cilindraje");
                    break;
                case 2:
                    registrarMoto(Altocc, 400, "Alto Cilindraje");
                    break;
                case 3:
                    cobrarTarifa();
                    break;
                case 4:
                    mostrarEstadoParqueadero();
                    break;
                case 5:
                    System.out.println("Cerrando la aplicacion...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo");
                    break;
            }
        } while (opcion != 5);
    }

    


}