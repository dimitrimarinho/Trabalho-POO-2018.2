 

public class Games extends Produto {

	private String categoria, plataforma, desenvolvedora, dataLancamento, idioma, legenda, resolucao, adicional;
	private int idadeRecomendada;
	// Quais outros atributos colocar para Games ?
	
	public Games(String nome, String descricao, double preco, boolean disponibilidade, String categoria,
			String plataforma, String desenvolvedora, String dataLancamento, String idioma, String legenda,
			String resolucao, String adicional, int idadeRecomendada) {
		super(nome, descricao, preco, disponibilidade);
		this.categoria = categoria;
		this.plataforma = plataforma;
		this.desenvolvedora = desenvolvedora;
		this.dataLancamento = dataLancamento;
		this.idioma = idioma;
		this.legenda = legenda;
		this.resolucao = resolucao;
		this.adicional = adicional;
		this.idadeRecomendada = idadeRecomendada;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public String getAdicional() {
		return adicional;
	}

	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	public int getIdadeRecomendada() {
		return idadeRecomendada;
	}

	public void setIdadeRecomendada(int idadeRecomendada) {
		this.idadeRecomendada = idadeRecomendada;
	}
	
}