package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {
    @Override
    public void insertar() {
        System.out.println("Insertar de Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar de Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar de Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar de Oracle");
    }
}
