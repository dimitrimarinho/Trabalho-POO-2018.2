package financeiroLoja;

public class CartaoCredito extends FormaPagamento {

	private double taxaRetencao;
	private String bandeira;
	
	public CartaoCredito (int id, String tipo, int prazoPagamento, boolean ativo, String bandeira, double taxaRetencao) {
		super(id, tipo, prazoPagamento, ativo );
		
		this.bandeira = bandeira;
		this.taxaRetencao = taxaRetencao;

	}
	
	
	@Override
	public String toString() {
		return(super.toString()
		+"\nBandeira: "+getBandeira()
		+"\nTaxa de Retencao: "+getTaxaRetencao());
	}
	
	
	public double getTaxaRetencao() {
		return taxaRetencao;
	}

	public void setTaxaRetencao(double taxaRetencao) {
		this.taxaRetencao = taxaRetencao;
	}


	public String getBandeira() {
		return bandeira;
	}


	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	
}
