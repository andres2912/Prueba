package com.pruebaQuipux.services.reloj.impl;

import org.springframework.stereotype.Service;

import com.pruebaQuipux.services.reloj.RelojService;
import com.pruebaQuipux.utils.reloj.HorasReloj;

@Service
public class RelojServiceImpl implements RelojService {
	@Override
	public String horaEnPalabras(Integer hora, Integer minutos) {
		String minutosEnPalabras;
		if (hora < 1 || hora > 12 || minutos < 0 || minutos >= 60) {
			throw new IllegalArgumentException(HorasReloj.MENSAJE_ERROR);
		}

		String horaEnPalabras = HorasReloj.HORAS[hora - 1];

		switch (minutos) {
		case 0:
			return horaEnPalabras + HorasReloj.EN_PUNTO;
		case 15:
			return horaEnPalabras + HorasReloj.Y_CUARTO;
		case 30:
			return horaEnPalabras + HorasReloj.Y_MEDIA;
		default:
			minutosEnPalabras = HorasReloj.MINUTOS[minutos - 1] + HorasReloj.PALABRA_MINUTOS;
			return horaEnPalabras + HorasReloj.Y + minutosEnPalabras;
		}
	}
}
