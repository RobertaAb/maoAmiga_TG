package gov.fatec.tg_suporte.service;
import javax.transaction.Transactional;

import gov.fatec.tg_suporte.dto.UsuarioDto;
import gov.fatec.tg_suporte.model.UsuarioModel;
import gov.fatec.tg_suporte.repository.UsuarioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional
    public UsuarioModel save(UsuarioDto usuarioDto) {
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarioModel);
        return usuarioRepository.save(usuarioModel);

    }


}