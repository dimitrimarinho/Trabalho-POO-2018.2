package consultarProdutos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import exibirProdutos.*;
import geekStore.*;

public class ConsultarProdutos {
	private static ArrayList<Produto> listaprod = Loja.getEstoque();
	
	public static void consultarCamisa() {
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Camisa) {
				ExibirProdutos.exibirProduto((Camisa) listaprod.get(i));
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	
	public static void consultarColecionavel() {
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Colecionaveis) {
				ExibirProdutos.exibirProduto((Colecionaveis) listaprod.get(i));
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	
	public static void consultarLivro() {
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Livro) {
				ExibirProdutos.exibirProduto((Livro) listaprod.get(i));
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	
	public static void consultarGame() {
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Games) {
				ExibirProdutos.exibirProduto((Games) listaprod.get(i));
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	
	public static void consultarQuadrinho() {
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Quadrinho) {
				ExibirProdutos.exibirProduto((Quadrinho) listaprod.get(i));
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	public static void consultarManga() {
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Manga) {
				ExibirProdutos.exibirProduto((Manga) listaprod.get(i));
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	public static void consultarBotton() {
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Botton) {
				ExibirProdutos.exibirProduto((Botton) listaprod.get(i));
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	public static void consultarEstojo() {
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Estojo) {
				ExibirProdutos.exibirProduto((Estojo) listaprod.get(i));
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
}
