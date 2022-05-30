package gov.fatec.tg_suporte.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "procedimento")
public class ProcedimentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "solucao", nullable = false)
    private String solucao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private UsuarioModel usuarioModel;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TipoProblemaModel tipoProblemaModel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public TipoProblemaModel getTipoProblemaModel() {
        return tipoProblemaModel;
    }

    public void setTipoProblemaModel(TipoProblemaModel tipoProblemaModel) {
        this.tipoProblemaModel = tipoProblemaModel;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setRegistrationDate(LocalDateTime utc) {
    }
}
