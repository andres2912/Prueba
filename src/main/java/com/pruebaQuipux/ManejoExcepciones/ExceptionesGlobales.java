package com.pruebaQuipux.manejoexcepciones;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionesGlobales {
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Map<String, String>> manejoIllegalArgumentException(IllegalArgumentException e) {
		Map<String, String> respuestaError = new HashMap<>();
		respuestaError.put("error", "Error en la solicitud");
		respuestaError.put("mensaje", e.getMessage());
		return ResponseEntity.badRequest().body(respuestaError);

	}

	@ExceptionHandler(IllegalStateException.class)
	public ResponseEntity<Map<String, String>> manejoIllegalStateException(IllegalStateException e) {
		Map<String, String> respuestaError = new HashMap<>();
		respuestaError.put("error", "Estado inválido");
		respuestaError.put("mensaje", e.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(respuestaError);
	}

}
