package gov.fatec.tg_suporte.controller;

import javax.validation.Valid;

import gov.fatec.tg_suporte.service.UsuarioService;
import gov.fatec.tg_suporte.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

        @PostMapping
        public ResponseEntity<Object> saveUsuario(@RequestBody @Valid UsuarioDto usuarioDto){
                return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuarioDto));
        }

    }