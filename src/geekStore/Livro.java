package geekStore;

import javax.swing.JOptionPane;

public class Livro extends Titulo implements AlterarCarrinho {

	private String autor, numeroEdicao;
	
	public Livro(String id, String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis,
			String categoria, String editora, String iSBN, String materialCapa, String idioma, double peso, 
			int anoLancamento, int paginas, String autor, String numeroEdicao) {
		
		super(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, editora, iSBN, materialCapa,
				idioma, peso, anoLancamento, paginas);
		this.autor = autor;
		this.numeroEdicao = numeroEdicao;
	}
	
	
	public void adicionarItem(Produto livro) {
		if(livro.isDisponibilidade() == true)
			CarrinhoCompra.adicionarProduto(livro);
		else 
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
	}
	
	
	public boolean removerItem(Produto livro) {
		return CarrinhoCompra.removerProduto(livro);
	}	
	
	@Override
	public String toString() {
		return("Titulo: "+super.getNome()
		+"\nDescricao: "+super.getDescricao()
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