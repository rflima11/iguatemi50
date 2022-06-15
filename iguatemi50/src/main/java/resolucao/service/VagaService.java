package resolucao.service;

import resolucao.model.Candidato;
import resolucao.model.Vaga;
import resolucao.model.ValidacaoTempoExperiencia;
import resolucao.model.ValidacaoVaga;

import java.util.List;

public class VagaService {

    private List<ValidacaoVaga> validacoes;

    public VagaService(List<ValidacaoVaga> validacoes) {
        this.validacoes = validacoes;
    }

    public boolean registrarCandidato(Candidato candidato, Vaga vaga) {
        validacoes.stream().forEach(validacao ->  {
            validacao.validar(candidato, vaga);
        });
        return true;
    }

}
