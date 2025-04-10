package Momento_2;

public class Imprension extends Producto{
     // Atributos
    private String color;
    private Foto[] foto; // Arreglo de fotos

     // Métodos
    public Imprension(Foto[] foto, String color, int numero, String nombre, double precio, String referencia, double ancho, double alto) {
        super(numero, nombre, precio, referencia, ancho, alto); // Llamada al constructor de la clase padre
        this.color = color;
        this.foto = foto;
    }

    // GET para retornar la información puntual
    public String getColor() {
        return color;
    }

     public Foto[] getFoto() { // Cambiado el tipo de retorno a Foto[]
        return foto;
    }

    // SET para modificar la información
    public void setColor(String color) {
        this.color = color;
    }

    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }
    public String toString() {
        return "Imprension{" +"color='" + color + '\'' +", foto=" + java.util.Arrays.toString(foto) +'}';
    }
}
