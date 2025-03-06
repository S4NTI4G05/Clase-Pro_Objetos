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

        System.out.println("Por favor ingrese su placa: ");
        placa = entrada.next();

        System.out.println("Ingrese el Cilindraje de su moto: ");
        cilindraje = entrada.nextDouble();

        System.out.println("Ingrese la marca de su moto: ");
        marca = entrada.next();

        
    }
}
