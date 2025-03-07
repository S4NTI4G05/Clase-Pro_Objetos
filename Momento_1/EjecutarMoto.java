package Momento_1;

import java.util.Scanner;

public class EjecutarMoto {
    public static void main(String[] args) {
        Moto Bajocc[] = new Moto[20];
        Moto Altocc[] = new Moto[10];

        String marca;
        String placa;
        double cilindraje;

        //Scanner es para la toma y captura de datos que ingresados por el usuario
        Scanner entrada = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Registro de motos de bajo cilindraje");
            System.out.println("2. Registro de motos de alto cilindraje");
            System.out.println("3. Cobros del parqueadero");
            System.out.println("4. Cerrar la aplicación");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese por favor su placa: ");
                    placa = entrada.next();
                    System.out.println("Ingrese por favor el cilindraje de su moto: ");
                    cilindraje = entrada.nextDouble();
                    System.out.println("Ingrese por favor la marca de su marca: ");
                    marca = entrada.next();
                    break;
                
                case 2:
                    System.out.println("Ingrese por favor su placa: ");
                    placa = entrada.next();
                    System.out.println("Ingrese por favor el cilindraje de su moto: ");
                    cilindraje = entrada.nextDouble();
                    System.out.println("Ingrese por favor la marca de su marca: ");
                    marca = entrada.next();
                    break;
                
                    case 3:
                    System.out.println("Menu de cobro");
                    break;

                case 4:
                    System.out.println("Cerrando la aplicación...");
                    break;

            }
        } while (true);
        
    }
}
