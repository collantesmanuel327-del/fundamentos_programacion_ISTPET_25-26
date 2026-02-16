package fecha;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class horario {

    public static void main(String[] args) {

        
        // fechas 
   

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Formatos de fecha
        DateTimeFormatter formatoFecha1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoFecha2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Fechas1");
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Formato dd/MM/yyyy: " + fechaActual.format(formatoFecha1));
        System.out.println("Formato yyyy-MM-dd: " + fechaActual.format(formatoFecha2));

        System.out.println();

        // hora ejercicio 2
        
        // Obtener la hora actual
        LocalTime horaActual = LocalTime.now();

        // Formatos de hora
        DateTimeFormatter formato24Horas = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formato12Horas = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println("Horas2");
        System.out.println("Hora actual: " + horaActual);
        System.out.println("Formato 24 horas: " + horaActual.format(formato24Horas));
        System.out.println("Formato 12 horas: " + horaActual.format(formato12Horas));

        System.out.println();

        // fecha y hors ejercicio3

        // Obtener fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        // Formato personalizado
        DateTimeFormatter formatoFechaHora =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Fecha y horas3");
        System.out.println("Fecha y hora actual: " + fechaHoraActual);
        System.out.println("Fecha y hora formateada: " +
                fechaHoraActual.format(formatoFechaHora));
    }
}
