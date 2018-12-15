package geekStore;

import javax.swing.JOptionPane;

public class Botton extends Acessorio implements AlterarCarrinho {

	private String franquia, fornecedor;

	public Botton(String id, String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis, 
			String categoria, String material, String dimensoes, String franquia, String fornecedor) {
		
		super(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, material, dimensoes);
		this.franquia = franquia;
		this.fornecedor = fornecedor;
	}
	
	
	public void adicionarItem(Produto botton) {
		int verif = JOptionPane.DEFAULT_OPTION, dec = botton.getUnidadesDisponiveis();
		if(botton.isDisponibilidade() == true) {
			verif = JOptionPane.showConfirmDialog(null, "Deseja Adicionar o Produto Ao Carrinho?");
			if(verif == JOptionPane.YES_OPTION) {
				CarrinhoCompra.adicionarProduto(botton);
				botton.setUnidadesDisponiveis(dec - 1);
			}
		}else 
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
	}
	
	
	public boolean removerItem(Produto botton) {
		return CarrinhoCompra.removerProduto(botton);
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