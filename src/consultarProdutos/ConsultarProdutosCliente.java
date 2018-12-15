package consultarProdutos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import exibirProdutos.*;
import geekStore.*;


public class ConsultarProdutosCliente {
private static ArrayList<Produto> listaprod = Loja.getEstoque();
	
	public static void consultarCamisa() {
		Camisa c;
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Camisa) {
				ExibirProdutos.exibirProduto((Camisa) listaprod.get(i));
				c = (Camisa) listaprod.get(i);
				c.adicionarItem(c);
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	
	public static void consultarColecionavel() {
		Colecionaveis co;
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Colecionaveis) {
				ExibirProdutos.exibirProduto((Colecionaveis) listaprod.get(i));
				co = (Colecionaveis) listaprod.get(i);
				co.adicionarItem(co);
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	
	public static void consultarLivro() {
		Livro l;
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Livro) {
				ExibirProdutos.exibirProduto((Livro) listaprod.get(i));
				l = (Livro) listaprod.get(i);
				l.adicionarItem(l);
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	
	public static void consultarGame() {
		Games g;
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Games) {
				ExibirProdutos.exibirProduto((Games) listaprod.get(i));
				g = (Games) listaprod.get(i);
				g.adicionarItem(g);
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	
	public static void consultarQuadrinho() {
		Quadrinho q;
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Quadrinho) {
				ExibirProdutos.exibirProduto((Quadrinho) listaprod.get(i));
				q = (Quadrinho) listaprod.get(i);
				q.adicionarItem(q);
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	public static void consultarManga() {
		Manga m;
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Manga) {
				ExibirProdutos.exibirProduto((Manga) listaprod.get(i));
				m = (Manga) listaprod.get(i);
				m.adicionarItem(m);
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	public static void consultarBotton() {
		Botton b;
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Botton) {
				ExibirProdutos.exibirProduto((Botton) listaprod.get(i));
				b = (Botton) listaprod.get(i);
				b.adicionarItem(b);
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
	public static void consultarEstojo() {
		Estojo e;
		int cont = 0;
		for(int i = 0;  i < listaprod.size(); i++) {
			if(listaprod.get(i) instanceof Estojo) {
				ExibirProdutos.exibirProduto((Estojo) listaprod.get(i));
				e = (Estojo) listaprod.get(i);
				e.adicionarItem(e);
				cont = 1;
			}
		}
		
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");
		}
	}
	
	
	
}


