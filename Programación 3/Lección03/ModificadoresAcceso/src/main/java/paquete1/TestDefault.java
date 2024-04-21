package paquete1;

import paquete2.Clase4;

public class TestDefault {
    public static void main(String[] args) {
        ClaseHija2 claseH2 = new ClaseHija2();
        claseH2.atriburoDefault = "Cambio desde la prueba";
        System.out.println("claseH2 atriburo default = " + claseH2.atriburoDefault);

        Clase4 clase4 = new Clase4("Publico");
        System.out.println("clase4 = " + clase4.getAtributoPrivate());
        clase4.setAtributoPrivate("Cambio");
        System.out.println("clase4 " + clase4.getAtributoPrivate());
    }
}

