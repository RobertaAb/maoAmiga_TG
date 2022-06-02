package gov.fatec.tg_suporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.fatec.tg_suporte.model.TipoProblema;

@Repository
public interface TipoProblemaRepository extends JpaRepository<TipoProblema, Integer> {

}