package gov.fatec.tg_suporte.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.fatec.tg_suporte.model.TipoProblemaModel;
import gov.fatec.tg_suporte.service.TipoProblemaService;

//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/tipoProblema")
public class TipoProblemaController {

	@Autowired
	TipoProblemaService tipoProblemaService;

	@GetMapping
	public List<TipoProblemaModel> ListarTodos() {
		return tipoProblemaService.findAll();
	}

	@PostMapping
	public ResponseEntity<?> saveTipoProblema(@RequestBody @Valid TipoProblemaModel tipoProblemaModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(tipoProblemaService.save(tipoProblemaModel));
	}
}