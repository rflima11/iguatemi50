package resolucao.model;

import java.util.Arrays;
import java.util.List;

public class ValidacoesPadroes {

    public static List<ValidacaoVaga> getValidacoesPadroes() {
        return Arrays.asList(new ValidacaoIdade(),
                new ValidacaoEnsinoSuperior(),
                new ValidacaoTecnologiasObrigatorias(),
                new ValidacaoTempoExperiencia());
    }
}
