package com.pruebaQuipux.models.equipofutbol.dto;

public class ReporteBasicoDTO {
	private String nombreEquipo;
	private Integer cantidadTitulos;
	private Integer cantidadJugadores;

	public ReporteBasicoDTO(String nombreEquipo, Integer cantidadTitulos, Integer cantidadJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.cantidadTitulos = cantidadTitulos;
        this.cantidadJugadores = cantidadJugadores;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Integer getCantidadTitulos() {
		return cantidadTitulos;
	}

	public void setCantidadTitulos(Integer cantidadTitulos) {
		this.cantidadTitulos = cantidadTitulos;
	}

	public Integer getCantidadJugadores() {
		return cantidadJugadores;
	}

	public void setCantidadJugadores(Integer cantidadJugadores) {
		this.cantidadJugadores = cantidadJugadores;
	}
}
