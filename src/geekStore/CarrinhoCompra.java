package geekStore;

import java.util.ArrayList;

public class CarrinhoCompra {

	private static ArrayList<Produto> carrinhoCompra;
	private static double valorParcial, valorCompra;
	private boolean compraFinalizada;
	
	public CarrinhoCompra() {
		carrinhoCompra = new ArrayList<Produto>();
		CarrinhoCompra.valorParcial = 0;
		CarrinhoCompra.valorCompra = 0;
		this.compraFinalizada = false;
	}

	public void finalizarCompra() {
		setCompraFinalizada(true);
		CarrinhoCompra.valorCompra = valorParcial;
	}
	
	public static ArrayList<Produto> getCarrinhoCompra() {
		return carrinhoCompra;
	}

	public static void setCarrinhoCompra(ArrayList<Produto> carrinhoCompra) {
		CarrinhoCompra.carrinhoCompra = carrinhoCompra;
	}

	public double getValorParcial() {
		return valorParcial;
	}

	public void setValorParcial(double valorParcial) {
		CarrinhoCompra.valorParcial = valorParcial;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		CarrinhoCompra.valorCompra = valorCompra;
	}

	public boolean isCompraFinalizada() {
		return compraFinalizada;
	}

	public void setCompraFinalizada(boolean compraFinalizada) {
		this.compraFinalizada = compraFinalizada;
	}
	
}
