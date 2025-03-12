package Momento_1;
public class Moto {

    //Atritutos de la clase
    private String Placa;
    private double Cilindraje;
    private int Tiempo;

    //Contructor 
    public Moto (String Placa, double Cilindraje, int Tiempo){

    //Atributos
    this.Placa = Placa;
    this.Cilindraje = Cilindraje;
    this.Tiempo = Tiempo;
    
    }

    //Get es el que guarda atributo y lo lee
    public String getPlaca(){
        return Placa;
    }
    public double getCilindraje(){
        return Cilindraje;
    }
    public int getTiempo(){
        return Tiempo;
    }

    //Set es el que modifica y asigna el valor al atributo
    public void setPlaca(String Placa){
        this.Placa = Placa;
    }
    public void setCilindraje(double Cilindraje){
        this.Cilindraje = Cilindraje;
    }
    public void setTiempo(int Tiempo){
        this.Tiempo = Tiempo;
    }

}
