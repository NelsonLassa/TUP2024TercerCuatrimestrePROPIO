package mundopc;

import ar.com.system2024.mundopc.*;


public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clasa
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        //Creamos otros objetos de diferentes marca
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        Orden orden1 = new Orden(); // Arreglo inicializado pero vacio
        Orden orden2 = new Orden(); // Lista nueva para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);

        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas",monitorHP,tecladoGamer,ratonHP);
        orden2.agregarComputadora(computadorasVarias);

        // Muestra de las Ordenes
        orden1.muestraOrden();
        orden2.muestraOrden();

        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //probar de esta manera los métodos al maximo rendimiento
    }
}
