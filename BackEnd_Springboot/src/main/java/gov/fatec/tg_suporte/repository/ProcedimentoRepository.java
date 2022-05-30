package gov.fatec.tg_suporte.repository;

import gov.fatec.tg_suporte.model.ProcedimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProcedimentoRepository extends JpaRepository<ProcedimentoModel, UUID> {
}