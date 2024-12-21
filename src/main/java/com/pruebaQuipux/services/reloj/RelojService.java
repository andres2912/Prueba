package com.pruebaQuipux.services.reloj;

/**
 * Interfaz para manejar operaciones relacionadas con la representación de la
 * hora en palabras.<br>
 * Creado el Dec 20, 2024 a las 11:27:39 AM<br>
 *
 * @author Andres Felipe <br>
 */
public interface RelojService {
	/**
	 * Convierte la hora y los minutos en representación numerica a palabras. <br>
	 * Creado el Dec 20, 2024 a las 7:32:19 PM<br>
	 * 
	 * @param hora    la hora del día en formato de 12 horas.
	 * @param minutos de (0-59).
	 * @return Un String que representa la hora en palabras.
	 * @throws IllegalArgumentException si los parámetros son nulos o están fuera
	 *                                  del rango permitido.
	 */
	String horaEnPalabras(Integer hora, Integer minutos);
}
