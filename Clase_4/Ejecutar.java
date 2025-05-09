package Clase_4;

public class Ejecutar {
    public static void main(String[] args) {
        
        //Forma 1
        Vehiculo objVehiculo1 = new Vehiculo("Toyoya", "Blanca", 4500.0,
        "TS3456WE", 2.3, "150HP");

        //Forma 2
        Vehiculo objVehiculo2;
        objVehiculo2 = new Vehiculo("Ferrari", "Rojo", 5000.0,
        "SEWR567UY", 1.8, "450HP");

        //Mostrar la marca del vehiculo del objVehiculo1
        System.out.println(objVehiculo1.getMarca());

        //Se va modificar la marca del vehiculo del objeto objVehiculo1
        objVehiculo1.setMarca("Chevrolet");

        //Mostrar todo el objeto
        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo2);

        System.out.println(objVehiculo1.getMarca());
        objVehiculo1.acelerar();
        System.out.println(objVehiculo2.getMarca());
        objVehiculo2.frenar();
    }
}
