package Clase_8;

public class EjecutarComposicionAgregacion {
    
    public static void main(String[] args) {
        
        //Creacion de los objetos para validar el modelo (Modelo = abstraccion de la realidad)

        Cuenta [] c = new Cuenta [2];//Creacion de una estructura de arreglos para la cuentas
        c[0] = new Cuenta(10203456, "Ahorros", 2000.0);
        c[1] = new Cuenta(20250106, "Corriente", 5000.0);

        /* 
        Cuenta objCuenta1 = new Cuenta(10203456, "Ahorros", 2000.0);
        Cuenta objCuenta2 = new Cuenta(20250106, "Corriente", 5000.0);
        */

        Cliente objCliente1 = new Cliente(1011345678, "Byron Cano");
        Cliente objCliente2 = new Cliente(31789087, "Natalia Hurtado");

        Banco objBanco1 = new Banco("Bancolombia", "Cl. 5 #66", c);
        System.out.println(objBanco1);
        System.out.println(objBanco1.consultarCliente(objCliente2));

    }

}
