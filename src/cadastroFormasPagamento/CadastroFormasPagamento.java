package cadastroFormasPagamento;

import javax.swing.JOptionPane;

import financeiroLoja.*;
import geekStore.Loja;

public class CadastroFormasPagamento {
	
	public static int cadastroCartao() {
		FormaPagamento c;
		String tipo, bandeira;
		int id, prazoPagamento, cont = 0;
		double taxaRetencao;
		boolean ativo;
		
		id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Forma de Pagamento:"));
		for(int i = 0; i< Loja.getListaFormasPagamento().size(); i++) {
			if(Loja.getListaFormasPagamento().get(i).getId() == id) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		if(cont!=1) {
			tipo = JOptionPane.showInputDialog("Informe a Forma de Pagamento:");
			bandeira = JOptionPane.showInputDialog("Informe Bandeira Que Deseja Cadastrar:");
			prazoPagamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o Prazo de Pagamento:"));
			taxaRetencao = Double.parseDouble(JOptionPane.showInputDialog("Informe a Taxa de Retencao:"));
			ativo = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe o Status da Forma de Pagamento:"));
			
			c = new CartaoCredito(id, tipo, prazoPagamento, ativo, bandeira, taxaRetencao);
			Loja.adicionarFormaPagamento(c);
		}
		
		return cont;
	}
	
	
	public static int cadastroBoleto() {
		FormaPagamento b;
		String tipo, banco;
		int id, prazoPagamento, cont = 0;
		boolean ativo;
		
		id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Forma de Pagamento:"));
		for(int i = 0; i< Loja.getListaFormasPagamento().size(); i++) {
			if(Loja.getListaFormasPagamento().get(i).getId() == id) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		
		if(cont!=1) {
			tipo = JOptionPane.showInputDialog("Informe a Forma de Pagamento:");
			prazoPagamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o Prazo de Pagamento:"));
			banco = JOptionPane.showInputDialog("Informe o Banco Emissor:");
			ativo = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe o Status da Forma de Pagamento:"));
			
			b = new BoletoBancario(id, tipo, prazoPagamento, ativo, banco);
			Loja.adicionarFormaPagamento(b);
		
		}
		
		return cont;
	
		
	}
}
