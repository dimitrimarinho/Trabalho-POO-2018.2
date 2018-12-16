package icones;

import javax.swing.ImageIcon;

public class Icones {

	
	//Icones dos Produtos
	
	public static ImageIcon iconeCamisa() {
		ImageIcon ca = new ImageIcon(Icones.class.getResource("Marvel.png"));
		return ca;
	}
	
	public static ImageIcon iconeColecionavel() {
		ImageIcon co = new ImageIcon(Icones.class.getResource("ActionFigures.png"));
		return co;
	}
	
	
	public static ImageIcon iconeLivro() {
		ImageIcon l = new ImageIcon(Icones.class.getResource("Livro.png"));
		return l;
	}
	
	public static ImageIcon iconeGames() {
		ImageIcon g = new ImageIcon(Icones.class.getResource("Games.jpg"));
		return g;
		
	}
	
	public static ImageIcon iconeQuadrinho() {
		ImageIcon q = new ImageIcon(Icones.class.getResource("Quadrinhos.png"));
		return q;
	}
	
	public static ImageIcon iconeManga() {
		ImageIcon m = new ImageIcon(Icones.class.getResource("Manga.jpg"));
		return m;
	}
	
	public static ImageIcon iconeBotton() {
		ImageIcon b = new ImageIcon(Icones.class.getResource("Bottons.png"));
		return b;
	}
	
	public static ImageIcon iconeEstojo() {
		ImageIcon e = new ImageIcon(Icones.class.getResource("Estojo.jpg"));
		return e;
	}
	
	//Icones dos Clientes
	
	public static ImageIcon iconePessoaFisica() {
		ImageIcon pf = new ImageIcon(Icones.class.getResource("PessoaFisica.jpg"));
		return pf;
	}
	
	public static ImageIcon iconePessoaJuridica() {
		ImageIcon pj = new ImageIcon(Icones.class.getResource("PessoaJuridica.png"));
		return pj;
	}
	
	
	//Icones das Formas De Pagamentos
	
	public static ImageIcon iconeCartaoCredito() {
		ImageIcon card = new ImageIcon(Icones.class.getResource("Cartao.png"));
		return card;
	}
	
	public static ImageIcon iconeBoleto() {
		ImageIcon bol = new ImageIcon(Icones.class.getResource("Boleto.png"));
		return bol;
	}
	
	public static ImageIcon iconeNota() {
		ImageIcon nota = new ImageIcon(Icones.class.getResource("Nota.png"));
		return nota;
	}
	
	//Icone da Loja
	
	public static ImageIcon iconeLoja() {
		ImageIcon logo = new ImageIcon(Icones.class.getResource("Logo.jpg"));
		return logo;
		
	}
	
	//Icone dos Menus
	
	public static ImageIcon iconeLogin() {
		ImageIcon login = new ImageIcon(Icones.class.getResource("Login.png"));
		return login;
	}
	
	//Icone das Compras
	
	public static ImageIcon iconeCarrinho() {
		ImageIcon car = new ImageIcon(Icones.class.getResource("Carrinho.png"));
		return car;
	}
}

