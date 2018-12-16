package financeiroLoja;

public class BoletoBancario extends FormaPagamento {

	private String Banco;

	public BoletoBancario(int id, String tipo, int prazoPagamento, boolean ativo, String banco) {
		super(id, tipo, prazoPagamento, ativo);
		
		this.Banco = banco;
		
	}
	
	
	@Override
	public String toString() {
		return(super.toString()+"\nBanco Emissor: "+getBanco());
		
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}
	
}
