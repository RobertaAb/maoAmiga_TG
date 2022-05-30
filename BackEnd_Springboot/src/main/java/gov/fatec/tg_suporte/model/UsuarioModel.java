package gov.fatec.tg_suporte.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeletar() {
		return deletar;
	}

	public void setDeletar(String deletar) {
		this.deletar = deletar;
	}

	public String getAtualizar() {
		return atualizar;
	}

	public void setAtualizar(String atualizar) {
		this.atualizar = atualizar;
	}

	public String getSalvar() {
		return salvar;
	}

	public void setSalvar(String salvar) {
		this.salvar = salvar;
	}

}
