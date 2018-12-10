package geekStore;

public class Botton extends Acessorio {

	private String franquia, fornecedor;

	public Botton(String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis, 
			String categoria, String material, String dimensoes, String franquia, String fornecedor) {
		
		super(nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, material, dimensoes);
		this.franquia = franquia;
		this.fornecedor = fornecedor;
	}
	
	// Implementar método adicionarItem da interface alterarCarrinho
	@Override
	public void adicionarItem(Produto botton) {
			
	}
	
	// Implementar método removerItem da interface alterarCarrinho
	@Override
	public boolean removerItem(Produto botton) {
		// TODO Auto-generated method stub
		return false;
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
		+"\nFranquia: "+getFranquia()
		+"\nFornecedor: "+getFornecedor());
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
