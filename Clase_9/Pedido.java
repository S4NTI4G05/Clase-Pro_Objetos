package Clase_9;

import java.sql.Date;

public class Pedido {
    
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido (Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito){
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente(){
        return cliente;
    }
    public Producto[] getProducto(){
        return producto;
    }
    public Date getfecha(){
        return fecha;
    }
    public int getnumeroTarjetaCredito(){
        return numeroTarjetaCredito;
    }
}





