package gov.fatec.tg_suporte.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gov.fatec.tg_suporte.model.ProcedimentoModel;
import gov.fatec.tg_suporte.service.ProcedimentoService;

//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/procedimento")
public class ProcedimentoController {

	@Autowired
	ProcedimentoService procedimentoService;

	@GetMapping
	public List<ProcedimentoModel> ListarTodos() {
		return procedimentoService.findAll();
	}

	@PostMapping
	public ResponseEntity<?> saveProcedimento(@RequestBody @Valid ProcedimentoModel procedimento) {
		return ResponseEntity.status(HttpStatus.CREATED).body(procedimentoService.save(procedimento));
	}

	@DeleteMapping
	public ResponseEntity<?> delete(@RequestParam UUID id) {
		procedimentoService.delete(id);
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);

	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody ProcedimentoModel procedimento) {
		return ResponseEntity.status(HttpStatus.CREATED).body(procedimentoService.save(procedimento));
	}
}
