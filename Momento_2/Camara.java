package Momento_2;

public class Camara  extends Producto{
    private String marca;
    private String modelo;
    private double codigo;

    // constructor
    public Camara (String marca, String modelo, double codigo,int numero, String nombre, double precio, double ancho, double alto,String referencia){
    super(numero, nombre, precio, referencia, ancho, alto);        
    this.marca = marca;
    this.modelo = modelo;
    this.codigo = codigo;
}
    //Metodos
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getCodigo(){
        return codigo;
    }
}
