package exibirFormasPagamento;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import financeiroLoja.*;

import icones.*;

public class ExibirFormasPagamento {
	public static void exibirFormaPagamento(CartaoCredito card) {
		ImageIcon cartao = Icones.iconeCartaoCredito();
		JOptionPane.showMessageDialog(null, card.toString(), "Informacoes da Forma de Pagamento", JOptionPane.INFORMATION_MESSAGE, cartao);
	}
	
	public static void exibirFormaPagamento(BoletoBancario bol) {
		ImageIcon boleto = Icones.iconeBoleto();
		JOptionPane.showMessageDialog(null, bol.toString(), "Informacoes da Forma de Pagamento", JOptionPane.INFORMATION_MESSAGE, boleto);
	}
}
