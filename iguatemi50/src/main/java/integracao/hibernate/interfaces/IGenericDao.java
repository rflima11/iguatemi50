package integracao.hibernate.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface IGenericDao<T, I extends Serializable> {

    /**
     * Salvar uma entidade
     *
     * @param entity
     * @return
     */
    T salvar(T entity);

    /**
     * Atualizar uma entidade
     *
     * @param entity
     * @return
     */
    T atualizar(T entity);

    /**
     * Remover uma entidade
     *
     * @param id
     */
    void remover(I id);

    /**
     * Obter uma Lista
     *
     * @return
     */
    List<T> getList();

    /**
     * Encontar um registro pelo id
     *
     * @param id
     * @return
     */
    Optional<T> encontrarPeloId(I id);


}
