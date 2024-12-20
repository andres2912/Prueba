package com.pruebaQuipux.controllers.reloj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaQuipux.services.reloj.RelojService;

@RestController
@RequestMapping("/reloj")
public class RelojController {
	@Autowired
	RelojService relojService;
	
	@GetMapping("/{hora}/{minutos}")
	ResponseEntity<String> horaEnPalabras(@PathVariable Integer hora, @PathVariable Integer minutos){
		try {
			return new ResponseEntity<>(relojService.horaEnPalabras(hora, minutos), HttpStatus.OK);	
		}catch (IllegalArgumentException e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
