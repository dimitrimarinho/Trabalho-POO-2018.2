public abstract class Produto {

	private String nome, descricao;
	private double preco;
	private boolean disponibilidade;
	// Quais outros atributos colocar para Produto ?
	
	public Produto(String nome, String descricao, double preco, boolean disponibilidade) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
		
}
