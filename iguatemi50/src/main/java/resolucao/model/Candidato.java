package resolucao.model;

import java.util.List;

public class Candidato {

    private String nome;
    private int tempoExperiencia;
    private int idade;
    private List<Tecnologias> tecnologiasDominadas;
    private boolean ensinoSuperior;

    public Candidato(String nome, int tempoExperiencia, int idade, List<Tecnologias> tecnologiasDominadas, boolean ensinoSuperior) {
        this.nome = nome;
        this.tempoExperiencia = tempoExperiencia;
        this.idade = idade;
        this.tecnologiasDominadas = tecnologiasDominadas;
        this.ensinoSuperior = ensinoSuperior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Tecnologias> getTecnologiasDominadas() {
        return tecnologiasDominadas;
    }

    public void setTecnologiasDominadas(List<Tecnologias> tecnologiasDominadas) {
        this.tecnologiasDominadas = tecnologiasDominadas;
    }

    public boolean isEnsinoSuperior() {
        return ensinoSuperior;
    }

    public void setEnsinoSuperior(boolean ensinoSuperior) {
        this.ensinoSuperior = ensinoSuperior;
    }
}
