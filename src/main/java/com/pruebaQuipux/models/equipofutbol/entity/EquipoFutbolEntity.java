package com.pruebaQuipux.models.equipofutbol.entity;

import java.util.List;

public class EquipoFutbolEntity {
	private String nombreEquipo;
	private String estadioEquipo;
	private Integer cantidadTitulos;
	private List<JugadorEntity> jugadoresTitulares;
	private List<JugadorEntity> jugadoresSuplentes;

	public EquipoFutbolEntity(String nombreEquipo, String estadioEquipo, Integer cantidadTitulos,
			List<JugadorEntity> jugadoresTitulares, List<JugadorEntity> jugadoresSuplentes) {
		this.nombreEquipo = nombreEquipo;
		this.estadioEquipo = estadioEquipo;
		this.cantidadTitulos = cantidadTitulos;
		this.jugadoresTitulares = jugadoresTitulares;
		this.jugadoresSuplentes = jugadoresSuplentes;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getEstadioEquipo() {
		return estadioEquipo;
	}

	public void setEstadioEquipo(String estadioEquipo) {
		this.estadioEquipo = estadioEquipo;
	}

	public Integer getCantidadTitulos() {
		return cantidadTitulos;
	}

	public void setCantidadTitulos(Integer titulos) {
		this.cantidadTitulos = titulos;
	}

	public List<JugadorEntity> getJugadoresTitulares() {
		return jugadoresTitulares;
	}

	public void setJugadoresTitulares(List<JugadorEntity> jugadoresTitulares) {
		this.jugadoresTitulares = jugadoresTitulares;
	}

	public List<JugadorEntity> getJugadoresSuplentes() {
		return jugadoresSuplentes;
	}

	public void setJugadoresSuplentes(List<JugadorEntity> jugadoresSuplentes) {
		this.jugadoresSuplentes = jugadoresSuplentes;
	}

}
