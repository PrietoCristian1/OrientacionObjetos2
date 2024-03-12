package src.test.java.tp0;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Forma No Anemica");
        Tiempo tiempo = new Tiempo();
        System.out.println(tiempo.mostrarFechaLarga());
        System.out.println(tiempo.mostrarFechaCorta());
    }
}
