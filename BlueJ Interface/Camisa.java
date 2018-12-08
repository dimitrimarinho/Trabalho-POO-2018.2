public class Camisa extends Produto {

	private String modelo, material, cor, fornecedor, ilustrador;
	private char tamanho;
	// Quais outros atributos colocar para Camisetas ?

	public Camisa(String nome, String descricao, double preco, boolean disponibilidade, String modelo,
			String material, String cor, String fornecedor, String ilustrador, char tamanho) {
		super(nome, descricao, preco, disponibilidade);
		this.modelo = modelo;
		this.material = material;
		this.cor = cor;
		this.fornecedor = fornecedor;
		this.ilustrador = ilustrador;
		this.tamanho = tamanho;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

}
