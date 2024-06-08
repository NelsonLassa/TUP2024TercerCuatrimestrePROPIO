package test;

import domain.*;


import javax.swing.*;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jorge",4514);
        Empleado empleado2 = new Empleado("Jorge",4514);

        if (empleado1==empleado2){
            JOptionPane.showMessageDialog(null,"1. Tienen la mismma referencia en memoria");
        }else {
            JOptionPane.showMessageDialog(null,"1. Tienen distinta referencia en memoria");
        }

        if (empleado1.equals(empleado2)){
            JOptionPane.showMessageDialog(null,"2. Los objetos son iguales en contenido");
        }else {
            JOptionPane.showMessageDialog(null,"2. Los objetos son distintos en contenido");
        }
        if (empleado1.hashCode() == empleado2.hashCode()){
            JOptionPane.showMessageDialog(null,"3. El valor hashCode es igual");
        }else {
            JOptionPane.showMessageDialog(null,"3. El valor hashCode es diferente");
        }
    }
}
