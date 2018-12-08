package geekStore;

public class Colecionaveis extends Produto {

	private String categoria, dimensoes, conteudoCaixa, material, marca;
	private double peso;
	// Quais atributos colocar em colecionáveis ?
	
	public Colecionaveis(String nome, String descricao, String categoria, double preco, boolean disponibilidade,
			String categoriaColecionavel, String dimensoes, String conteudoCaixa, String material, String marca,
			double peso) {
		super(nome, descricao, preco, disponibilidade);
		this.categoria = categoria;
		this.dimensoes = dimensoes;
		this.conteudoCaixa = conteudoCaixa;
		this.material = material;
		this.marca = marca;
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoriaColecionavel(String categoria) {
		this.categoria = categoria;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

	public String getConteudoCaixa() {
		return conteudoCaixa;
	}

	public void setConteudoCaixa(String conteudoCaixa) {
		this.conteudoCaixa = conteudoCaixa;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}	
	
}