package com.pruebaQuipux.services.equipofutbol;

import com.pruebaQuipux.models.equipofutbol.dto.ReporteBasicoDTO;
import com.pruebaQuipux.models.equipofutbol.dto.ReporteDetalladoDTO;
import com.pruebaQuipux.models.equipofutbol.entity.EquipoFutbolEntity;

/**
 * Interface para la gestión de equipos de fútbol, proporcionando métodos para
 * crear un equipo y generar reportes basicos y detallados de este. <br>
 * Creado el Dec 20, 2024 a las 6:18:11 PM<br>
 *
 * @author Andrés Felipe Lopera <br>
 */
public interface EquipoFutbolService {
	/**
	 * Este método toma como parámetro un objeto de tipo EquipoFutbolEntity <br>
	 * que contiene la siguiente información:
	 * <ul>
	 * <li>nombre del equipo.</li>
	 * <li>estadio.</li>
	 * <li>jugadores titulares y suplentes.</li>
	 * <li>cantidad de títulos ganados.</li>
	 * </ul>
	 * Creado el Dec 20, 2024 a las 6:32:04 PM<br>
	 * 
	 * 
	 * @param equipo objeto de tipo EquipoFutbolEntity.
	 * @return objeto de tipo EquipoFutbolEntity creado
	 * @throws IllegalArgumentException si la información proporcionada es inválida.
	 */
	EquipoFutbolEntity creacionEquipo(EquipoFutbolEntity equipo);

	/**
	 * Genera un reporte con la siguiente información:<br>
	 * <ul>
	 * <li>Nombre equipo.</li>
	 * <li>Cantidad de títulos ganados.</li>
	 * <li>Cantidad total de jugadores titulares y suplentes.</li>
	 * </ul>
	 * Creado el Dec 20, 2024 a las 6:38:47 PM<br>
	 * 
	 * @return Objeto de tipo ReporteBasicoDTO
	 */
	ReporteBasicoDTO reporteBasico();

	/**
	 * Genera un reporte con la siguiente información:<br>
	 * <ul>
	 * <li>Nombre equipo.</li>
	 * <li>Listado de jugadores titulares con nombre y posición.</li>
	 * <li>Listado de jugadores suplentes con nombre y posición.</li>
	 * </ul>
	 * Creado el Dec 20, 2024 a las 6:44:27 PM<br>
	 *
	 * @return Objeto de tipo ReporteDetalladoDTO.
	 */
	ReporteDetalladoDTO reporteDetallado();
}
