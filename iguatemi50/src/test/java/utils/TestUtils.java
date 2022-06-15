package utils;

import resolucao.model.Candidato;
import resolucao.model.Tecnologias;
import resolucao.model.Vaga;

import java.util.Arrays;

public class TestUtils {

    public static Vaga getVagaPadrao() {
        return new Vaga("DevOPS",
                "Sofrer",
                "SP",
                3,
                Arrays.asList(Tecnologias.KUBERNETES, Tecnologias.DOCKER),
                Arrays.asList(Tecnologias.JAVA),
                true,
                "VA VR VT");
    }

    public static Candidato getCandidatoPadrao() {
        return new Candidato(
                "Boris",
                3,
                19,
                Arrays.asList(Tecnologias.KUBERNETES, Tecnologias.DOCKER),
                true);

    }


}
