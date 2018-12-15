package geekStore;

public class Funcionario {
	private String nome, CPF, cargo, matricula;
	
	public Funcionario(String nome, String CPF, String cargo, String matricula) {
		this.nome = nome;
		this.CPF = CPF;
		this.cargo = cargo;
		this.matricula = matricula;
	}

	
	@Override
	public String toString() {
		return("Nome: "+getNome()
		+"\nCPF: "+getCPF()
		+"\nMatricula: "+getMatricula()
		+"\nCargo: "+getCargo());
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
