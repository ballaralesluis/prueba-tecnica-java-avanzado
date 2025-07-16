import entities.Vuelo;
import utils.FiltroVuelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final LocalDate FechaDesde = LocalDate.of(2024, 04, 18);
    private static final LocalDate FechaHasta = LocalDate.of(2026, 07, 22);

    public static void main(String[] args) {
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo(1, "AK 710", "Kuala Lumpur", "Sevilla", "Barcelona", LocalDate.of(2025, 07, 13), LocalDate.of(2025, 07, 15)));
        vuelos.add(new Vuelo(2, "VLG2224", "Vueling", "Sevilla", "Barcelona", LocalDate.of(2025, 8, 22), LocalDate.of(2025, 011, 1)));
        vuelos.add(new Vuelo(3, "IBE5066", "Iberia", "Sevilla", "Barcelona", LocalDate.of(2025, 7, 23), LocalDate.of(2026, 1, 3)));
        vuelos.add(new Vuelo(4, "QTR3513", "QATAR", "Sevilla", "Barcelona", LocalDate.of(2025, 8, 25), LocalDate.of(2026, 2, 3)));
        vuelos.add(new Vuelo(5, "AAL8864", "American Airlines", "Sevilla", "Barcelona", LocalDate.of(2025, 9, 27), LocalDate.of(2026, 3, 7)));
        vuelos.add(new Vuelo(6, "EVE814", "Ibero Jet", "Madrid", "Cancun", LocalDate.of(2025, 10, 29), LocalDate.of(2026, 4, 9)));
        vuelos.add(new Vuelo(7, "AAL126", "American Airlines", "Madrid", "Chicago", LocalDate.of(2025, 11, 19), LocalDate.of(2026, 5, 11)));
        vuelos.add(new Vuelo(8, "BAW1638", "British Airways", "Madrid", "Orlando", LocalDate.of(2025, 12, 21), LocalDate.of(2026, 6, 13)));
        vuelos.add(new Vuelo(9, "FIN5768", "Finnair", "Madrid", "FortLaudel", LocalDate.of(2025, 1, 8), LocalDate.of(2027, 7, 17)));
        vuelos.add(new Vuelo(10, "RZO505", "Sata", "Bilbao", "Ponta Delgada", LocalDate.of(2025, 2, 10), LocalDate.of(2026, 8, 17)));
        List<Vuelo> vuelosFiltrados = FiltroVuelos.filtrarPorFechas(vuelos, FechaDesde, FechaHasta);
        System.out.println("Vuelos filtrados:");
        vuelosFiltrados.forEach(System.out::println);
    }
}