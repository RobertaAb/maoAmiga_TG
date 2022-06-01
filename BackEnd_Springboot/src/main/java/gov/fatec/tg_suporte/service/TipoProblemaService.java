package gov.fatec.tg_suporte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.fatec.tg_suporte.model.TipoProblemaModel;
import gov.fatec.tg_suporte.repository.TipoProblemaRepository;

@Service
public class TipoProblemaService {

	@Autowired
	TipoProblemaRepository tipoProblemaRepository;

	public TipoProblemaService(TipoProblemaRepository tipoProblemaRepository) {
		this.tipoProblemaRepository = tipoProblemaRepository;
	}

	public List<TipoProblemaModel> findAll() {
		return tipoProblemaRepository.findAll();
	}

	public TipoProblemaModel save(TipoProblemaModel tipoProblemaModel) {
		return tipoProblemaRepository.save(tipoProblemaModel);
	}

}
