package Ejercicios_Casa;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         * Obtener dos arreglos tal que sus elementos sean los números pares y números impares
         * del arreglo A de 10 elementos.
         * 
         * Analisis: Se necesita crear 2 arreglos, en la cual su contenido se va a generar de manera
         * aleatoria, este contenido se tiene que dividir en numeros pares e impares,
         * la suma total del contenido de estos 2 arreglos, deben ser 10 numeros.
         * 
         */
        Random random = new Random();
        int[] a = new int[10];

        // Llenar el arreglo A con números aleatorios entre 1 y 50
        System.out.println("Arreglo original:");
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50) + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");

        // Contadores para pares e impares
        int contPares = 0, contImpares = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                contPares++;
            } 
            else {
                contImpares++;
            }
        }

        // Crear arreglos para pares e impares
        int[] pares = new int[contPares];
        int[] impares = new int[contImpares];

        // Llenar los arreglos de pares e impares
        int Pares = 0, Impares = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                pares[Pares++] = num;
            } else {
                impares[Impares++] = num;
            }
        }

        // Mostrar los arreglos
        System.out.println("Números pares:");
        for (int num : pares) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("Números impares:");
        for (int num : impares) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}