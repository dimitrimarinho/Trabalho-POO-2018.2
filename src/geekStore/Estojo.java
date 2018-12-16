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
		int verif = JOptionPane.DEFAULT_OPTION, dec = estojo.getUnidadesDisponiveis(), quant;
		String verif2 = "M";
		if(estojo.isDisponibilidade() == true) {
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
						CarrinhoCompra.adicionarProduto(estojo,quant);
						JOptionPane.showMessageDialog(null, "     Produto Adicionado!");
						estojo.setUnidadesDisponiveis(dec - quant);
						if(estojo.getUnidadesDisponiveis() == 0) {
							estojo.setDisponibilidade(false);
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