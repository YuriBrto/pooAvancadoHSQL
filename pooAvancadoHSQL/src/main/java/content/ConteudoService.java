package content;

import java.util.List;

public class ConteudoService {
	private Persistencia<Conteudo> persistencia;

    public ConteudoService(Persistencia<Conteudo> persistencia) {
		this.persistencia = persistencia;
	}

	public void salvar(Conteudo conteudo) {
		persistencia.salvar(conteudo);
    }

    
	public void atualizarConteudo(int id, String titulo, String texto, Usuario autor) {
		persistencia.atualizar(new Conteudo(id, titulo, texto, autor));
    }

	public List<Conteudo> listarConteudos() {
		return persistencia.listar();
    }

	public boolean removerConteudo(int id) {
		return persistencia.remover(id);
    }

}
