package Clase_3;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * 3. Dado un arreglo lineal de numeros, sumear separadamnete
         * los numeros pares y los numeris impares
         * 
         * Analisis: Declarar un arreglo, en dos variables ir guardando la suma de los numeros
         * pares y numeros impares, lo anterior debe iterar en un "for" con la condicion de 
         * validar si el numero es par o impar (n%2 == 0 -> par)
         */
        int[] b = { 5, 2, 6, 5, 9, 90, 1, 8, 15, 4};

        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                sumaPares += b[i];
            }
            else{
                sumaImpares += b[i];
            }
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La suma de los numeros impares es " + sumaImpares);
    }
}
