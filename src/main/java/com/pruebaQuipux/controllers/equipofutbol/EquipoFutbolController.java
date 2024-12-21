package com.pruebaQuipux.controllers.equipofutbol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaQuipux.models.equipofutbol.dto.ReporteBasicoDTO;
import com.pruebaQuipux.models.equipofutbol.dto.ReporteDetalladoDTO;
import com.pruebaQuipux.models.equipofutbol.entity.EquipoFutbolEntity;
import com.pruebaQuipux.services.equipofutbol.EquipoFutbolService;

@RestController
@RequestMapping("/equipo")
public class EquipoFutbolController {

	@Autowired
	EquipoFutbolService equipoFutbolService;

	@PostMapping("/crearEquipo")
	public ResponseEntity<String> crearEquipo(@RequestBody EquipoFutbolEntity equipoFutbolEntity) {
		try {
			equipoFutbolService.creacionEquipo(equipoFutbolEntity);
			return ResponseEntity.status(HttpStatus.CREATED).body("Equipo creado con éxito");
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body(e.getLocalizedMessage());
		}
	}

	@GetMapping("/reporteBasico")
	public ResponseEntity<ReporteBasicoDTO> reporteBasico() {
		return new ResponseEntity<>(equipoFutbolService.reporteBasico(), HttpStatus.OK);

	}

	@GetMapping("/reporteDetallado")
	public ResponseEntity<ReporteDetalladoDTO> reporteDetallado() {
		return new ResponseEntity<>(equipoFutbolService.reporteDetallado(), HttpStatus.OK);
	}

}
