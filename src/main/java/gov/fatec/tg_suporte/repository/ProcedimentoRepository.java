package gov.fatec.tg_suporte.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.fatec.tg_suporte.model.ProcedimentoModel;

@Repository
public interface ProcedimentoRepository extends JpaRepository<ProcedimentoModel, UUID> {
}