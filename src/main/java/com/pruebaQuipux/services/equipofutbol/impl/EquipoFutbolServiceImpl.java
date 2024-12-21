package com.pruebaQuipux.services.equipofutbol.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pruebaQuipux.models.equipofutbol.dto.ReporteBasicoDTO;
import com.pruebaQuipux.models.equipofutbol.dto.ReporteDetalladoDTO;
import com.pruebaQuipux.models.equipofutbol.entity.EquipoFutbolEntity;
import com.pruebaQuipux.services.equipofutbol.EquipoFutbolService;
import com.pruebaQuipux.utils.equipofutbol.MensajesErrorEquipo;

@Service
public class EquipoFutbolServiceImpl implements EquipoFutbolService {
	EquipoFutbolEntity equipoEntity;

	@Override
	public EquipoFutbolEntity creacionEquipo(EquipoFutbolEntity equipo) {
		if (equipo.getCantidadTitulos() == null || equipo.getCantidadTitulos() < 0) {
			throw new IllegalArgumentException(MensajesErrorEquipo.SIN_TITULOS);
		}
		if (equipo.getJugadoresTitulares().isEmpty() || equipo.getJugadoresSuplentes().isEmpty()) {
			throw new IllegalArgumentException(MensajesErrorEquipo.SIN_JUGADORES);
		}
		this.equipoEntity = new EquipoFutbolEntity(equipo.getNombreEquipo(), equipo.getEstadioEquipo(),
				equipo.getCantidadTitulos(), equipo.getJugadoresTitulares(), equipo.getJugadoresSuplentes());
		return this.equipoEntity;
	}

	@Override
	public ReporteBasicoDTO reporteBasico() {
		if (equipoEntity == null) {
			throw new IllegalStateException(MensajesErrorEquipo.EQUIPO_NO_CREADO);
		}
		Integer cantidadJugadores = equipoEntity.getJugadoresTitulares().size()
				+ equipoEntity.getJugadoresSuplentes().size();
		return new ReporteBasicoDTO(equipoEntity.getNombreEquipo(), equipoEntity.getCantidadTitulos(),
				cantidadJugadores);

	}

	@Override
	public ReporteDetalladoDTO reporteDetallado() {
		if (equipoEntity == null) {
			throw new IllegalStateException(MensajesErrorEquipo.EQUIPO_NO_CREADO);
		}
		List<String> jugadoresTitulares = equipoEntity.getJugadoresTitulares().stream()
				.map(jugador -> jugador.getNombreJugador() + " - " + jugador.getPosicion())
				.collect(Collectors.toList());

		List<String> jugadoresSuplentes = equipoEntity.getJugadoresSuplentes().stream()
				.map(jugador -> jugador.getNombreJugador() + "-" + jugador.getPosicion()).collect(Collectors.toList());

		return new ReporteDetalladoDTO(equipoEntity.getNombreEquipo(), jugadoresTitulares, jugadoresSuplentes);

	}

}
