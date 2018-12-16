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
		int verif = JOptionPane.DEFAULT_OPTION, dec = livro.getUnidadesDisponiveis(), quant;
		String verif2 = "M";
		if(livro.isDisponibilidade() == true) {
			verif = JOptionPane.showConfirmDialog(null, "Deseja Adicionar o Produto Ao Carrinho?");
			if(verif == JOptionPane.YES_OPTION) {
				while(verif2.equals("M") ) {
					try {
						quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade do Produto:"));
					}catch(NumberFormatException ex) {
						throw new NumberFormatException("A Quantidade Deve Ser Um Numero Inteiro");
					}
					
					if(quant <= 0) {
						throw new IllegalArgumentException("A Quantidade Deve Ser Um Numero Inteiro Positivo");
					}
					
					if(quant >= 1 && quant <= dec ) {
						CarrinhoCompra.adicionarProduto(livro,quant);
						JOptionPane.showMessageDialog(null, "     Produto Adicionado!");
						livro.setUnidadesDisponiveis(dec - quant);
						if(livro.getUnidadesDisponiveis() == 0) {
							livro.setDisponibilidade(false);
						}
						verif2 = "OK";
					}else {
						JOptionPane.showMessageDialog(null, "     Quantidade Invalida!");
					}
				}
			}
		}else 
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");	
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
		+"\nPeso: "+getPeso() + "kg"
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