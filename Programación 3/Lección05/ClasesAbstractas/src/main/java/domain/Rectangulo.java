package domain;

import javax.swing.*;

public class Rectangulo extends FiguraGeometrica {

    // Constructor
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() { // Implementando el método
        JOptionPane.showMessageDialog(null, "Se imprime un: " + this.getClass().getSimpleName());
    }
//    void dibujar(){
//        // Comportamiento de la subclase
//    }
}
