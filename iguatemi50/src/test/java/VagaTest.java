import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import resolucao.model.*;
import resolucao.service.VagaService;
import utils.TestUtils;

import java.util.Arrays;
import java.util.Collections;

public class VagaTest {


    private VagaService vagaService;

    @BeforeEach
    public void setUp() {
        vagaService = new VagaService(ValidacoesPadroes.getValidacoesPadroes());
    }

    @Test
    public void deveSucessoAoRegistrarVaga() {
        //cenário
        Vaga vaga = TestUtils.getVagaPadrao();
        Candidato candidato = TestUtils.getCandidatoPadrao();

        //execução
        boolean resultado = vagaService.registrarCandidato(candidato, vaga);

        //verificação
        Assertions.assertTrue(resultado);
        Assertions.assertDoesNotThrow(() -> new IllegalArgumentException());
    }

    @Test
    public void deveSucessoAoCandidatoNaoPassarNaVagaSemTecnologias() {
        Vaga vaga = TestUtils.getVagaPadrao();
        Candidato candidato = TestUtils.getCandidatoPadrao();
        candidato.setTecnologiasDominadas(Arrays.asList(Tecnologias.DOCKER));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            boolean resultadoVaga = vagaService.registrarCandidato(candidato, vaga);
        });
    }

    @Test
    public void deveSucessoAoCandidatoNaoPassarNaVagaSemIdadeMinima() {
        Vaga vaga = TestUtils.getVagaPadrao();

        Candidato candidato = TestUtils.getCandidatoPadrao();
        candidato.setIdade(17);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            boolean resultadoVaga = vagaService.registrarCandidato(candidato, vaga);
        });
    }

    @Test
    public void deveSucessoAoCandidatoNaoPassarNaVagaSemTempoExp() {
        Vaga vaga = TestUtils.getVagaPadrao();

        Candidato candidato = TestUtils.getCandidatoPadrao();
        candidato.setTempoExperiencia(2);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            boolean resultadoVaga = vagaService.registrarCandidato(candidato, vaga);
        });
    }

    @Test
    public void deveSucessoAoCandidatoNaoPassarNaVagaSemEnsinoSuperior() {
        Vaga vaga = TestUtils.getVagaPadrao();

        Candidato candidato = TestUtils.getCandidatoPadrao();
        candidato.setEnsinoSuperior(false);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            boolean resultadoVaga = vagaService.registrarCandidato(candidato, vaga);
        });
    }

    @Test
    public void deveSucessoAoCandidatoSemNenhumaExperienciaNaoPassarNaVaga() {
        Vaga vaga = TestUtils.getVagaPadrao();
        Candidato candidato = TestUtils.getCandidatoPadrao();
        candidato.setTecnologiasDominadas(Collections.emptyList());

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            boolean resultadoVaga = vagaService.registrarCandidato(candidato, vaga);
        });
    }

}
