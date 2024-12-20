package com.pruebaQuipux.services.impl.numeros;

import org.springframework.stereotype.Service;

import com.pruebaQuipux.services.numeros.NumerosService;
import com.pruebaQuipux.utils.MensajesNumeros;

@Service
public class NumerosServiceImpl implements NumerosService {
	@Override
	public String validacionNumero(Integer numero) {
		if (numero >= 1 && numero <= 100) {
			if (numero % 2 != 0) {
				return MensajesNumeros.NUMERO_IMPAR;
			} else {
				if (numero >= 2 && numero <= 5) {
					return MensajesNumeros.NUMERO_PAR_RANGO_ENTRE_2_5;
				} else if (numero >= 6 && numero <= 20) {
					return MensajesNumeros.NUMERO_PAR_RANGO_ENTRE_6_20;
				} else if (numero > 20) {
					return MensajesNumeros.NUMERO_PAR_MAYOR_A_20;
				}
			}

		}
		return MensajesNumeros.NUMERO_NO_VALIDO;

	}

}
