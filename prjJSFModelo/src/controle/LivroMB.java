package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.Livro;

@ManagedBean(name = "livroMB")
@RequestScoped
public class LivroMB {

	// dados da tela
	private Livro livro = new Livro();

	// private LivroDAO dao = new LivroDAO();

	private List<String> editoras;

	// o JSF preisa de um construtor vazio
	// construtores normalmente s�o usados para inicializar valores

	private String tipoLivroSelecionado;
	private String editoraSelecionada;
	private String comentario;

	// Get e Set obrigat�rios no JSF

	public List<String> getEditoras() {
		return editoras;
	}

	public String getTipoLivroSelecionado() {
		return tipoLivroSelecionado;
	}

	public void setTipoLivroSelecionado(String tipoLivroSelecionado) {
		this.tipoLivroSelecionado = tipoLivroSelecionado;
	}

	public String getEditoraSelecionada() {
		return editoraSelecionada;
	}

	public void setEditoraSelecionada(String editoraSelecionada) {
		this.editoraSelecionada = editoraSelecionada;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public void setEditoras(List<String> editoras) {
		this.editoras = editoras;
	}

	private List<Livro> livros;

	public LivroMB() {
		editoras = new ArrayList<String>();
		editoras.add("Saraiva");
		editoras.add("Abril");
		editoras.add("Casa do c�digo");
		editoras.add("Novatech");

		Livro livro1 = new Livro();
		livro1.setAutor("Veloso");
		livro1.setNome("Java para Jedi");

		Livro livro2 = new Livro();
		livro2.setAutor("Jo�o Paulo");
		livro2.setNome("PHP para faixa preta");

		livros = new ArrayList<Livro>();
		livros.add(livro1);
		livros.add(livro2);

	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	// acoes do caso de uso
	public String cadastrar() {
		// fazer o dao chamar salvar livro
		// dao.salvar(livro);
		return "listar";
	}

	// gets e sets
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
