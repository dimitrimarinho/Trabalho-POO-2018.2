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
		int verif = JOptionPane.DEFAULT_OPTION, dec = botton.getUnidadesDisponiveis(), quant;
		String verif2 = "M";
		if(botton.isDisponibilidade() == true) {
			verif = JOptionPane.showConfirmDialog(null, "Deseja Adicionar o Produto Ao Carrinho?");
			if(verif == JOptionPane.YES_OPTION) {
				while(verif2.equals("M") ) {
					try {
						quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade do Produto:"));
					}catch(NumberFormatException ex) {
						throw new NumberFormatException("A Quantidade Deve Ser Um Numero Inteiro");
					}
					
					if(quant <= 0) {
						throw new IllegalArgumentException("A Quantidade Deve Ser Um Numero Inteiro Positivo");
					}
					
					if(quant >= 1 && quant <= dec ) {
						CarrinhoCompra.adicionarProduto(botton,quant);
						JOptionPane.showMessageDialog(null, "     Produto Adicionado!");
						botton.setUnidadesDisponiveis(dec - quant);
						if(botton.getUnidadesDisponiveis() == 0) {
							botton.setDisponibilidade(false);
						}
						verif2 = "OK";
					}else {
						JOptionPane.showMessageDialog(null, "     Quantidade Invalida!");
					}
				}
			}
		}else 
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");	
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