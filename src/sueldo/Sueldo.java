
//Programa Principal
package sueldo;

import entidades.Vendedor;
import servicio.VendedorServicio;

public class Sueldo {

    public static void main(String[] args) {
        // TODO code application logic here
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.vacaciones(v1);
        vs.sueldoMensual(v1);
    }
    
}
