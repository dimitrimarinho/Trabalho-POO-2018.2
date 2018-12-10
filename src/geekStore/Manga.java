package geekStore;

public class Manga extends Titulo {
	
	private String mangaka, personagemPrincipal, ilustrador;
	private int quantidadePublicada;
	private boolean sagaFinalizada;
	
	public Manga(String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis, String categoria,
			String editora, String iSBN, String materialCapa, String idioma, double peso, int anoLancamento, int paginas,
			String mangaka, String personagemPrincipal, String ilustrador, int quantidadePublicada, boolean sagaFinalizada) {
		
		super(nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, editora, iSBN, materialCapa, idioma, peso,
				anoLancamento, paginas);
		this.mangaka = mangaka;
		this.quantidadePublicada = quantidadePublicada;
		this.sagaFinalizada = sagaFinalizada;
		this.ilustrador = ilustrador;
		this.personagemPrincipal = personagemPrincipal;
	}
	
	// Implementar método adicionarItem da interface alterarCarrinho
	public void adicionarItem(Produto manga) {
				
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
		+"\nMangaka: "+getMangaka()
		+"\nPersonagem Principal: "+getPersonagemPrincipal()
		+"Ilustrador: "+getIlustrador()
		+"\nQuantidade Publicada: "+getQuantidadePublicada()
		+"\nSaga Finalizada: "+isSagaFinalizada());
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

	public boolean isSagaFinalizada() {
		return sagaFinalizada;
	}

	public void setSagaFinalizada(boolean sagaFinalizada) {
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
