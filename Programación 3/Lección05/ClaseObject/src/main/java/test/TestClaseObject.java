package test;

import domain.*;


import javax.swing.*;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jorge",4514);
        Empleado empleado2 = new Empleado("Jorge",4514);

        if (empleado1==empleado2){
            JOptionPane.showMessageDialog(null,"Tienen la mismma referencia en memoria");
        }else {
            JOptionPane.showMessageDialog(null,"Tienen distinta referencia en memoria");
        }

        if (empleado1.equals(empleado2)){
            JOptionPane.showMessageDialog(null,"Los objetos son iguales en contenido");
        }else {
            JOptionPane.showMessageDialog(null,"Los objetos son distintos en contenido");
        }
    }
}
