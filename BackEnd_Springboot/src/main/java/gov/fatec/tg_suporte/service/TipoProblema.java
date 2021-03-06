package gov.fatec.tg_suporte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.fatec.tg_suporte.model.TipoProblema;
import gov.fatec.tg_suporte.repository.TipoProblemaRepository;

@Service
public class TipoProblema {

	@Autowired
	TipoProblemaRepository tipoProblemaRepository;

	public TipoProblema(TipoProblemaRepository tipoProblemaRepository) {
		this.tipoProblemaRepository = tipoProblemaRepository;
	}

	public List<TipoProblema> findAll() {
		return tipoProblemaRepository.findAll();
	}

	public TipoProblema save(TipoProblema tipoProblemaModel) {
		return tipoProblemaRepository.save(tipoProblemaModel);
	}

}
