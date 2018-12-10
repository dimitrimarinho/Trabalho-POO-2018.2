package geekStore;

public class Livro extends Titulo {

	private String autor, numeroEdicao;
	
	public Livro(String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis,
			String categoria, String editora, String iSBN, String materialCapa, String idioma, double peso, 
			int anoLancamento, int paginas, String autor, String numeroEdicao) {
		
		super(nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, editora, iSBN, materialCapa,
				idioma, peso, anoLancamento, paginas);
		this.autor = autor;
		this.numeroEdicao = numeroEdicao;
	}
	
	// Implementar método adicionarItem da interface alterarCarrinho
	@Override
	public void adicionarItem(Produto livro) {
			
	}
	
	// Implementar método removerItem da interface alterarCarrinho
	@Override
	public boolean removerItem(Produto livro) {
		// TODO Auto-generated method stub
		return false;
	}	
	
	@Override
	public String toString() {
		return("Titulo: "+super.getNome()
		+"\nDescri��o: "+super.getDescricao()
		+"\nPreco: "+super.getPreco()
		+"\nDisponibilidade: "+super.isDisponibilidade()
		+"\nUnidades: "+super.getUnidadesDisponiveis()
		+"\nCategoria: "+getCategoria()
		+"\nEditora: "+getEditora()
		+"\nISBN: "+getISBN()
		+"\nMaterial da Capa: "+getMaterialCapa()
		+"\nIdioma: "+getIdioma()
		+"\nPeso: "+getPeso()
		+"\nAno de Lancamento: "+getAnoLancamento()
		+"\nNumero de Paginas: "+getPaginas()
		+"\nAutor: "+getAutor()
		+"\nEdicao: "+getNumeroEdicao());
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNumeroEdicao() {
		return numeroEdicao;
	}

	public void setNumeroEdicao(String numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	
}
