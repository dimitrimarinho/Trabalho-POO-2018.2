package Teste;

import geekStore.*;
import cadastroProdutos.*;

public class main {
	
	private static Camisa ca;
	private static Colecionaveis co;
	private static Games g;
	private static Livro l;
	private static Quadrinho q;
	private static Manga m;
	private static Estojo e;
	private static Botton b;
	public static void main(String[] args) {
		ca =  Cadastros.cadastroCamisa();
		co =  Cadastros.cadastroColecionaveis();
		g =   Cadastros.cadastroGames();
		l =   Cadastros.cadastroLivro();
		q =   Cadastros.cadastroQuadrinho();
		m =   Cadastros.cadastroManga();
		e =   Cadastros.cadastroEstojo();
		b =   Cadastros.cadastroBotton();
		
		System.out.println(ca);
		System.out.println();
		System.out.println(co);
		System.out.println();
		System.out.println(g);
		System.out.println();
		System.out.println(l);
		System.out.println();
		System.out.println(q);
		System.out.println();
		System.out.println(m);
		System.out.println();
		System.out.println(e);
		System.out.println();
		System.out.println(b);
	
		
	}
}
