package resolucao.model;

public class ValidacaoTempoExperiencia implements ValidacaoVaga {

    @Override
    public void validar(Candidato candidato, Vaga vaga) {
        int tempoExperienciaCandidato = candidato.getTempoExperiencia();
        int tempoExperienciaMinimo = vaga.getTempoExperiencia();

        if (tempoExperienciaCandidato < tempoExperienciaMinimo) {
            throw new IllegalArgumentException("Candidato não tem o tempo de experiência necessário");
        }
    }
}
