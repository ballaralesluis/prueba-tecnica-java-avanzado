package entities;

import java.time.LocalDate;

public class Vuelo {
    private int id;
    String nombreVuelo;
    String empresa;
    String lugarSalida;
    String lugarLLegada;
    LocalDate fechaInicio;
    LocalDate fechaFinal;

    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLLegada, LocalDate fechaInicio, LocalDate fechaFinal) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLLegada = lugarLLegada;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    @Override
    public String toString() {
        return "entities.Vuelo{" +
                "id=" + id +
                ", nombreVuelo='" + nombreVuelo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", lugarSalida='" + lugarSalida + '\'' +
                ", lugarLLegada='" + lugarLLegada + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                '}';
    }
}