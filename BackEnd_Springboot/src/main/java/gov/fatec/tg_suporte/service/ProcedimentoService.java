package gov.fatec.tg_suporte.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.fatec.tg_suporte.model.ProcedimentoModel;
import gov.fatec.tg_suporte.repository.ProcedimentoRepository;

@Service
public class ProcedimentoService {

	@Autowired
	ProcedimentoRepository procedimentoRepository;

	@Transactional
	public ProcedimentoModel save(ProcedimentoModel procedimentoDto) {
		return procedimentoRepository.save(procedimentoDto);

	}

	public List<ProcedimentoModel> findAll() {
		return procedimentoRepository.findAll();
	}

	public void delete(UUID id) {

		procedimentoRepository.deleteById(id);

	}
}