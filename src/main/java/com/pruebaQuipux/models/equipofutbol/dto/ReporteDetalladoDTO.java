package com.pruebaQuipux.models.equipofutbol.dto;

import java.util.List;

public class ReporteDetalladoDTO {
	private String nombreEquipo;
	private List<String> jugadoresTitulares;
	private List<String> jugadoresSuplentes;

	public ReporteDetalladoDTO(String nombreEquipo, List<String> jugadoresTitulares, List<String> jugadoresSuplentes) {
		this.nombreEquipo = nombreEquipo;
		this.jugadoresTitulares = jugadoresTitulares;
		this.jugadoresSuplentes = jugadoresSuplentes;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public List<String> getJugadoresTitulares() {
		return jugadoresTitulares;
	}

	public void setJugadoresTitulares(List<String> jugadoresTitulares) {
		this.jugadoresTitulares = jugadoresTitulares;
	}

	public List<String> getJugadoresSuplentes() {
		return jugadoresSuplentes;
	}

	public void setJugadoresSuplentes(List<String> jugadoresSuplentes) {
		this.jugadoresSuplentes = jugadoresSuplentes;
	}

}
