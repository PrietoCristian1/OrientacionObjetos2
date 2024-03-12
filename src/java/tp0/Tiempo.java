package src.java.tp0;

import java.time.LocalDate;

public class Tiempo {
    /**
     * Tiempo Anemico, su funcion principal es solo proporcionar acceso a la fecha actual y no contiene comportamiento propio del objeto.
     * En este caso se utiliza el objeto como si fuera una estructura de datos donde accedo unicamente a recuaperar/guardar informacion.
     */
    private LocalDate fechaActual;

    public Tiempo() {
        this.fechaActual = LocalDate.now();
    }

    public LocalDate getFechaActual() {
        return this.fechaActual;
    }
}
