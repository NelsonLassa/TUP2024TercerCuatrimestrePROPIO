package test;

import domain.*;
import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1000);
        imprimir(empleado1);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());

        Gerente gerente1 = new Gerente("Nelson", 2000, "Sistema");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        imprimir(gerente1);
    }

    //Polimorfismo
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
