public class Livro extends Titulo {

	private String autor;
	private int numeroEdicao;

	public Livro(String nome, String descricao, double preco, boolean disponibilidade, String categoria,
			String editora, String iSBN, String materialCapa, String idioma, double peso, int anoLancamento,
			int paginas, String autor, int numeroEdicao) {
		super(nome, descricao, preco, disponibilidade, categoria, editora, iSBN, materialCapa, idioma, peso,
				anoLancamento, paginas);
		this.autor = autor;
		this.numeroEdicao = numeroEdicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroEdicao() {
		return numeroEdicao;
	}

	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}

}
