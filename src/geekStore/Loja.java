package geekStore;

import java.util.ArrayList;

import financeiroLoja.*;

public class Loja {
	private static final String nome = "Geek Store";
	private static ArrayList<Produto> Estoque = new ArrayList<Produto>();
	private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	private static ArrayList<FormaPagamento> listaFormasPagamento = new ArrayList<FormaPagamento>();
	private static ArrayList <Funcionario> listaFuncionarios = new ArrayList<Funcionario>(2);
	
	
	public static void adicionarFuncionario() {
		Funcionario f1 = new Funcionario("Ravier de Oliveira","123.456", "Administrador", "217125708");
		Funcionario f2 = new Funcionario("Dimitri Marinho", "789.101112", "Administrador", "216215220" );
		
		listaFuncionarios.add(f1);
		listaFuncionarios.add(f2);
	}
	
	public static void adicionarProduto(Produto p) {
		Estoque.add(p);
	}
	
	public static void adicionarCliente(Cliente c) {
		listaClientes.add(c);
	}
	
	public static void adicionarFormaPagamento(FormaPagamento f) {
		listaFormasPagamento.add(f);
	}
	
	public static int removerProduto(String id) {
		int cont = 0;
		for(int i = 0; i < Estoque.size(); i++) {
			if(id.equals(Estoque.get(i).getId())){
				Estoque.remove(Estoque.get(i));
				cont = 1;
				break;
			}
		}
		return cont;
	}
	
	public static int removerCliente(String nome) {
		int cont = 0;
		for(int i = 0; i < listaClientes.size(); i++) {
			if(nome.equals(listaClientes.get(i).getNome())){
				listaClientes.remove(listaClientes.get(i));
				cont = 1;
				break;
			}
		}
		
		return cont;
	}
	
	public static int removerFormaPagamento(int id) {
		int cont = 0;
		for(int i = 0; i < listaFormasPagamento.size(); i++) {
			if(id == listaFormasPagamento.get(i).getId()){
				listaFormasPagamento.remove(listaFormasPagamento.get(i));
				cont = 1;
				break;
			}
		}
		
		return cont;
	}
	
	

	public static ArrayList<Produto> getEstoque() {
		return Estoque;
	}

	public static void setEstoque(ArrayList<Produto> estoque) {
		Estoque = estoque;
	}

	public static ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public static void setListaClientes(ArrayList<Cliente> listaClientes) {
		Loja.listaClientes = listaClientes;
	}

	public static ArrayList<FormaPagamento> getListaFormasPagamento() {
		return listaFormasPagamento;
	}

	public static void setListaFormasPagamento(ArrayList<FormaPagamento> listaFormasPagamento) {
		Loja.listaFormasPagamento = listaFormasPagamento;
	}

	public static String getNome() {
		return nome;
	}

	public static ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public static void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		Loja.listaFuncionarios = listaFuncionarios;
	}

	
	
	
	
	
	
}
