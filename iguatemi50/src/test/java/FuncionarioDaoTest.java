import integracao.dao.FuncionarioDao;
import integracao.model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

public class FuncionarioDaoTest {

    private FuncionarioDao funcionarioDao;

    @BeforeEach
    public void setUp() {
        funcionarioDao = new FuncionarioDao();
    }

    @Test
    public void deveSucessoAoRegistrarUmNovoUsuario() {
        //cenario
        Funcionario funcionario = new Funcionario("Adamastor", 3000d);

        //execucao
        Funcionario funcionarioSalvo = funcionarioDao.salvar(funcionario);

        //validacao
        Assertions.assertNotNull(funcionarioSalvo);
        Assertions.assertNotNull(funcionarioSalvo.getId());
    }

    @Test
    public void deveSucessoQuandoEncontraFuncionarioPeloId() {
        Funcionario funcionario = new Funcionario("Ezequiel", 3000d);

        Funcionario funcionarioSalvo = funcionarioDao.salvar(funcionario);
        Optional<Funcionario> funcionarioProcurado = funcionarioDao.encontrarPeloId(funcionarioSalvo.getId());

        Assertions.assertTrue(funcionarioProcurado.isPresent());
        Assertions.assertEquals(funcionarioSalvo.getId(), funcionarioProcurado.get().getId());
    }

    @Test
    public void deveSucessoAoExcluirUmFuncionario() {
        //cenario
        Funcionario funcionario = new Funcionario("Adalberto", 5000d);

        Funcionario funcionarioSalvo = funcionarioDao.salvar(funcionario);

        funcionarioDao.remover(funcionarioSalvo.getId());
        Optional<Funcionario> funcionarioProcurado = funcionarioDao.encontrarPeloId(funcionarioSalvo.getId());

        Assertions.assertTrue(funcionarioProcurado.isEmpty());
    }

    @Test
    public void deveSucessoAoAtualizarUmFuncionario() {
        Funcionario funcionario = new Funcionario("Stanley", 6000d);
        Funcionario funcionarioSalvo = funcionarioDao.salvar(funcionario);
        String nomeAntigo = funcionario.getNome();
        funcionarioSalvo.setNome("Stanley Editado");

        Funcionario funcionarioEditado = funcionarioDao.atualizar(funcionarioSalvo);

        Assertions.assertNotEquals(nomeAntigo, funcionarioEditado.getNome());
        Assertions.assertEquals(funcionarioSalvo.getId(), funcionarioEditado.getId());
    }

    @Test
    public void deveSucessoAoListarFuncionarios() {
        List<Funcionario> funcionarioList = funcionarioDao.getList();

        Assertions.assertFalse(funcionarioList.isEmpty());
    }

    @Test
    public void deveSucessoAoBuscarPeloIdENaoExistirFuncionario() {
        Funcionario funcionarioNovo = new Funcionario("Helena", 2000d);
        Funcionario funcionarioSalvo = funcionarioDao.salvar(funcionarioNovo);
        Long idFuncionario = funcionarioSalvo.getId();
        funcionarioDao.remover(idFuncionario);
        Optional<Funcionario> funcionarioRemovido = funcionarioDao.encontrarPeloId(idFuncionario);

        Assertions.assertTrue(funcionarioRemovido.isEmpty());
    }

    @Test
    public void deveErroAoExcluirUmFuncionarioQueNaoExiste() {
        Funcionario funcionario = new Funcionario("Carlos", 3000d);

        Assertions.assertThrows(IllegalStateException.class, () -> {
            funcionarioDao.remover(999L);
        });
    }


}
