package financeiroLoja;

public class BoletoBancario extends FormaPagamento {

	private String Banco;

	public BoletoBancario(String nome, int id, boolean ativo, String banco) {
		super(nome, id, ativo);
		Banco = banco;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}
	
}
