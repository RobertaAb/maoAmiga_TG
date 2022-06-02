package gov.fatec.tg_suporte.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "senha", nullable = false)
	private String senha;

	@Column(name = "status", nullable = false)
	private String status;

	@Column(name = "tipo_usuario", nullable = false)
	private String tipo_usuario;

	@Column(name = "deletar", nullable = false)
	private String deletar;

	@Column(name = "atualizar", nullable = false)
	private String atualizar;

	@Column(name = "salvar", nullable = false)
	private String salvar;

}
