package geekStore;

import javax.swing.JOptionPane;

public class Manga extends Titulo implements AlterarCarrinho {
	
	private String mangaka, personagemPrincipal, ilustrador, sagaFinalizada;
	private int quantidadePublicada;
	
	
	public Manga(String id, String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis, String categoria,
			String editora, String iSBN, String materialCapa, String idioma, double peso, int anoLancamento, int paginas,
			String mangaka, String personagemPrincipal, String ilustrador, int quantidadePublicada, String sagaFinalizada) {
		
		super(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, editora, iSBN, materialCapa, idioma, peso,
				anoLancamento, paginas);
		this.mangaka = mangaka;
		this.quantidadePublicada = quantidadePublicada;
		this.sagaFinalizada = sagaFinalizada;
		this.ilustrador = ilustrador;
		this.personagemPrincipal = personagemPrincipal;
	}
	
	
	public void adicionarItem(Produto manga) {
		int verif = JOptionPane.DEFAULT_OPTION, dec = manga.getUnidadesDisponiveis(), quant;
		String verif2 = "M";
		if(manga.isDisponibilidade() == true) {
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
						CarrinhoCompra.adicionarProduto(manga,quant);
						JOptionPane.showMessageDialog(null, "     Produto Adicionado!");
						manga.setUnidadesDisponiveis(dec - quant);
						if(manga.getUnidadesDisponiveis() == 0) {
							manga.setDisponibilidade(false);
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
		+"\nMangaka: "+getMangaka()
		+"\nPersonagem Principal: "+getPersonagemPrincipal()
		+"Ilustrador: "+getIlustrador()
		+"\nQuantidade Publicada: "+getQuantidadePublicada()
		+"\nSaga Finalizada: "+getSagaFinalizada());
	}
	

	public String getMangaka() {
		return mangaka;
	}

	public void setMangaka(String mangaka) {
		this.mangaka = mangaka;
	}

	public int getQuantidadePublicada() {
		return quantidadePublicada;
	}

	public void setQuantidadePublicada(int quantidadePublicada) {
		this.quantidadePublicada = quantidadePublicada;
	}


	public String getSagaFinalizada() {
		return sagaFinalizada;
	}


	public void setSagaFinalizada(String sagaFinalizada) {
		this.sagaFinalizada = sagaFinalizada;
	}


	public String getPersonagemPrincipal() {
		return personagemPrincipal;
	}

	public void setPersonagemPrincipal(String personagemPrincipal) {
		this.personagemPrincipal = personagemPrincipal;
	}

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}
	
	
}