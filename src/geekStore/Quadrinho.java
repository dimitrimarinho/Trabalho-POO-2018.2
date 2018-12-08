package geekStore;

public class Quadrinho extends Titulos {

	private String nacionalidade, personagemPrincipal;
	private boolean sagaFinalizada;
	
	public Quadrinho(String nome, String descricao, double preco, boolean disponibilidade, String categoria,
			String editora, String iSBN, String materialCapa, String idioma, double peso, int anoLancamento,
			int paginas, String nacionalidade, String personagemPrincipal, boolean sagaFinalizada) {
		super(nome, descricao, preco, disponibilidade, categoria, editora, iSBN, materialCapa, idioma, peso,
				anoLancamento, paginas);
		this.nacionalidade = nacionalidade;
		this.personagemPrincipal = personagemPrincipal;
		this.sagaFinalizada = sagaFinalizada;
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
	
}