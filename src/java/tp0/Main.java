package src.java.tp0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        TiempoRecord tiempo = new TiempoRecord(LocalDate.now());
        System.out.println("Forma Anemica");
        System.out.println(tiempo.fecha().format(formatoCorto));
        System.out.println(tiempo.fecha().format(formatoLargo));
    }
}
