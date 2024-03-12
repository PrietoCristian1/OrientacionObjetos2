package src.java.tp0;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Tiempo tiempo = new Tiempo();
        System.out.println("Forma Anemica");
        System.out.println(tiempo.getFechaActual().format(formatoLargo));
        System.out.println(tiempo.getFechaActual().format(formatoCorto));
    }
}
