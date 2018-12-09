package geekStore;

public class Botton extends Acessorio {

	private String franquia, fornecedor;

	public Botton(String nome, String descricao, double preco, boolean disponibilidade, String categoria,
			String material, String dimensoes, String franquia, String fornecedor) {
		super(nome, descricao, preco, disponibilidade, categoria, material, dimensoes);
		this.franquia = franquia;
		this.fornecedor = fornecedor;
	}

	public String getFranquia() {
		return franquia;
	}

	public void setFranquia(String franquia) {
		this.franquia = franquia;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}	
	
}
