package teste;

import geekStore.*;
import cadastroClientes.CadastroClientes;
import cadastroFormasPagamento.CadastroFormasPagamento;
import cadastroProdutos.*;
import exibirProdutos.*;
import financeiroLoja.*;
import exibirClientes.*;
import exibirFormasPagamento.ExibirFormasPagamento;

public class Teste {
	
	private static Camisa c;
	private static Colecionaveis co;
	private static Games g;
	private static PessoaFisica pf;
	private static PessoaJuridica pj;
	private static CartaoCredito card;
	private static BoletoBancario bol;
	
	public static void main(String[] args) {
		
		c = CadastroProdutos.cadastroCamisa();
		ExibirProdutos.exibirProduto(c);
		
		co = CadastroProdutos.cadastroColecionaveis();
		ExibirProdutos.exibirProduto(co);
		
		g = CadastroProdutos.cadastroGames();
		ExibirProdutos.exibirProduto(g);
		
		pf = CadastroClientes.cadastrarFisica();
		ExibirClientes.exibirPessoa(pf);
		
		pj = CadastroClientes.cadastroJuridica();
		ExibirClientes.exibirPessoa(pj);
		
		card = CadastroFormasPagamento.cadastroCartao();
		ExibirFormasPagamento.exibirFormaPagamento(card);
		
		bol = CadastroFormasPagamento.cadastroBoleto();
		ExibirFormasPagamento.exibirFormaPagamento(bol);
		
		
	}
	
}
