package com.pruebaQuipux.controllers.numeros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaQuipux.services.numeros.NumerosService;

@RestController
@RequestMapping("/numeros")
public class NumerosController {
	@Autowired
	NumerosService numerosService;

	@GetMapping("/{numero}")
	public ResponseEntity<String> validacionNumero(@PathVariable Integer numero) {
		try {
			return new ResponseEntity<>(numerosService.validacionNumero(numero), HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body(e.getLocalizedMessage());
		}
	}

}
