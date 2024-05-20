package domain;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Cual es tu nombre");
        String nombre = JOptionPane.showInputDialog(null,"Dime tu nombre");
        JOptionPane.showMessageDialog(null,"Tu nombre es "+nombre);
//        Object[] opciones = {"Sí", "No", "Quizás"};
//        int respuesta = JOptionPane.showOptionDialog(null, "¿Estás disfrutando aprender Java?", "Encuesta",
//                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//        switch (respuesta) {
//            case 0:
//                JOptionPane.showMessageDialog(null, "Seleccionaste Sí");
//                break;
//            case 1:
//                JOptionPane.showMessageDialog(null, "Seleccionaste No");
//                break;
//            case 2:
//                JOptionPane.showMessageDialog(null, "Seleccionaste Quizás");
//                break;
//            default:
//                JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción");
//        }

    }
}