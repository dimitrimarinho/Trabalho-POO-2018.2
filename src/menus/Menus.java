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
				break;
			}
		
		}
	}
	
	
	
	
	public static void menuRemoverClientes() {
		int cont = 0;
		String nome = JOptionPane.showInputDialog("Informe o Nome Completo do Cliente Que Deseja Remover:");
		cont = Loja.removerCliente(nome);
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "   Cliente Nao Encontrado!");
		}else {
			JOptionPane.showMessageDialog(null, "   Cliente Removido Com Sucesso!");
		}
		
	}
	
	
	
	public static void menuRemoverFormaPagamentos() {
		int id, cont = 0;
		try {
			id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Forma de Pagamento Que Deseja Remover:"));
		}catch(NumberFormatException ex) {
			throw new NumberFormatException("O ID Deve Ser Um Numero Inteiro");
		}
		
		if(id <= 0) {
			throw new IllegalArgumentException("O ID Deve Ser Um Numero Inteiro Positivo");
		}
		cont = Loja.removerFormaPagamento(id);
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Forma de Pagamento Nao Encontrada!");
		}else {
			JOptionPane.showMessageDialog(null, "   Forma de Pagamento Removida Com Sucesso!");
		}
		
	}
	
	
	
	public static void  menuRemoverProdutos() {
		int cont = 0;
		String id = JOptionPane.showInputDialog("Informe o ID do Produto Que Deseja Remover:");
		cont = Loja.removerProduto(id);
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "   Produto Nao Encontrado!");
		}else {
			JOptionPane.showMessageDialog(null, "   Produto Removido Com Sucesso!");
		}
	}
	
	
	
	public static void menuConsultarCredito() {
		int cont = 0;
		ArrayList <FormaPagamento> listapag = Loja.getListaFormasPagamento();
		
		for(int i = 0; i < listapag.size(); i++) {
			if(listapag.get(i) instanceof CartaoCredito ) {
				ExibirFormasPagamento.exibirFormaPagamento((CartaoCredito) listapag.get(i));
				cont = 1;
			}
		}
		
		if(cont == 0) {
			JOptionPane.showMessageDialog(null, "Nao Ha Cadastro da Forma de Pagamento");
		}
	}
	
	
	
	public static void menuConsultarBoleto() {
		int cont = 0;
		ArrayList <FormaPagamento> listapag = Loja.getListaFormasPagamento();
		for(int i = 0; i < listapag.size(); i++) {
			if(listapag.get(i) instanceof BoletoBancario) {
				ExibirFormasPagamento.exibirFormaPagamento((BoletoBancario) listapag.get(i));
				cont = 1;
			}
		}
		
		if(cont == 0) {
			JOptionPane.showMessageDialog(null, "Nao Ha Cadastro da Forma de Pagamento");
		}
	}
	
	
	
	public static void menuConsultarFormasPagamento() {
		ImageIcon logo = Icones.iconeLoja();
		int verif = JOptionPane.YES_OPTION;
		
		while(verif == JOptionPane.YES_OPTION){
			String op =  (String) JOptionPane.showInputDialog(null,
			"Selecione a Forma de Pagamento que Deseja Consultar:"
			+"\n(1) - Cartao de Credito"
			+"\n(2) - Boleto Bancario"
			,Loja.getNome(), 0, logo, null, "");
			
			switch(op) {
			
			case "1":
				menuConsultarCredito();
				break;
			
			case "2":
				menuConsultarBoleto();
				break;
				
				
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
				
			}
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu de Consulta?");
		}
		
	}
	
	public static void menuConsultarFisica() {
		int cont = 0;
		ArrayList <Cliente> lista = Loja.getListaClientes();
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) instanceof PessoaFisica ) {
				ExibirClientes.exibirPessoa((PessoaFisica) lista.get(i));
				cont = 1;
			}
		}
		
		if(cont == 0) {
			JOptionPane.showMessageDialog(null, "Nao Ha Clientes Cadastrados");
		}
	}
	
	
	
	public static void menuConsultarJuridica() {
		int cont = 0;
		ArrayList <Cliente> lista = Loja.getListaClientes();
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) instanceof PessoaJuridica) {
				ExibirClientes.exibirPessoa((PessoaJuridica) lista.get(i));
				cont = 1;
			}
		}
		
		if(cont == 0) {
			JOptionPane.showMessageDialog(null, "Nao Ha Clientes Cadastrados");
		}
	}
	
	
	
	public static void menuConsultarClientes() {
		ImageIcon logo = Icones.iconeLoja();
		int verif = JOptionPane.YES_OPTION;
		
		while(verif == JOptionPane.YES_OPTION){
			String op =  (String) JOptionPane.showInputDialog(null,
			"Selecione o Tipo Cliente que Deseja Consultar:"
			+"\n(1) - Pessoa Fisica"
			+"\n(2) - Pessoa Juridica"
			,Loja.getNome(), 0, logo, null, "");
			
			switch(op) {
			
			case "1":
				menuConsultarFisica();
				break;
			
			case "2":
				menuConsultarJuridica();
				break;
				
				
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
				
			}
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu de Consulta?");
		}
		
	}
	
	
	
	public static void menuConfirmarPagamento() {
		String nome = null, op = null, infos = null;
		ArrayList<Cliente> listaclientes = Loja.getListaClientes();
		ImageIcon logo = Icones.iconeLoja();
		ImageIcon boleto = Icones.iconeBoleto();
		ImageIcon nota = Icones.iconeNota();
		int verif = JOptionPane.showConfirmDialog(null, "Voce e Um Cliente Cadastrado?");
		int cont = 0, cont1 = 0;
		
		if(verif == JOptionPane.YES_OPTION) {
			int tipo = JOptionPane.showConfirmDialog(null, "Voce e Uma Pessoa Fisica");
			if(tipo == JOptionPane.YES_OPTION) {
				nome = JOptionPane.showInputDialog("Informe Seu Nome Completo:");
				
			}else {
				nome = JOptionPane.showInputDialog("Informe O Nome da Empresa");
			}
			
			for(int i = 0; i < listaclientes.size(); i++) {
				if(listaclientes.get(i).getNome().equals(nome)) {
					if(listaclientes.get(i) instanceof PessoaFisica ) {
						ExibirClientes.exibirPessoa((PessoaFisica) listaclientes.get(i));
					}else if(listaclientes.get(i) instanceof PessoaJuridica) {
						ExibirClientes.exibirPessoa((PessoaJuridica) listaclientes.get(i));
					}
					cont = 1;
					break;
				}
			}
			if(cont == 0 ) {
				JOptionPane.showMessageDialog(null, "Cliente Nao Cadastrado!");
			}else {
				while(verif == JOptionPane.YES_OPTION) {
					op =  (String) JOptionPane.showInputDialog(null,
							"Selecione a Forma de Pagamento que Deseja Utilizar Na Compra:"
							+"\n(1) - Cartao de Credito"
							+"\n(2) - Boleto Bancario"
							,Loja.getNome(), 0, logo, null, "");
							
							switch(op) {
							
							case "1":
								infos =  menuCartao();
								if(infos == null) {
									cont1 = 0;
								}else {
									cont1 = 2;
								}
								verif = JOptionPane.NO_OPTION;
								break;
							
							case "2":
								infos = menuBoleto();
								if(infos == null) {
									cont1 = 0;
								}else {
									cont1 = 3;
								}
								verif = JOptionPane.NO_OPTION;
								break;
								
							default:
								JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
								verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu de Selecao da Forma de Pagamento?");
					
							}
				}
			}
			
			if(cont1 == 2) {
				JOptionPane.showMessageDialog(null,"Cliente: "+nome + "\n" +infos, "Nota Fiscal", JOptionPane.INFORMATION_MESSAGE, nota);
			}else if(cont1 == 3) {
				JOptionPane.showMessageDialog(null, "Cliente: "+nome + "\n" +infos, "Boleto Bancario", JOptionPane.INFORMATION_MESSAGE, boleto);
			}else {
				JOptionPane.showMessageDialog(null, "Nao e Possivel Realizar a Compra!");
			}
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Nao e Possivel Realizar a Compra!");
		}
		
		
	}
	
	
	
	public static String menuCartao() {
		String numcard = null, bandeira = null, infos = null;
		String carrinhoCompra = "";
		CartaoCredito c;
		int prazo = 0;
		int numparc = 0, ano = 0, cont = 0,verif = JOptionPane.YES_OPTION;
		ArrayList<FormaPagamento> credito = Loja.getListaFormasPagamento();
		ArrayList<Produto> carrinho = CarrinhoCompra.getCarrinhoCompra();
		ArrayList<Integer> quantidade = CarrinhoCompra.getQtd();
		
		
		while(verif == JOptionPane.YES_OPTION) {
			numcard = JOptionPane.showInputDialog("Informe o Numero do Cartao de Credito");
			try {
				numparc = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero Parcelas (Maximo 12x)"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Numero de Parcelas Deve Ser Inteiro");
			}
		
			while(numparc > 12 || numparc < 1) {
				JOptionPane.showMessageDialog(null, "Numero de Parcelas Invalido!");
				try {
					numparc = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero Parcelas (Maximo 12x)"));
				}catch(NumberFormatException ex) {
					throw new NumberFormatException("O Numero de Parcelas Deve Ser Inteiro");
				}
				
			}
			
			try {
				ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano de Vencimento do Cartao"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Ano Deve Ser Um Numero Inteiro");
			}
			
			 if(ano < 2018) {
				 JOptionPane.showMessageDialog(null, "Cartao Vencido!");
				 verif = JOptionPane.showConfirmDialog(null, "Deseja Reecadastrar a Forma de Pagamento?");
			 }else {
					 bandeira = JOptionPane.showInputDialog("Informe a Bandeira do Cartão:");
					 for(int i  = 0; i < credito.size(); i++) {
						 if(credito.get(i) instanceof CartaoCredito) {
							 c = (CartaoCredito) credito.get(i);
							 if(c.getBandeira().equals(bandeira)) {
								 prazo = c.getPrazoPagamento();
								 cont = 1;
								 break;
							 }
						 }
					 }
					 
					 if(cont == 0) {
						 JOptionPane.showMessageDialog(null, "Bandeira Invalida Para Compra!");
						 verif = JOptionPane.showConfirmDialog(null, "Deseja Reecadastrar a Forma de Pagamento?");
					 }else {
						 verif = JOptionPane.NO_OPTION;
					 }
			 } 
		}
		
		for(int i = 0; i < carrinho.size(); i++) {
			 carrinhoCompra = carrinhoCompra + (i+1)+ ":  " +carrinho.get(i).getId() + " " +carrinho.get(i).getNome() + " " 
					+ quantidade.get(i) + " UN x "+carrinho.get(i).getPreco() + "   "+(carrinho.get(i).getPreco() * quantidade.get(i)) + "\n";
			
		}
		
		if(cont == 1) {
		
			infos = "Produtos:\n"+carrinhoCompra
					+"\nNumero do Cartao: "+numcard
					+"\nNumero de Parcelas: "+numparc
					+"\nValor Total: "+CarrinhoCompra.getValorCompra()
					+"\nValor Parcelado: "+(CarrinhoCompra.getValorCompra() / numparc)
					+"\nAno de Vencimento do Cartao: "+ano
					+"\nBandeira: "+bandeira
					+"\nPrazo de Pagamento: "+prazo;
		}else {
			infos = null;
		}
		
		return infos;
		
			
	}
	
	
	
	
	public static String menuBoleto() {
		String carrinhoCompra = "", nomeBanco = null, infos;
		int prazo = 0;
		BoletoBancario banco;
		ArrayList<Produto> carrinho = CarrinhoCompra.getCarrinhoCompra();
		ArrayList<Integer> quantidade = CarrinhoCompra.getQtd();
		ArrayList<FormaPagamento> formas = Loja.getListaFormasPagamento();
		
		for(int i = 0; i < carrinho.size(); i++) {
			 carrinhoCompra = carrinhoCompra + (i+1)+ ":  " +carrinho.get(i).getId() + " " +carrinho.get(i).getNome() + " " 
					+ quantidade.get(i) + " UN x "+carrinho.get(i).getPreco() + "   "+(carrinho.get(i).getPreco() * quantidade.get(i)) + "\n";
			
		}
	
		for(int i = 0; i < formas.size(); i++) {
			if(formas.get(i) instanceof BoletoBancario) {
				banco = (BoletoBancario) formas.get(i);
				prazo = banco.getPrazoPagamento();
				nomeBanco = banco.getBanco();
				break;
			}
		}
		
		if(nomeBanco== null) {
			infos = null;
		}else {
			
			infos = "Produtos:\n" +carrinhoCompra
			+"\nBanco Emissor: " +nomeBanco 
			+"\nPrazo de Pagamento: "+prazo
			+"\nValor Total: " +CarrinhoCompra.getValorCompra()
			+"\nValor Com Desconto: "+(CarrinhoCompra.getValorCompra() - (CarrinhoCompra.getValorCompra() * 0.1));
		}
			
		return infos;
	}
	
	
	
	
	public static void menuComprarProdutos() {
		ImageIcon logo = Icones.iconeLoja();
		int verif = JOptionPane.YES_OPTION, cont;
		
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
		
		if(CarrinhoCompra.getCarrinhoCompra().size()!= 0) {
			CarrinhoCompra.exibirCarrinho();
			cont = menuRemoverProduto();
			if(cont == 1) {
				if(CarrinhoCompra.getValorCompra() != 0) {
					CarrinhoCompra.exibirCarrinho();
					verif = JOptionPane.showConfirmDialog(null, "Confirmar Compra?");
				}
			}else if(cont == 0) {
				verif = JOptionPane.showConfirmDialog(null, "Confirmar Compra?");
			}
				
			if(verif == JOptionPane.YES_OPTION) {
				menuConfirmarPagamento();
			}
		}
		
	}
	
	
	
	
	public static int menuRemoverProduto() {
		 int verif = JOptionPane.showConfirmDialog(null, "Deseja Remover Algum Produto do Carrinho?");
		 int qtd, cont = 0;
		 String id = null;
		 ArrayList <Integer> listaqtd = CarrinhoCompra.getQtd();
		 ArrayList <Produto> carrinho = CarrinhoCompra.getCarrinhoCompra();
		
		while(verif == JOptionPane.YES_OPTION) {
			id = JOptionPane.showInputDialog("Informe o ID do Produto Que Deseja Remover:");
			
			try {
				qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Unidades do Produto Que Deseja Remover:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Numero de Unidades Deve Ser Inteiro");
			}
			
			if(qtd <= 0) {
				throw new IllegalArgumentException("O Numero de Unidades Deve Ser Um Numero Inteiro Positivo");
			}
			
			for(int i = 0; i < carrinho.size(); i++) {
				if(carrinho.get(i).getId().equals(id)) {
					if(qtd == listaqtd.get(i)) {
						CarrinhoCompra.removerProduto(id, qtd);
						cont = 1;
						verif = 3;
						break;
					}else if(qtd < listaqtd.get(i) && qtd >= 0 ) {
						listaqtd.set(i, listaqtd.get(i) - qtd);
						CarrinhoCompra.setQtd(listaqtd);
						cont = 1;
						verif = 3;
						break;
					}else {
						JOptionPane.showMessageDialog(null, "    Quantidade Invalida!");
						cont = 1;
						break;
						
					}
				}
			}
			
			if(cont == 0) {
				JOptionPane.showMessageDialog(null, "    ID Nao Encontrado");
			}
			
			verif = JOptionPane.showConfirmDialog(null, "Deseja Continuar Removendo?");
		}
		
		return cont;
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
		int verif = JOptionPane.YES_OPTION, cont = 0;
		
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
				cont = 1;
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "         Opcao Invalida!");
					
			}
			
			if(cont == 1) {
				verif = JOptionPane.NO_OPTION;
				JOptionPane.showMessageDialog(null, "VOLTE SEMPRE!", Loja.getNome(), 0, logo);
				
			}else {
				verif = JOptionPane.showConfirmDialog(null, "Deseja Voltar Ao Menu Principal?");
				
			}
			
		}
				
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
