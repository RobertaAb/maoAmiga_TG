package gov.fatec.tg_suporte.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "procedimento")
public class ProcedimentoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@Column(name = "descricao", nullable = false)
	private String descricao;

	@Column(name = "solucao", nullable = false)
	private String solucao;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private UsuarioModel usuarioModel;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private TipoProblemaModel tipoProblemaModel;

}
