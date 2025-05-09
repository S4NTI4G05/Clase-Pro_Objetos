package Momento_2;

public class Producto {
    // Atributos
    private int numero;
    private String nombre;
    private double precio;
    private String referencia;
    private double ancho;
    private double alto;


    // constructor
    public Producto(int numero, String nombre, double precio, String referencia, double ancho, double alto) {
    this.numero = numero;
    this.nombre = nombre;
    this.precio = precio;
    this.referencia = referencia;
    this.ancho = ancho;
    this.alto = alto;
    }

    // metodo
    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public String toString(){
        return "Producto{" + "numero=" + numero + ",nombre=" + nombre +",precio=" + precio +",referencia=" + referencia +",ancho=" + ancho +",alto=" + alto +"}";
    }

}
