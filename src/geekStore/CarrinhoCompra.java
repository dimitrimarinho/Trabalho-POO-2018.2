package geekStore;

import java.util.ArrayList;
import java.util.Iterator;

public class CarrinhoCompra {

	private static ArrayList<Produto> carrinhoCompra;
	private static double valorParcial, valorCompra;
	private static boolean compraFinalizada;
	
	public CarrinhoCompra() {
		carrinhoCompra = new ArrayList<Produto>();
		CarrinhoCompra.valorParcial = 0;
		CarrinhoCompra.valorCompra = 0;
		CarrinhoCompra.setCompraFinalizada(false);
	}
	
	public static void adicionarProduto(Produto p) {
		carrinhoCompra.add(p);
	}
	
	public static boolean removerProduto(Produto p) {
		boolean isRemovido = false;
		for (Iterator<Produto> it = carrinhoCompra.iterator(); it.hasNext();) {
			Produto search = (Produto) it.next();
			if((search.getId()).equals(p.getId())){
				carrinhoCompra.remove(p);
				isRemovido = true;
				break;
			}			
		}
		return isRemovido;
	}

	public static void finalizarCompra() {
		setCompraFinalizada(true);
		CarrinhoCompra.valorCompra = valorParcial;
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

	public static boolean isCompraFinalizada() {
		return compraFinalizada;
	}

	public static void setCompraFinalizada(boolean compraFinalizada) {
		CarrinhoCompra.compraFinalizada = compraFinalizada;
	}
	
}
