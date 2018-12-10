package geekStore;

public class Estojo extends Acessorio {

	private int numeroCompartimentos;
	private double profundidade;
	private String cor, marca;
		
	public Estojo(String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis,
			String categoria, String material, String dimensoes, int numeroCompartimentos, double profundidade, 
			String cor, String marca) {
		
		super(nome, descricao, preco, disponibilidade,unidadesDisponiveis, categoria, material, dimensoes);
		this.numeroCompartimentos = numeroCompartimentos;
		this.profundidade = profundidade;
		this.cor = cor;
		this.marca = marca;
	}
	
	// Implementar método adicionarItem da interface alterarCarrinho
	public void adicionarItem(Produto estojo) {
			
	}	
	
	@Override
	public String toString() {
		return ("Nome: "+super.getNome()
		+"\nDescri��o: "+super.getDescricao()
		+"\nPreco: "+super.getPreco()
		+"\nDisponibilidade: "+super.isDisponibilidade()
		+"\nUnidades: "+super.getUnidadesDisponiveis()
		+"\nCategoria: "+getCategoria()
		+"\nMaterial: "+getMaterial()
		+"\nDimensoes: "+getDimensoes()
		+"\nNumero de Compartimentos: "+getNumeroCompartimentos()
		+"\nProfundidade: "+getProfundidade()
		+"\nCor: "+getCor()
		+"\nMarca: "+getMarca());
	}


	public int getNumeroCompartimentos() {
		return numeroCompartimentos;
	}

	public void setNumeroCompartimentos(int numeroCompartimentos) {
		this.numeroCompartimentos = numeroCompartimentos;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
