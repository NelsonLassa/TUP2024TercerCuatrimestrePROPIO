package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    // Inicalización estática
    static {
        System.out.println("Ejecución del bloque estático");
        ++Persona.contadorPersonas;
        // idPersona = 10; No es estático por esto tenemos un error
    }
    { // Bloque de inicialización NO estatico (contexto dinamico)
        System.out.println("Ejecución del bloque NO estático");
        this.idPersona = Persona.contadorPersonas++; // Incrementamos el atributo

    }

    // Los bloques de inicialización se ejecitan antes del constructor

    public Persona(){
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                " idPersona= " + idPersona +
                '}';
    }
}
