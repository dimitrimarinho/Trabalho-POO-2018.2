package geekStore;

public class Colecionaveis extends Produto {

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
	
	@Override
	public void adicionarItem(Produto colecionaveis) {
		if(colecionaveis.isDisponibilidade() == true)
			CarrinhoCompra.adicionarProduto(colecionaveis);
		else 
			System.out.println("Não há estoque do produto solicitado");			
	}
	
	@Override
	public boolean removerItem(Produto colecionaveis) {
		return CarrinhoCompra.removerProduto(colecionaveis);
	}	
	
	@Override
	public String toString() {
		return("Nome: "+super.getNome()
		+"\nDescri��o: "+super.getDescricao()
		+"\nPreco: "+super.getPreco()
		+"\nDisponibilidade: "+super.isDisponibilidade()
		+"\nUnidades: "+super.getUnidadesDisponiveis()
		+"\nCategoria: "+getCategoria()
		+"\nDimensoes: "+getDimensoes()
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