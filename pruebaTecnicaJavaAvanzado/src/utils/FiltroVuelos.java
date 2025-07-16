package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroVuelos {

    public static List<Vuelo> filtrarPorFechas (List<Vuelo> vuelos, LocalDate fechaDesde, LocalDate fechaHasta) {
        return vuelos.stream()
                .filter(v -> {
                    LocalDate inicio = v.getFechaInicio();
                    if (fechaDesde != null && fechaHasta != null) {
                        return (inicio.isEqual(fechaDesde) || inicio.isAfter(fechaDesde)) &&
                                (inicio.isEqual(fechaHasta) || inicio.isBefore(fechaHasta));
                    } else if (fechaDesde != null) {
                        return inicio.isEqual(fechaDesde) || inicio.isAfter(fechaDesde);
                    } else if (fechaHasta != null) {
                        return inicio.isEqual(fechaHasta) || inicio.isBefore(fechaHasta);
                    } else {
                        return true;
                    }
                })
                .sorted(Comparator.comparing(Vuelo::getFechaInicio))        //ordenar la lista
                .collect(Collectors.toList());          //convertimos en una lista
    }
}
