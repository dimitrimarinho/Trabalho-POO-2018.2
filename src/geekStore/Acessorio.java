package geekStore;

public abstract class Acessorio extends Produto {
	
	private String categoria, material, dimensoes;

	public Acessorio(String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis, String categoria,
			String material, String dimensoes) {
		super(nome, descricao, preco, disponibilidade, unidadesDisponiveis);
		this.categoria = categoria;
		this.material = material;
		this.dimensoes = dimensoes;
	}
	
	@Override
	public abstract String toString();

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
