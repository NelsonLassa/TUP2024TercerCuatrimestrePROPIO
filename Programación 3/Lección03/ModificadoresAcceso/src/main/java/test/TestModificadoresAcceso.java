package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1(); //Desde el constructor
        System.out.println("clase1 = " + clase1.atributoPublic); // Desde el atributo
        clase1.metodoPublico(); // Desde el metodo
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
    }
}
