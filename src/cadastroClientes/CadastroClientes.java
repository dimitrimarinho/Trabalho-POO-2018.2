package cadastroClientes;

import javax.swing.JOptionPane;

import financeiroLoja.*;
import geekStore.Loja;


public class CadastroClientes {

	public static int cadastrarFisica() {
		Cliente f;
		String nome, email, endereco, telefone, CPF, RG, dataNascimento;
		int cont = 0;
		
		nome = JOptionPane.showInputDialog("Informe o Nome da Pessoa Fisica:");
		for(int i = 0; i< Loja.getListaClientes().size(); i++) {
			if(Loja.getListaClientes().get(i).getNome().equals(nome)) {
				JOptionPane.showMessageDialog(null, "Pessoa Fisica Ja Cadastrada!");
				cont = 1;
				break;
			}
		}
		
		if(cont!=1) {
			email = JOptionPane.showInputDialog("Informe o Email da Pessoa Fisica:");
			endereco = JOptionPane.showInputDialog("Informe o Endereco da Pessoa Fisica:");
			telefone = JOptionPane.showInputDialog("Informe o Telefone da Pessoa Fisica:");
			CPF = JOptionPane.showInputDialog("Informe o CPF da Pessoa Fisica:");
			RG = JOptionPane.showInputDialog("Informe o RG da Pessoa Fisica:");
			dataNascimento = JOptionPane.showInputDialog("Informe a Data de Nascimento da Pessoa Fisica:");
			
			f = new PessoaFisica(nome, email, endereco, telefone, CPF, RG, dataNascimento);
			Loja.adicionarCliente(f);
		}
		
		return cont;
	} 
	
	
	public static int cadastroJuridica() {
		Cliente j;
		String nome, email, endereco, telefone, CNPJ;
		int cont = 0;
		
		nome = JOptionPane.showInputDialog("Informe o Nome da Pessoa Juridica:");
		for(int i = 0; i< Loja.getEstoque().size(); i++) {
			if(Loja.getListaClientes().get(i).getNome().equals(nome)) {
				JOptionPane.showMessageDialog(null, "Pessoa Juridica Ja Cadastrada!");
				cont = 1;
				break;
			}
		}
		
		if(cont!=1) {
			email = JOptionPane.showInputDialog("Informe o Email da Pessoa Juridica:");
			endereco = JOptionPane.showInputDialog("Informe o Endereco da Pessoa Juridica:");
			telefone = JOptionPane.showInputDialog("Informe o Telefone da Pessoa Juridica:");
			CNPJ = JOptionPane.showInputDialog("Informe o CNPJ da Pessoa Juridica:");
			
			j = new PessoaJuridica(nome, email, endereco, telefone, CNPJ);
			Loja.adicionarCliente(j);
		}
		
		return cont;
		
	}
	
	
}
