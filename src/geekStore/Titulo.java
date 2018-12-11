package geekStore;

public abstract class Titulo extends Produto {

	private String categoria, editora, ISBN, materialCapa, idioma;
	private double peso;
	private int anoLancamento, paginas;
	
	public Titulo(String id, String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis,
			String categoria, String editora, String iSBN, String materialCapa, String idioma, double peso, 
			int anoLancamento, int paginas) {
		super(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis);
		this.categoria = categoria;
		this.editora = editora;
		ISBN = iSBN;
		this.materialCapa = materialCapa;
		this.idioma = idioma;
		this.peso = peso;
		this.anoLancamento = anoLancamento;
		this.paginas = paginas;
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
		+"\nNumero de Paginas: "+getPaginas());
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getMaterialCapa() {
		return materialCapa;
	}

	public void setMaterialCapa(String materialCapa) {
		this.materialCapa = materialCapa;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}	
	
}
