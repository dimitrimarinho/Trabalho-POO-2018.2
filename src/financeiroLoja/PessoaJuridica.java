package financeiroLoja;

public class PessoaJuridica extends Cliente {

	private String CNPJ;

	public PessoaJuridica(String nome, String email, String endereco, String telefone, String CNPJ) {
		super(nome, email, endereco, telefone);
		this.CNPJ = CNPJ;
	}	
	
	@Override
	public String toString() {
		return(super.toString()+"\nCNPJ: "+getCNPJ());
		
	}

	public String getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}	
	
}
