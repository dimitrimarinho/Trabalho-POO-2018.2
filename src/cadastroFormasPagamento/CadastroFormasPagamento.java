package cadastroFormasPagamento;

import javax.swing.JOptionPane;

import financeiroLoja.*;

public class CadastroFormasPagamento {
	
	public static CartaoCredito cadastroCartao() {
		String tipo, bandeira;
		int id, prazoPagamento;
		double taxaRetencao;
		boolean ativo;
		
		id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Forma de Pagamento:"));
		tipo = JOptionPane.showInputDialog("Informe a Forma de Pagamento:");
		bandeira = JOptionPane.showInputDialog("Informe Bandeira Que Deseja Cadastrar:");
		prazoPagamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o Prazo de Pagamento:"));
		taxaRetencao = Double.parseDouble(JOptionPane.showInputDialog("Informe a Taxa de Retencao:"));
		ativo = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe o Status da Forma de Pagamento:"));
		
		CartaoCredito c = new CartaoCredito(id, tipo, prazoPagamento, ativo, bandeira, taxaRetencao);
		
		return c;
	}
	
	
	public static BoletoBancario cadastroBoleto() {
		String tipo, banco;
		int id, prazoPagamento;
		boolean ativo;
		
		id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Forma de Pagamento:"));
		tipo = JOptionPane.showInputDialog("Informe a Forma de Pagamento:");
		prazoPagamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o Prazo de Pagamento:"));
		banco = JOptionPane.showInputDialog("Informe o Banco Emissor:");
		ativo = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe o Status da Forma de Pagamento:"));
		
		BoletoBancario b = new BoletoBancario(id, tipo, prazoPagamento, ativo, banco);
		
		return b;
	
		
	}
}
