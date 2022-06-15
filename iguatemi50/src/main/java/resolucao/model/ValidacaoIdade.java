package resolucao.model;

public class ValidacaoIdade implements ValidacaoVaga {

    @Override
    public void validar(Candidato candidato, Vaga vaga) {
        int idadeCandidato = candidato.getIdade();
        if (idadeCandidato < 18) {
            throw new IllegalArgumentException("Candidato possui menos de 18 anos");
        }
    }
}
