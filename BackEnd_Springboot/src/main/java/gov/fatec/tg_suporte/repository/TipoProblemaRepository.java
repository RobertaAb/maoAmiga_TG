package gov.fatec.tg_suporte.repository;

import gov.fatec.tg_suporte.model.ProcedimentoModel;
import gov.fatec.tg_suporte.model.TipoProblemaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TipoProblemaRepository extends JpaRepository<TipoProblemaModel, UUID> {

    @Query("SELECT p FROM Procedimento p WHERE p.titulo = ?1")
    ProcedimentoModel findProcedimentoById(String titulo);

    @Query("SELECT t FROM TipoProblema t WHERE t.tipo_problema = ?1")
    TipoProblemaModel findTipoProblemaById(String tipo_problema);

}