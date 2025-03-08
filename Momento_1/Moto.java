package Momento_1;
public class Moto {

    //Atritutos de la clase
    private String placa;
    private double cilindraje;
    private int tiempo;

    //Contructor 
    public Moto (String placa, double cilindraje, int tiempo){

    //Atributos
    this.placa = placa;
    this.cilindraje = cilindraje;
    this.tiempo = tiempo;
    
    }

    //Get es el que guarda atributo y lo lee
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
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setCilindraje(double cilindraje){
        this.cilindraje = cilindraje;
    }
    public void setTiempo(int tiempo){
        this.tiempo = tiempo;
    }

    // Método para calcular el costo del parqueo
    public double calcularCosto() {
        if (tiempo <= 30) {
            return 0; // Primeros 30 minutos son gratis
        } else if (tiempo <= 60) {
            return 800; // Costo desde 31 minutos a 60 minutos
        } else {
            return 2000; // Costo para más de 60 minutos
        }
    }

}
