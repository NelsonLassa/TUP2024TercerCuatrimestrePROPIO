package test;

import domain.*;

public class TestAbstractas {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        ((Rectangulo) figura).dibujar();
    }
}
