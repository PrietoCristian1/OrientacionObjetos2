package src.test.java.tp0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tiempo {
    /**
     * Tiempo No anemico porque es mas rico en compartamiento y no se usa solamente para acceder a la informacion.
     * Esta clase de objetos encapsula tanto la estructura interna como el comportamiento. Tienen metodos que operan sobre
     * los datos y llevan a cabo acciones significativas
     */
    private final DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
    private final DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final LocalDate fechaActual = LocalDate.now();

    public String mostrarFechaLarga() {
        return fechaActual.format(formatoLargo);
    }

    public String mostrarFechaCorta() {
        return fechaActual.format(formatoCorto);
    }
}
