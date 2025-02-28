package Clase_4;

import javax.print.DocFlavor.STRING;

public class Vehiculo {
    
    // Atributos de la clase
    private String marca;
    private String color;
    private double cilindraje;
    private String chasis;
    private double peso;
    private String portencia;
    
    /*
     * Contructor de la clase -> permite inicializar el objeto.
     * El contructor de la clase reconoce porque tiene el mismo nombre de la clase
     */

    //Atributos
    public Vehiculo(String marca, String color, double cilindraje, String chasis,
        double peso, String potencia){
        this.marca = marca;
        this.color = color;
        this.cilindraje = cilindraje;
        this.chasis = chasis;
        this.peso = peso;
        this.portencia = potencia;
    }
    
    //Metodos getter / setter 
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    //permite mostrar el objeto
    public String toString(){
        return "Vehiculo {Marca: " + marca + " Color:  "+ color + " Cilindraje: " + cilindraje +
        " Chasis: " + chasis + "Peso: " + peso + "Potencia: " + portencia + " }";
    }

    //Metodos de la clase 
    public void acelerar(){
        System.out.println("Vehiculo acelerando...");
    }

    public void frenar(){
        System.out.println("Vehiculo frenando...");
    }

    public void girarIzquierda(){
        System.out.println("Vehiculo girando izquierda...");
    }

    public void girarDerecha(){
        System.out.println("Vehiculo girando derecha...");
    }

    public void retoceder(){
        System.out.println("Vehiculo retrocediendo...");
    }




}
