package cadastroClientes;

import javax.swing.JOptionPane;

import financeiroLoja.*;


public class CadastroClientes {

	public static PessoaFisica cadastrarFisica() {
		String nome, email, endereco, telefone, CPF, RG, dataNascimento;
		
		nome = JOptionPane.showInputDialog("Informe o Nome da Pessoa Fisica:");
		email = JOptionPane.showInputDialog("Informe o Email da Pessoa Fisica:");
		endereco = JOptionPane.showInputDialog("Informe o Endereco da Pessoa Fisica:");
		telefone = JOptionPane.showInputDialog("Informe o Telefone da Pessoa Fisica:");
		CPF = JOptionPane.showInputDialog("Informe o CPF da Pessoa Fisica:");
		RG = JOptionPane.showInputDialog("Informe o RG da Pessoa Fisica:");
		dataNascimento = JOptionPane.showInputDialog("Informe a Data de Nascimento da Pessoa Fisica:");
		
		PessoaFisica f = new PessoaFisica(nome, email, endereco, telefone, CPF, RG, dataNascimento);
		
		return f;
	} 
	
	
	public static PessoaJuridica cadastroJuridica() {
		String nome, email, endereco, telefone, CNPJ;
		
		nome = JOptionPane.showInputDialog("Informe o Nome da Pessoa Juridica:");
		email = JOptionPane.showInputDialog("Informe o Email da Pessoa Juridica:");
		endereco = JOptionPane.showInputDialog("Informe o Endereco da Pessoa Juridica:");
		telefone = JOptionPane.showInputDialog("Informe o Telefone da Pessoa Juridica:");
		CNPJ = JOptionPane.showInputDialog("Informe o CNPJ da Pessoa Juridica:");
		
		PessoaJuridica j = new PessoaJuridica(nome, email, endereco, telefone, CNPJ);
		
		return j;
		
	}
	
	
}
