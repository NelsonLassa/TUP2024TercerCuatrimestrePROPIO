package ar.com.system2024.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamnio;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamnio){
        this(); //llamado al constructor vacio
        this.marca= marca;
        this.tamnio= tamnio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamnio() {
        return this.tamnio;
    }

    public void setTamnio(double tamnio) {
        this.tamnio = tamnio;
    }
    // Ingresamos manualmente el getIdMonitor
    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamnio=" + tamnio +
                '}';
    }
}
