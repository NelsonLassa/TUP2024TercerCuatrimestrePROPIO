package paquete1;

public class ClaseHija2 extends Clase2{
    public ClaseHija2(){
        super();
        this.atriburoDefault = "Modificación";
        System.out.println("atriburoDefault = " +this.atriburoDefault);
        this.metodoDefault();
    }
}
