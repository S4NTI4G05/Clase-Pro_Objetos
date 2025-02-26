package Ejercicios_Casa;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio8 {
    
    public static void main(String[] args) {

        /*
        * Elaborar un programa que lea 30 números y que imprima el número mayor, menor y el número de 
        * veces que se repiten ambos.
        * 
        * Observacion: Me dio pereza digitar los 30 numeros, entonces hice que se
        * generen aleatoriamente.
        */

        int[] numeros = new int[30];
        int[] pares = new int[30];
        int[] impares = new int[30];

        // Generar numeros aleatorios
        Random random = new Random();
        //numeros.length se usa para obetener la cantidad de elementos que contiene el array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); // numeros entre 0 y 99
        }

        int numPares = 0;
        int numImpares = 0;

        // Separar pares e impares
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares[numPares++] = num;
            }
            else {
                impares[numImpares++] = num;
            }
        }
        
        // Ordenar los arreglos de menor a mayor
        Arrays.sort(pares,0, numPares); 
        Arrays.sort(impares,0, numImpares);

        System.out.println("Numeros Generados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Numeros Pares:");
        for (int i = 0; i < numPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("Numeros Impares:");
        for (int i = 0; i < numImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

    }
    


}
