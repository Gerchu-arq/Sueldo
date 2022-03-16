package servicio;

import entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {

    public Scanner leer = new Scanner(System.in); //atributo global

    public Vendedor altaVendedor() {
        //instanciar un obj de tipo vendedor   
        Vendedor v1 = new Vendedor();
        //lleno los atributos
        // Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el nombre del vendedor");
        v1.setNombre(leer.nextLine());
        System.out.println("Ingresar el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingresar el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingresar el dia de inicio del trabajo");
        int dia = leer.nextInt();
        System.out.println("Ingresar el mes de inicio del trabajo");
        int mes = leer.nextInt();
        System.out.println("Ingresar el año de inicio del trabajo");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    public void sueldoMensual(Vendedor v1) {
        System.out.println("Ingresar ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15); // 15% de las ventas
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor " + v1.getNombre()
                + " es de $" + v1.getSueldoMensual());
    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 dias de vacaciones");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 dias de vacaciones");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias de vacaciones");
        }else{
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
