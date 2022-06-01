package gov.fatec.tg_suporte.controller;
import javax.validation.Valid;

import gov.fatec.tg_suporte.service.ProcedimentoService;
import gov.fatec.tg_suporte.dto.ProcedimentoDto;
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
@RequestMapping("/procedimento")
public class ProcedimentoController {
    @Autowired
    ProcedimentoService procedimentoService;

    @GetMapping("/listarP")
    public List<Procedimento> ListarTodos() {
        return procedimentoService.findAll();
    }
    @PostMapping
    public ResponseEntity<Object> saveProcedimento(@RequestBody @Valid ProcedimentoDto procedimentoDto){
           return ResponseEntity.status(HttpStatus.CREATED).body(procedimentoService.save(procedimentoDto));
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity <?> delete(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value="/{id}")
    public ResponseEntity update(@PathVariable("id") long id,
                                 @RequestBody Usuario usuario) {
        return repository.findById(id)
                .map(record -> {
                    record.setName(usuario.getName());
                    record.setEmail(usuario.getEmail());
                    record.setSenha(usuario.getSenha());
                    Usuario updated = repository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping
    public List findAll(){
        return repository.findAll();
    }
}
}
