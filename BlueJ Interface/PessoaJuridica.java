 

public class PessoaJuridica extends Cliente {

	private String CNPJ;
	// Quais outros atributos colocar para Pessoa Jurídica ?

	public PessoaJuridica(String nome, String email, String endereco, String telefone, String CNPJ) {
		super(nome, email, endereco, telefone);
		this.CNPJ = CNPJ;
	}	

	public String getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}	
	
}
