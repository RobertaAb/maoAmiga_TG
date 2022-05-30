package gov.fatec.tg_suporte.service;
import javax.transaction.Transactional;
import javax.validation.Valid;

import gov.fatec.tg_suporte.dto.ProcedimentoDto;
import gov.fatec.tg_suporte.model.ProcedimentoModel;
import gov.fatec.tg_suporte.repository.ProcedimentoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class ProcedimentoService {

    @Autowired
    ProcedimentoRepository procedimentoRepository;

    @Transactional
    public ProcedimentoModel save(ProcedimentoDto procedimentoDto) {
        var procedimentoModel = new ProcedimentoModel();
        BeanUtils.copyProperties(procedimentoDto, procedimentoModel);
        procedimentoModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return procedimentoRepository.save(procedimentoModel);


    }
}