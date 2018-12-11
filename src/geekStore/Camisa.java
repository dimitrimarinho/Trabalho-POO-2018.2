package geekStore;

import javax.swing.JOptionPane;

public class Camisa extends Produto implements AlterarCarrinho {
	
	private String modelo, material, cor, fornecedor, ilustrador, tamanho;

	public Camisa(String id, String nome, String descricao, double preco, boolean disponibilidade,int unidadesDisponiveis, String modelo,
			String material, String cor, String fornecedor, String ilustrador, String tamanho) {
		super(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis);
		this.modelo = modelo;
		this.material = material;
		this.cor = cor;
		this.fornecedor = fornecedor;
		this.ilustrador = ilustrador;
		this.tamanho = tamanho;
	}
	
	
	public void adicionarItem(Produto camisa) {
		if(camisa.isDisponibilidade() == true)
			CarrinhoCompra.adicionarProduto(camisa);
		else 
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");		
	}
	
	
	public boolean removerItem(Produto camisa) {
		return false;
	}	
	
	@Override
	 public String toString() {
		return ("Nome: "+super.getNome()
		+"\nDescricao: "+super.getDescricao()
		+"\nPreco: "+super.getPreco()
		+"\nDisponibilidade: "+super.isDisponibilidade()
		+"\nUnidades: "+super.getUnidadesDisponiveis()
		+"\nModelo: "+getModelo()
		+"\nMaterial: "+getMaterial()
		+"\nCor: "+getCor()
		+"\nFornecedor: "+getFornecedor()
		+"\nIlustrador: "+getIlustrador()
		+"\nTamanho: "+getTamanho());
		
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

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
}