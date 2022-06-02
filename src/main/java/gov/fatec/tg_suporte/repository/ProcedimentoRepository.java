package gov.fatec.tg_suporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.fatec.tg_suporte.model.Procedimento;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Integer> {
}