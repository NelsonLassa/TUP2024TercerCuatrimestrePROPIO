package accesodatos;

public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar de Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar de Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar de Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar de Mysql");
    }
}
