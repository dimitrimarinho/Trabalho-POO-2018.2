package geekStore;

public class Acessorios extends Produto {
	
	private String categoria, material, dimensoes;
	// Quais atributos colocar em acessórios ?

	public Acessorios(String nome, String descricao, double preco, boolean disponibilidade, String categoria,
			String material, String dimensoes) {
		super(nome, descricao, preco, disponibilidade);
		this.categoria = categoria;
		this.material = material;
		this.dimensoes = dimensoes;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}
	
}
