package geekStore;

public class CartaoCredito extends FormaPagamento {

	private String bandeira;
	private double taxaRetencao;
	private int prazoPagamento;
	// Quais outros atributos colocar para FormaPagamento ?

	
	public CartaoCredito(String nome, int id, boolean ativo, String bandeira, double taxaRetencao, int prazoPagamento) {
		super(nome, id, ativo);
		this.bandeira = bandeira;
		this.taxaRetencao = taxaRetencao;
		this.prazoPagamento = prazoPagamento;
	}
	
	public String getBandeira() {
		return bandeira;
	}
	
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	public double getTaxaRetencao() {
		return taxaRetencao;
	}

	public void setTaxaRetencao(double taxaRetencao) {
		this.taxaRetencao = taxaRetencao;
	}

	public int getPrazoPagamento() {
		return prazoPagamento;
	}

	public void setPrazoPagamento(int prazoPagamento) {
		this.prazoPagamento = prazoPagamento;
	}	
	
}
