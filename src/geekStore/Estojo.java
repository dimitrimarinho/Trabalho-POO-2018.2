package geekStore;

import javax.swing.JOptionPane;

public class Estojo extends Acessorio implements AlterarCarrinho {

	private int numeroCompartimentos;
	private double profundidade;
	private String cor, marca;
		
	public Estojo(String id, String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis,
			String categoria, String material, String dimensoes, int numeroCompartimentos, double profundidade, 
			String cor, String marca) {
		
		super(id, nome, descricao, preco, disponibilidade,unidadesDisponiveis, categoria, material, dimensoes);
		this.numeroCompartimentos = numeroCompartimentos;
		this.profundidade = profundidade;
		this.cor = cor;
		this.marca = marca;
	}
	
	
	public void adicionarItem(Produto estojo) {
		int verif = JOptionPane.DEFAULT_OPTION, dec = estojo.getUnidadesDisponiveis();
		if(estojo.isDisponibilidade() == true) {
			verif = JOptionPane.showConfirmDialog(null, "Deseja Adicionar o Produto Ao Carrinho?");
			if(verif == JOptionPane.YES_OPTION) {
				CarrinhoCompra.adicionarProduto(estojo);
				estojo.setUnidadesDisponiveis(dec - 1);
			}
		}else 
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
	}
	
	
	public boolean removerItem(Produto estojo) {
		return CarrinhoCompra.removerProduto(estojo);
	}	
	
	@Override
	public String toString() {
		return ("Nome: "+super.getNome()
		+"\nDescricao: "+super.getDescricao()
		+"\nPreco: "+super.getPreco()
		+"\nDisponibilidade: "+super.isDisponibilidade()
		+"\nUnidades: "+super.getUnidadesDisponiveis()
		+"\nCategoria: "+getCategoria()
		+"\nMaterial: "+getMaterial()
		+"\nDimensoes(cm): "+getDimensoes()
		+"\nNumero de Compartimentos: "+getNumeroCompartimentos()
		+"\nProfundidade: "+getProfundidade() + "cm"
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