package Momento_2;

public class Foto {
    private String fichero;
    private String fotoColor;
    private String fotoBlancoNegro;
    private int nuemeoCopias;

    ///Constructor
    public Foto(String fichero, String fotoColor, String fotoBlancoNegro, int nuemeoCopias) {
        this.fichero = fichero;
        this.fotoColor = fotoColor;
        this.fotoBlancoNegro = fotoBlancoNegro;
        this.nuemeoCopias = nuemeoCopias;
    }

    //Metodos
    public void setFichero(String fichero) {
        this.fichero = fichero;
    }
    public String getFichero() {
        return fichero;
    }
    public void setFotoColor(String fotoColor) {
        this.fotoColor = fotoColor;
    }
    public String getFotoColor() {
        return fotoColor;
    }
    public void setFotoBlancoNegro(String fotoBlancoNegro) {
        this.fotoBlancoNegro = fotoBlancoNegro;
    }
    public String getFotoBlancoNegro() {
        return fotoBlancoNegro;
    }
    public void setNuemeoCopias(int nuemeoCopias) {
        this.nuemeoCopias = nuemeoCopias;
    }
    public int getNuemeoCopias() {
        return nuemeoCopias;
    }
    public String toString() {
        return "Foto{" + "fichero=" + fichero + ", fotoColor=" + fotoColor + ", fotoBlancoNegro=" + fotoBlancoNegro + ", nuemeoCopias=" + nuemeoCopias + '}';
    }

}

