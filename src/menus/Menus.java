package menus;

import cadastroClientes.*;
import cadastroFormasPagamento.*;
import cadastroProdutos.*;
import exibirClientes.*;
import exibirFormasPagamento.*;
import consultarProdutos.*;
import financeiroLoja.*;
import geekStore.*;
import icones.*;

import java.util.ArrayList;



import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Menus {
	
	public static void menuLogin() {
		ImageIcon login = Icones.iconeLogin();
		ArrayList<Funcionario> listafunc = Loja.getListaFuncionarios();
		Loja.adicionarFuncionario();
		int cont = 0, verif = JOptionPane.YES_OPTION;
		while(verif == JOptionPane.YES_OPTION) {
			String log =  (String) JOptionPane.showInputDialog(null,
					"Insira Sua Matricula:\n"
					,"Login: "+Loja.getNome(), 0, login, null, "");
			
			for(int i = 0; i < listafunc.size(); i++) {
				if(listafunc.get(i).getMatricula().equals(log)) {
					JOptionPane.showMessageDialog(null, listafunc.get(i).toString(), "Informacoes do Funcionario", JOptionPane.INFORMATION_MESSAGE, login);
					cont = 1;
					break;
				}
			}
			
			if(cont == 0) {
				JOptionPane.showMessageDialog(null, "       Matricula Invalida!");
				verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu de Login?");
				
			}else if(cont == 1) {
				menuFuncionario();
			}
		
		}
	}
	
	public static void menuRemoverClientes() {
		int cont = 0;
		String nome = JOptionPane.showInputDialog("Informe o Nome Completo do Cliente Que Deseja Remover:");
		cont = Loja.removerCliente(nome);
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "   Cliente Nao Encontrado!");
		}
		
	}
	
	public static void menuRemoverFormaPagamentos() {
		int cont = 0;
		int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Forma de Pagamento Que Deseja Remover:"));
		cont = Loja.removerFormaPagamento(id);
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Forma de Pagamento Nao Encontrada!");
		}
		
	}
	
	public static void  menuRemoverProdutos() {
		int cont = 0;
		String id = JOptionPane.showInputDialog("Informe o ID do Produto Que Deseja Remover:");
		cont = Loja.removerProduto(id);
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "   Produto Nao Encontrado!");
		}
	}
	
	
	public static void menuConsultarFormasPagamento() {
		ArrayList <FormaPagamento> listapag = Loja.getListaFormasPagamento();
		for(int i = 0; i < listapag.size(); i++) {
			if(listapag.get(i) instanceof CartaoCredito ) {
				ExibirFormasPagamento.exibirFormaPagamento((CartaoCredito) listapag.get(i));
			}else if(listapag.get(i) instanceof BoletoBancario) {
				ExibirFormasPagamento.exibirFormaPagamento((BoletoBancario) listapag.get(i));
			}
		}	
	}
	
	
	public static void menuConsultarClientes() {
		ArrayList <Cliente> lista = Loja.getListaClientes();
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) instanceof PessoaFisica ) {
				ExibirClientes.exibirPessoa((PessoaFisica) lista.get(i));
			}else if(lista.get(i) instanceof PessoaJuridica) {
				ExibirClientes.exibirPessoa((PessoaJuridica) lista.get(i));
			}
		}	
	}
	
	
	public static void menuComprarProdutos() {
		ImageIcon logo = Icones.iconeLoja();
		int verif = JOptionPane.YES_OPTION;
		
		while(verif == JOptionPane.YES_OPTION){
			String op =  (String) JOptionPane.showInputDialog(null,
			"Selecione o Produto que Deseja Comprar:\n"
			+"\n(1) - Camisa"
			+"\n(2) - Colecionavel"
			+"\n(3) - Livro"
			+"\n(4) - Jogo"
			+"\n(5) - Quadrinho"
			+"\n(6) - Manga"
			+"\n(7) - Botton"
			+"\n(8) - Estojo"
			,Loja.getNome(), 0, logo, null, "");
			
			switch(op) {
			
			case "1":
				ConsultarProdutosCliente.consultarCamisa();
				break;
			
			case "2":
				ConsultarProdutosCliente.consultarColecionavel();;
				break;
				
			case "3":
				ConsultarProdutosCliente.consultarLivro();
				break;
				
			case "4":
				ConsultarProdutosCliente.consultarGame();
				break;
				
			case "5":
				ConsultarProdutosCliente.consultarQuadrinho();
				break;
				
			case "6":
				ConsultarProdutosCliente.consultarManga();
				break;
				
			case "7":
				ConsultarProdutosCliente.consultarBotton();
				break;
				
			case "8":
				ConsultarProdutosCliente.consultarEstojo();
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
				
			}
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu de Compra?");
		}
		
	}
	
	
	public static void menuConsultarCatalogo() {
		ImageIcon logo = Icones.iconeLoja();
		int verif = JOptionPane.YES_OPTION;
		
		while(verif == JOptionPane.YES_OPTION){
			String op =  (String) JOptionPane.showInputDialog(null,
			"Selecione o Produto que Deseja Consultar:\n"
			+"\n(1) - Camisa"
			+"\n(2) - Colecionavel"
			+"\n(3) - Livro"
			+"\n(4) - Jogo"
			+"\n(5) - Quadrinho"
			+"\n(6) - Manga"
			+"\n(7) - Botton"
			+"\n(8) - Estojo"
			,Loja.getNome(), 0, logo, null, "");
			
			switch(op) {
			
			case "1":
				ConsultarProdutos.consultarCamisa();
				break;
			
			case "2":
				ConsultarProdutos.consultarColecionavel();
				break;
				
			case "3":
				ConsultarProdutos.consultarLivro();
				break;
				
			case "4":
				ConsultarProdutos.consultarGame();
				break;
				
			case "5":
				ConsultarProdutos.consultarQuadrinho();
				break;
				
			case "6":
				ConsultarProdutos.consultarManga();
				break;
				
			case "7":
				ConsultarProdutos.consultarBotton();
				break;
				
			case "8":
				ConsultarProdutos.consultarEstojo();
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
				
			}
			
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu de Consulta?");
		}
		
	}
	
	
	public static void menuCadastroFormasPagamento() {
		int cont = 0, verif = JOptionPane.YES_OPTION;
		ImageIcon logo = Icones.iconeLoja();
		
		while(verif == JOptionPane.YES_OPTION){
			String op =  (String) JOptionPane.showInputDialog(null,
			"Selecione a Forma de Pagamento que Deseja Cadastrar:\n"
			+"(1) - Cartao de Credito"
			+"\n(2) - Boleto Bancario"
			,Loja.getNome(), 0, logo, null, "");
			
			switch(op) {
			
			case "1":
				cont = CadastroFormasPagamento.cadastroCartao();
				break;
			
			case "2":
				cont = CadastroFormasPagamento.cadastroBoleto();
				break;
				
				 
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
				cont = 2;
				
			}
			
			if(cont == 0) {
				JOptionPane.showMessageDialog(null, "Forma de Pagamento Cadastrada Com Sucesso!");
			}else if(cont == 1)
				JOptionPane.showMessageDialog(null, "Forma de Pagamento Nao Cadastrada!!");
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu de Cadastro?");
		}
		
	}
	
	
	public static void menuCadastroClientes() {
		int cont = 0, verif = JOptionPane.YES_OPTION;
		ImageIcon logo = Icones.iconeLoja();
		
		while(verif == JOptionPane.YES_OPTION){
			String op =  (String) JOptionPane.showInputDialog(null,
			"Selecione o Tipo de Cliente que Deseja Cadastrar:\n"
			+"(1) - Pessoa Fisica"
			+"\n(2) - Pessoa Juridica"
			,Loja.getNome(), 0, logo, null, "");
			
			switch(op) {
			
			case "1":
				cont = CadastroClientes.cadastrarFisica();
				break;
			
			case "2":
				cont = CadastroClientes.cadastroJuridica();
				break;
				
				 
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
				cont = 2;
			}
			
			if(cont == 0) {
				JOptionPane.showMessageDialog(null, "Cliente Cadastrado Com Sucesso!");
			}else if(cont == 1)
				JOptionPane.showMessageDialog(null, "  Cliente Nao Cadastrado!");
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu de Cadastro?");
		}
			
	}
		
	
	
	public static void menuCadastroProdutos() {
		int cont = 0;
		ImageIcon logo = Icones.iconeLoja();
		int verif = JOptionPane.YES_OPTION;
		
		while(verif == JOptionPane.YES_OPTION ){
			String op =  (String) JOptionPane.showInputDialog(null,
			"Selecione o Produto que Deseja Cadastrar:\n"
			+"\n(1) - Camisa"
			+"\n(2) - Colecionavel"
			+"\n(3) - Livro"
			+"\n(4) - Jogo"
			+"\n(5) - Quadrinho"
			+"\n(6) - Manga"
			+"\n(7) - Botton"
			+"\n(8) - Estojo"
			,Loja.getNome(), 0, logo, null, "");
			
			switch(op) {
			
			case "1":
				cont = CadastroProdutos.cadastroCamisa();
				break;
			
			case "2":
				cont = CadastroProdutos.cadastroColecionaveis();
				break;
				
			case "3":
				cont = CadastroProdutos.cadastroLivro();
				break;
				
			case "4":
				cont = CadastroProdutos.cadastroGames();
				break;
				
			case "5":
				cont = CadastroProdutos.cadastroQuadrinho();
				break;
				
			case "6":
				cont = CadastroProdutos.cadastroManga();
				break;
				
			case "7":
				cont = CadastroProdutos.cadastroBotton();
				break;
				
			case "8":
				cont = CadastroProdutos.cadastroEstojo();
				 break;
				 
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
				cont = 2;
			}
			
			if(cont == 0) {
				JOptionPane.showMessageDialog(null, "Produto Cadastrado Com Sucesso!");
			}else if(cont == 1)
				JOptionPane.showMessageDialog(null, "   Produto Nao Cadastrado!");
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu de Cadastro?");
		}
			
	}
	
	public static void menuCliente() {
		ImageIcon logo = Icones.iconeLoja();
		int verif = JOptionPane.YES_OPTION;
		
		while(verif == JOptionPane.YES_OPTION){
			String op =  (String) JOptionPane.showInputDialog(null,
			"          BEM-VINDOS A GEEK STORE!"
			+"\n      A Loja Geek Mais Proxima de Voce!"
			+"\n\nSelecione a Opcao Desejada:\n"
			+"\n(1) - Para Consultar o Catalogo"
			+"\n(2) - Para Comprar Produtos"
			,Loja.getNome(), 0, logo, null, "");
			
			switch(op) {
			
			case "1":
				menuConsultarCatalogo();
				break;
			
			case "2":
				menuComprarProdutos();
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
				
			}
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu Principal?");
		}
		
		JOptionPane.showMessageDialog(null, "VOLTE SEMPRE!", Loja.getNome(), 0, logo);
				
	}
		
	
	
	public static void menuFuncionario() {
		ImageIcon logo = Icones.iconeLoja();
		int verif = JOptionPane.YES_OPTION;
		int trans = 0;
		
		while(verif == JOptionPane.YES_OPTION){
			String op =  (String) JOptionPane.showInputDialog(null,
			"          BEM-VINDOS A GEEK STORE!"
			+"\n      A Loja Geek Mais Proxima de Voce!"
			+"\n\nSelecione a Opcao Desejada:\n"
			+"\n(1) - Para Cadastrar Produtos"
			+"\n(2) - Para Cadastrar Clientes"
			+"\n(3) - Para Cadastrar Formas de Pagamento"
			+"\n(4) - Para Consultar o Catalogo"
			+"\n(5) - Para Consultar Clientes Cadastrados"
			+"\n(6) - Para Consultar as Formas de Pagamento"
			+"\n(7) - Para Remover Produtos"
			+"\n(8) - Para Remover Clientes"
			+"\n(9) - Para Remover Formas de Pagamento"
			,Loja.getNome(), 0, logo, null, "");
			
			switch(op) {
			
			case "1":
				menuCadastroProdutos();
				break;
			
			case "2":
				menuCadastroClientes();
				break;
				
			case "3":
				menuCadastroFormasPagamento();
				break;
				
			case "4":
				menuConsultarCatalogo();
				break;
				
			case "5":
				menuConsultarClientes();
				break;
				
			case "6":
				menuConsultarFormasPagamento();
				break;
				
			case "7":
				menuRemoverProdutos();
				break;
				
			case "8":
				menuRemoverClientes();
				break;
				
			case "9":
				menuRemoverFormaPagamentos();
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
				
			}
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu Principal?");
		}
		
		trans = JOptionPane.showConfirmDialog(null, "Deseja Ir Para o Menu de Clientes?");
		
		if(trans == JOptionPane.YES_OPTION) {
			menuCliente();
		}else
			JOptionPane.showMessageDialog(null, "VOLTE SEMPRE!", Loja.getNome(), 0, logo);
		
			
	}

}
