package Momento_1;
public class Moto {

    //Atritutos de la clase
    private String marca;
    private String placa;
    private double cilindraje;
    private int tiempo;

    //Contructor 
    public Moto (String marca, String placa, double cilindraje, int tiempo){

    //Atributos
    this.marca = marca;
    this.placa = placa;
    this.cilindraje = cilindraje;
    this.tiempo = tiempo;
    }

    //Get es el que guarda atributo y lo lee
    public String getMarca(){
        return marca;
    }
    public String getPlaca(){
        return placa;
    }
    public double getCilindraje(){
        return cilindraje;
    }
    public int getTiempo(){
        return tiempo;
    }

    //Set es el que modifica y asigna el valor al atributo
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setMarca(double cilindraje){
        this.cilindraje = cilindraje;
    }
    public void setMarca(int tiempo){
        this.tiempo = tiempo;
    }
}
