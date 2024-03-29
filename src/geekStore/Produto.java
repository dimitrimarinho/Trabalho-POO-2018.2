package geekStore;

public abstract class Produto {

	private String id, nome, descricao;
	private double preco;
	private boolean disponibilidade;
	private int unidadesDisponiveis;
	
	public Produto(String id, String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
		this.unidadesDisponiveis = unidadesDisponiveis;
	}
		
	@Override
	public abstract String toString();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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


	public int getUnidadesDisponiveis() {
		return unidadesDisponiveis;
	}


	public void setUnidadesDisponiveis(int unidadesDisponiveis) {
		this.unidadesDisponiveis = unidadesDisponiveis;
	}	
		
}