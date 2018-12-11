package financeiroLoja;

public class PessoaFisica extends Cliente {

	private String CPF, RG, dataNascimento;

	public PessoaFisica(String nome, String email, String endereco, String telefone, String CPF, String RG,
			String dataNascimento) {
		super(nome, email, endereco, telefone);
		this.CPF = CPF;
		this.RG = RG;
		this.dataNascimento = dataNascimento;
	}
	
	
	@Override
	public String toString() {
		return(super.toString()
		+"\nCPF: "+getCPF()
		+"\nRG: "+getRG()
		+"\nData de Nascimento: "+getDataNascimento());
	}
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
