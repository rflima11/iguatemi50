package resolucao.model;

import java.util.List;

public class Vaga {

    private String titulo;
    private String descricao;
    private String localAtuacao;
    private int tempoExperiencia;
    private List<Tecnologias> tecnologiasObrigatorias;
    private List<Tecnologias> tecnologiasDiferenciais;
    private boolean ensinoSuperior;
    private String beneficios;

    public Vaga(String titulo, String descricao, String localAtuacao, int tempoExperiencia, List<Tecnologias> tecnologiasObrigatorias, List<Tecnologias> tecnologiasDiferenciais, boolean ensinoSuperior, String beneficios) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.localAtuacao = localAtuacao;
        this.tempoExperiencia = tempoExperiencia;
        this.tecnologiasObrigatorias = tecnologiasObrigatorias;
        this.tecnologiasDiferenciais = tecnologiasDiferenciais;
        this.ensinoSuperior = ensinoSuperior;
        this.beneficios = beneficios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalAtuacao() {
        return localAtuacao;
    }

    public void setLocalAtuacao(String localAtuacao) {
        this.localAtuacao = localAtuacao;
    }

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }

    public List<Tecnologias> getTecnologiasObrigatorias() {
        return tecnologiasObrigatorias;
    }

    public void setTecnologiasObrigatorias(List<Tecnologias> tecnologiasObrigatorias) {
        this.tecnologiasObrigatorias = tecnologiasObrigatorias;
    }

    public List<Tecnologias> getTecnologiasDiferenciais() {
        return tecnologiasDiferenciais;
    }

    public void setTecnologiasDiferenciais(List<Tecnologias> tecnologiasDiferenciais) {
        this.tecnologiasDiferenciais = tecnologiasDiferenciais;
    }

    public boolean precisaEnsinoSuperior() {
        return ensinoSuperior;
    }

    public void setEnsinoSuperior(boolean ensinoSuperior) {
        this.ensinoSuperior = ensinoSuperior;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}
