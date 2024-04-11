package enumeracion;

public enum Continentes {
    AFRICA(53,"1.2 billones"),
    EUROPA(46,"1.1 billones"),
    ASIA(44,"1.9 billones"),
    AMERICA(34,"150.2 billones"),
    OCEANIA(14,"1.2 billones");
    // El punto y como solo se utiliza cuando se pienza seguir en la enumeración

    //Definimos un atributo
    private final int paises;
    private final String habitantes;

    Continentes(int paises,String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    // Metodo Get

    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
}
