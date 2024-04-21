package paquete1;

class Clase2 extends Clase1 {
    String atriburoDefault = "Valor del atributo default";

//    Clase2(){
//        System.out.println("Constructor Default");
//    }

    public Clase2(){
        super();
        this.atriburoDefault = "Modificación del atributo default";
        System.out.println("atriburoDefault = " + atriburoDefault);
        this.metodoDefault();
    }
    void metodoDefault(){
        System.out.println("Método Default");
    }
}
