package geekStore;

import javax.swing.JOptionPane;

public class Quadrinho extends Titulo implements AlterarCarrinho {

	private String nacionalidade, personagemPrincipal, ilustrador, licenciador;
	private boolean sagaFinalizada;
	
	public Quadrinho(String id, String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis,
			String categoria, String editora, String iSBN, String materialCapa, String idioma, double peso, 
			int anoLancamento, int paginas, String nacionalidade, String personagemPrincipal, boolean sagaFinalizada,
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
		if(quadrinho.isDisponibilidade() == true)
			CarrinhoCompra.adicionarProduto(quadrinho);
		else 
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
	}
	
	
	public boolean removerItem(Produto quadrinho) {
		return CarrinhoCompra.removerProduto(quadrinho);
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
		+"\nNacionalidade: "+getNacionalidade()
		+"\nPersonagem Principal: "+getPersonagemPrincipal()
		+"\nLicenciador: "+getLicenciador()
		+"\nIlustrador: "+getIlustrador()
		+"\nSaga Finalizada: "+isSagaFinalizada());
		
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

	public boolean isSagaFinalizada() {
		return sagaFinalizada;
	}

	public void setSagaFinalizada(boolean sagaFinalizada) {
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

