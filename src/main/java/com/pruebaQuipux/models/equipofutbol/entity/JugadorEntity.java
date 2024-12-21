package com.pruebaQuipux.models.equipofutbol.entity;

public class JugadorEntity {
	private String nombreJugador;
	private String posicion;

	public JugadorEntity(String nombreJugador, String posicion) {
		this.nombreJugador = nombreJugador;
		this.posicion = posicion;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}
