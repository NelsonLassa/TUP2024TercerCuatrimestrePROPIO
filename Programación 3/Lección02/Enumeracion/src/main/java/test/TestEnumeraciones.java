package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia: 1" + Dias.LUNES);
        //indicarDiaSemana(Dias.LUNES);
        // Las enumeraciones se tratan comos cadenas
        //Ahora no se deben utilizar comillas, se accede a traves de el operador de punto

        System.out.println("Continente No. 1er " + Continentes.AFRICA);
        System.out.println("No. de paises en el 1er continente: " +Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 1er continente: " +Continentes.AFRICA.getHabitantes());

        System.out.println("Continente No. 2do " + Continentes.EUROPA);
        System.out.println("No. de paises en el 2do continente: " +Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 2do continente: " +Continentes.EUROPA.getHabitantes());

        System.out.println("Continente No. 3ro " + Continentes.ASIA);
        System.out.println("No. de paises en el 3ro continente: " +Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 3ro continente: " +Continentes.ASIA.getHabitantes());

        System.out.println("Continente No. 4to " + Continentes.AMERICA);
        System.out.println("No. de paises en el 4to continente: " +Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: " +Continentes.AMERICA.getHabitantes());

        System.out.println("Continente No. 5to " + Continentes.OCEANIA);
        System.out.println("No. de paises en el 5to continente: " +Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes en el 5to continente: " +Continentes.OCEANIA.getHabitantes());




    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo día de la semana");
                break;

        }
    }
}
