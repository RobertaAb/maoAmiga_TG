package gov.fatec.tg_suporte.controller;

import java.util.List;

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

import gov.fatec.tg_suporte.model.Usuario;
import gov.fatec.tg_suporte.service.Usuario;

//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	Usuario usuarioService;

	@GetMapping
	public List<Usuario> ListarTodos() {
		return usuarioService.findAll();
	}

	@PostMapping
	public ResponseEntity<Object> saveUsuario(@RequestBody @Valid Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuario));
	}

	@DeleteMapping
	public ResponseEntity<?> delete(@RequestParam Integer id) {
		usuarioService.delete(id);
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.save(usuario));
	}

}