package exibirProdutos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import geekStore.*;
import icones.*;

public class ExibirProdutos {
	
	public static void exibirProduto(Camisa c) {
		ImageIcon camisa = Icones.iconeCamisa();
		JOptionPane.showMessageDialog(null, c.toString(), "Informacoes do Produto", JOptionPane.INFORMATION_MESSAGE, camisa);
		
	}
	
	public static void exibirProduto(Colecionaveis co) {
		ImageIcon colecionavel = Icones.iconeColecionavel();
		JOptionPane.showMessageDialog(null, co.toString(), "Informacoes do Produto",JOptionPane.INFORMATION_MESSAGE, colecionavel);
		
	}
	
	public static void exibirProduto(Livro l) {
		ImageIcon livro = Icones.iconeLivro();
		JOptionPane.showMessageDialog(null, l.toString(), "Informacoes do Produto",JOptionPane.INFORMATION_MESSAGE, livro);
		
	}
	
	public static void exibirProduto(Games g) {
		ImageIcon game = Icones.iconeGames();
		JOptionPane.showMessageDialog(null, g.toString(), "Informacoes do Produto", JOptionPane.INFORMATION_MESSAGE, game);
		
	}
	
	public static void exibirProduto(Quadrinho q) {
		ImageIcon quadrinho = Icones.iconeQuadrinho();
		JOptionPane.showMessageDialog(null, q.toString(), "Informacoes do Produto", JOptionPane.INFORMATION_MESSAGE, quadrinho);
	}
	
	public static void exibirProduto(Manga m) {
		ImageIcon manga = Icones.iconeManga();
		JOptionPane.showMessageDialog(null, m.toString(), "Informacoes do Produto", JOptionPane.INFORMATION_MESSAGE, manga);
		
	}
	
	public static void exibirProduto(Botton b) {
		ImageIcon botton = Icones.iconeBotton();
		JOptionPane.showMessageDialog(null, b.toString(), "Informacoes do Produto", JOptionPane.INFORMATION_MESSAGE, botton);
		
	}
	
	public static void exibirProduto(Estojo e) {
		ImageIcon estojo = Icones.iconeEstojo();
		JOptionPane.showMessageDialog(null, e.toString(), "Informacoes do Produto", JOptionPane.INFORMATION_MESSAGE, estojo);
		
	}
	

}
