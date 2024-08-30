package content;

import java.util.List;

public interface Persistencia<T> {

	void salvar(T entidade);

	void atualizar(T entidade);

	List<T> listar();

	boolean remover(int id);


}