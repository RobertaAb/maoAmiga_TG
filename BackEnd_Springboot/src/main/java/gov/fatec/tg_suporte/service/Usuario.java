package gov.fatec.tg_suporte.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.fatec.tg_suporte.model.Usuario;
import gov.fatec.tg_suporte.repository.UsuarioRepository;

@Service
public class Usuario {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Transactional
	public Usuario save(Usuario usuarioDto) {
		return usuarioRepository.save(usuarioDto);

	}

	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public void delete(Integer id) {

		usuarioRepository.deleteById(id);

	}

}