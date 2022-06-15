package resolucao.model;

import resolucao.service.VagaService;

import java.util.Arrays;

public class Controller {


    public static void main(String[] args) {

        Vaga vaga = new Vaga("DevOPS",
                "Sofrer",
                "SP",
                3,
                Arrays.asList(Tecnologias.KUBERNETES, Tecnologias.DOCKER),
                Arrays.asList(Tecnologias.JAVA),
                true,
                "VA VR VT");

        Candidato candidato = new Candidato(
                "Boris",
                3,
                19,
                Arrays.asList(Tecnologias.KUBERNETES, Tecnologias.DOCKER),
                true);

        VagaService vagaService = new VagaService(ValidacoesPadroes.getValidacoesPadroes());

        vagaService.registrarCandidato(candidato, vaga);

    }

}
