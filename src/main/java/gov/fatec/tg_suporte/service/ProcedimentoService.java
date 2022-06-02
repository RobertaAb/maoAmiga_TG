package gov.fatec.tg_suporte.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.fatec.tg_suporte.model.Procedimento;
import gov.fatec.tg_suporte.repository.ProcedimentoRepository;

@Service
public class ProcedimentoService {

	@Autowired
	ProcedimentoRepository procedimentoRepository;

	@Transactional
	public Procedimento save(Procedimento procedimento) {
		return procedimentoRepository.save(procedimento);

	}

	public List<Procedimento> findAll() {
		return procedimentoRepository.findAll();
	}

	public void delete(Integer id) {

		procedimentoRepository.deleteById(id);

	}
}