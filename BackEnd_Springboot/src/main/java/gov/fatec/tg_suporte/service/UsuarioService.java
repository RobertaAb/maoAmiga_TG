package gov.fatec.tg_suporte.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.fatec.tg_suporte.model.UsuarioModel;
import gov.fatec.tg_suporte.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Transactional
	public UsuarioModel save(UsuarioModel usuarioDto) {
		return usuarioRepository.save(usuarioDto);

	}

	public List<UsuarioModel> findAll() {
		return usuarioRepository.findAll();
	}

	public void delete(UUID id) {

		usuarioRepository.deleteById(id);

	}

}