package geekStore;

import javax.swing.JOptionPane;

public class Colecionaveis extends Produto implements AlterarCarrinho {

	private String categoria, dimensoes, conteudoCaixa, material, marca;
	private double peso;
	
	public Colecionaveis(String id, String nome, String descricao, double preco, boolean disponibilidade,
			int unidadesDisponiveis, String categoria, String dimensoes, String conteudoCaixa, 
			String material, String marca, double peso) {
		
		super(id, nome, descricao, preco, disponibilidade,unidadesDisponiveis);
		this.categoria = categoria;
		this.dimensoes = dimensoes;
		this.conteudoCaixa = conteudoCaixa;
		this.material = material;
		this.marca = marca;
		this.peso = peso;
	}
	
	
	public void adicionarItem(Produto colecionaveis) {
		int verif = JOptionPane.DEFAULT_OPTION, dec = colecionaveis.getUnidadesDisponiveis();
		if(colecionaveis.isDisponibilidade() == true) {
			verif = JOptionPane.showConfirmDialog(null, "Deseja Adicionar o Produto Ao Carrinho?");
			if(verif == JOptionPane.YES_OPTION) {
				CarrinhoCompra.adicionarProduto(colecionaveis);
				colecionaveis.setUnidadesDisponiveis(dec - 1);
			}
		}else 
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");		
	}
	
	
	public boolean removerItem(Produto colecionaveis) {
		return CarrinhoCompra.removerProduto(colecionaveis);
	}	
	
	@Override
	public String toString() {
		return("Nome: "+super.getNome()
		+"\nDescricao: "+super.getDescricao()
		+"\nPreco: "+super.getPreco()
		+"\nDisponibilidade: "+super.isDisponibilidade()
		+"\nUnidades: "+super.getUnidadesDisponiveis()
		+"\nCategoria: "+getCategoria()
		+"\nDimensoes (cm): "+getDimensoes()
		+"\nConteudo da Caixa: "+getConteudoCaixa()
		+"\nMaterial: "+getMaterial()
		+"\nMarca: "+getMarca()
		+"\nPeso: "+getPeso());	
		
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

	public String getConteudoCaixa() {
		return conteudoCaixa;
	}

	public void setConteudoCaixa(String conteudoCaixa) {
		this.conteudoCaixa = conteudoCaixa;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}	
	
}