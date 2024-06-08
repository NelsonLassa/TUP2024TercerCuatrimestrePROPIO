package test;

import domain.*;


import javax.swing.*;

public class TestCoversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);

        JOptionPane.showMessageDialog(null, "empleado =" + empleado);
        JOptionPane.showMessageDialog(null, empleado.obtenerDetalles()); // Si queremos acceder a métodos Escritor
        //empleado.getTipoEscritura(); No se puede hacer
        //Downcasting conversión de escritura
        // TODO convierte a un tipo padre a un tipo hijo
        //((Escritor)empleado).getTipoEscritura(); // Tenemos 2 opciones: esta es una
        //Escritor escritor = (Escritor) empleado; // Esta es la segubda opción
        //escritor.getTipoEscritura();

        // Upcasting
        //Empleado empleado2 = escritor;
        //ikhjugytfdvbJOptionPane.showMessageDialog(null, empleado2.obtenerDetalles());

    }
}
