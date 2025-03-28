package Clase_8;

public class Cliente {
    
    private long cedula;
    private String nombre;

    public Cliente (long ceudla, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String toString(){
        return "Cliente { CC: " + cedula + "Nombre: " + nombre + "}";
    }

}
