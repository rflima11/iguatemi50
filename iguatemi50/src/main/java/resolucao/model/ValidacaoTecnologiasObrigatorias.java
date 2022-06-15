package resolucao.model;

import java.util.List;

public class ValidacaoTecnologiasObrigatorias implements ValidacaoVaga {

    @Override
    public void validar(Candidato candidato, Vaga vaga) {
        List<Tecnologias> tecnologiasObrigatorias = vaga.getTecnologiasObrigatorias();
        List<Tecnologias> tecnologiasCandidato = candidato.getTecnologiasDominadas();

        if (!tecnologiasCandidato.containsAll(tecnologiasObrigatorias)) {
            throw new IllegalArgumentException("Candidato não domina as tecnologias");
        }
    }
}
