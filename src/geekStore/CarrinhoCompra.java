package geekStore;

import java.util.ArrayList;
import icones.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CarrinhoCompra {

	private static  ArrayList<Produto> carrinhoCompra = new ArrayList<Produto>();
	private static  ArrayList<Integer> qtd = new ArrayList<Integer>();
	private static  double valorParcial = 0;
	private static  double valorCompra = 0;
	
	
	
	public static void adicionarProduto(Produto p, int q) {
		carrinhoCompra.add(p);
		qtd.add(q);
	}
	
	public static boolean removerProduto(String id, int quant) {
		boolean isRemovido = false;
		for(int i = 0; i < carrinhoCompra.size(); i++) {
			if(carrinhoCompra.get(i).getId().equals(id)) {
				decrementaValorTotal(carrinhoCompra.get(i), quant);
				carrinhoCompra.remove(carrinhoCompra.get(i));
				qtd.remove(i);
				isRemovido = true;
				break;
			}
		}
	
		return isRemovido;
	}
	
	
	public static void exibirCarrinho() {
		ImageIcon car =  Icones.iconeCarrinho();
		String carrinhoCompra = "";
		ArrayList<Produto> carrinho = getCarrinhoCompra();
		ArrayList<Integer> quantidade = getQtd();
		double valorParcial =  getValorParcial();
		for(int i = 0; i < carrinho.size(); i++) {
			 carrinhoCompra = carrinhoCompra + (i+1)+ ":  " +carrinho.get(i).getId() + " " +carrinho.get(i).getNome() + " " 
					+ quantidade.get(i) + " UN x "+carrinho.get(i).getPreco() + "   "+(carrinho.get(i).getPreco() * quantidade.get(i)) + "\n";
			valorParcial = valorParcial + (carrinho.get(i).getPreco() * quantidade.get(i));
		}
		
		setValorCompra(valorParcial);
		
		JOptionPane.showMessageDialog(null, carrinhoCompra + "\nValor Total: "+getValorCompra(), "Carrinho", JOptionPane.INFORMATION_MESSAGE, car);
		
		
	}
	
	public static void decrementaValorTotal(Produto p, int qtd) {
		setValorCompra(getValorCompra() - (p.getPreco() * qtd));
	}

	
	public static ArrayList<Produto> getCarrinhoCompra() {
		return carrinhoCompra;
	}

	public static void setCarrinhoCompra(ArrayList<Produto> carrinhoCompra) {
		CarrinhoCompra.carrinhoCompra = carrinhoCompra;
	}

	public static double getValorParcial() {
		return valorParcial;
	}

	public static void setValorParcial(double valorParcial) {
		CarrinhoCompra.valorParcial = valorParcial;
	}

	public static double getValorCompra() {
		return valorCompra;
	}

	public static void setValorCompra(double valorCompra) {
		CarrinhoCompra.valorCompra = valorCompra;
	}

	public static ArrayList<Integer> getQtd() {
		return qtd;
	}

	public static void setQtd(ArrayList<Integer> qtd) {
		CarrinhoCompra.qtd = qtd;
	}

	
	
	
}