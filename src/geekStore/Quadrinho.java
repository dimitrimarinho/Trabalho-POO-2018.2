package geekStore;

import javax.swing.JOptionPane;

public class Quadrinho extends Titulo implements AlterarCarrinho {

	private String nacionalidade, personagemPrincipal, ilustrador, licenciador, sagaFinalizada;
	
	public Quadrinho(String id, String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis,
			String categoria, String editora, String iSBN, String materialCapa, String idioma, double peso, 
			int anoLancamento, int paginas, String nacionalidade, String personagemPrincipal, String sagaFinalizada,
			String ilustrador, String licenciador) {
		
		super(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, editora, iSBN, materialCapa, idioma,
				peso, anoLancamento, paginas);
		this.nacionalidade = nacionalidade;
		this.personagemPrincipal = personagemPrincipal;
		this.sagaFinalizada = sagaFinalizada;
		this.ilustrador = ilustrador;
		this.licenciador = licenciador;
	}
	
	
	public void adicionarItem(Produto quadrinho) {
		int verif = JOptionPane.DEFAULT_OPTION, dec = quadrinho.getUnidadesDisponiveis(), quant;
		String verif2 = "M";
		if(quadrinho.isDisponibilidade() == true) {
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
						CarrinhoCompra.adicionarProduto(quadrinho,quant);
						JOptionPane.showMessageDialog(null, "     Produto Adicionado!");
						quadrinho.setUnidadesDisponiveis(dec - quant);
						if(quadrinho.getUnidadesDisponiveis() == 0) {
							quadrinho.setDisponibilidade(false);
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
		+"\nNacionalidade: "+getNacionalidade()
		+"\nPersonagem Principal: "+getPersonagemPrincipal()
		+"\nLicenciador: "+getLicenciador()
		+"\nIlustrador: "+getIlustrador()
		+"\nSaga Finalizada: "+getSagaFinalizada());
		
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getPersonagemPrincipal() {
		return personagemPrincipal;
	}

	public void setPersonagemPrincipal(String personagemPrincipal) {
		this.personagemPrincipal = personagemPrincipal;
	}


	public String getSagaFinalizada() {
		return sagaFinalizada;
	}


	public void setSagaFinalizada(String sagaFinalizada) {
		this.sagaFinalizada = sagaFinalizada;
	}


	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}

	public String getLicenciador() {
		return licenciador;
	}

	public void setLicenciador(String licenciador) {
		this.licenciador = licenciador;
	}

}

