package resolucao.model;

public class ValidacaoEnsinoSuperior implements ValidacaoVaga{

    @Override
    public void validar(Candidato candidato, Vaga vaga) {
        boolean necessarioEnsinoSuperior = vaga.precisaEnsinoSuperior();
        boolean candidatoTemEnsinoSuperior = candidato.isEnsinoSuperior();

        if (necessarioEnsinoSuperior && (!candidatoTemEnsinoSuperior)) {
            throw new IllegalArgumentException("Candidato não possui ensino superior");
        }
    }
}
