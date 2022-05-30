package gov.fatec.tg_suporte.service;

import gov.fatec.tg_suporte.repository.TipoProblemaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TipoProblemaService {

    final TipoProblemaRepository tipoProblemaRepository;

    public TipoProblemaService(TipoProblemaRepository tipoProblemaRepository) {
        this.tipoProblemaRepository = tipoProblemaRepository;
    }

}
