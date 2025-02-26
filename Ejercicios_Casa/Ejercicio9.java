package Ejercicios_Casa;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
         * Dado un arreglo unidimensional de enteros y un número entero,
         * determinar cuántas veces se encuentra este número dentro del arreglo.
         * 
         * Analisis: Crear un arreglo de tamano aleatorio para almacenar numero aleatorios,
         * Luego se le pedirá al usuario que ingrese un número para determinar cuántas veces aparece
         * en el arreglo.
         */

        // Darle un tamano aletorio al arreglo entre 5 y 15
        Random random = new Random();
        int n = random.nextInt(11) + 5; 

        // Declarar el arreglo
        int[] a = new int[n];

        // Llenar el arreglo con números aleatorios entre -10 y 10
        System.out.println("Arreglo generado:");
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(21) - 10;
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");

        //Se le pide al usuario que numero buscar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número a buscar: ");
        int numBuscado = scanner.nextInt();
        scanner.close();

        //Contador de veces que aparece el número
        int cont = 0;
        for(int num : a) {
            if (num == numBuscado){
                cont++;
            }
        }
        //Resultado
        System.out.println("El número: "+numBuscado+" aparece "+cont+" veces en el array");
    }
}