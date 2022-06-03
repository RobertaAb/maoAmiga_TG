package gov.fatec.tg_suporte.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.fatec.tg_suporte.model.ProcedimentoModelo;
import gov.fatec.tg_suporte.repository.ProcedimentoRepository;

@Service
public class Procedimento {

	@Autowired
	Procedimento procedimentoRepository;

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