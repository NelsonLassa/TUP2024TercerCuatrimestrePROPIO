package paquete1;

public class Clase1 {
    public String atributoPublic = "Valor atributo Publico";
    protected String atributoProtected = "valor atributo protected";

    public Clase1(){ //Constructor
        System.out.println("Constructor public");
    }

    protected Clase1(String atributoProtected){
        System.out.println("Constructor protected");
    }

    public void metodoPublico(){
        System.out.println("Método public");
    }

    protected void metodoProtected(){
        System.out.println("Método protected");
    }
}
