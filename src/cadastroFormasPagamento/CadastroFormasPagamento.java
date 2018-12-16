package cadastroFormasPagamento;



import javax.swing.JOptionPane;

import financeiroLoja.*;
import geekStore.Loja;

public class CadastroFormasPagamento {
	
	public static int cadastroCartao() {
		FormaPagamento c;
		String tipo = "Cartao de Credito", bandeira;
		int id, prazoPagamento, cont = 0, cont1 = 0;
		double taxaRetencao;
		boolean ativo = true;
		try {
			id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Forma de Pagamento:"));
		}catch (NumberFormatException ex) {
			throw new NumberFormatException("O ID Deve Ser Um Numero Inteiro");
		}
		
		if(id <= 0) {
			throw new IllegalArgumentException("O ID Deve Ser Um Numero Inteiro Positivo");
		}
		
		for(int i = 0; i< Loja.getListaFormasPagamento().size(); i++) {
			if(Loja.getListaFormasPagamento().get(i).getId() == id) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		if(cont!=1) {
			CartaoCredito card;
			bandeira = JOptionPane.showInputDialog("Informe Bandeira Que Deseja Cadastrar:");
			for(int i = 0; i< Loja.getListaFormasPagamento().size(); i++) {
				if(Loja.getListaFormasPagamento().get(i) instanceof CartaoCredito) {
					card = (CartaoCredito) Loja.getListaFormasPagamento().get(i);
					if(card.getBandeira().equals(bandeira)) {
						JOptionPane.showMessageDialog(null, "          Bandeira Ja Existente!");
						cont1 = 1;
						break;
					}
				}
			}
		
			if(cont1 !=1) {
				try {
					prazoPagamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o Prazo de Pagamento:"));
					taxaRetencao = Double.parseDouble(JOptionPane.showInputDialog("Informe a Taxa de Retencao:"));
				}catch(NumberFormatException ex) {
					throw new NumberFormatException("So Sao Permitidos Numeros Inteiros Para o Prazo de Pagamento e Numeros Reais"
							+ " Para a Taxa de Retencao.");
				}
				
				if(prazoPagamento <= 0 || taxaRetencao <= 0) {
					throw new IllegalArgumentException("So Sao Permitidos Numeros Inteiros Positivos Para o Prazo de Pagamento e Numeros Reais"
							+ " Positivos Para a Taxa de Retencao.");
				}
				
				c = new CartaoCredito(id, tipo, prazoPagamento, ativo, bandeira, taxaRetencao);
				Loja.adicionarFormaPagamento(c);
			}
		}
		
		return cont;
	}
	
	
	public static int cadastroBoleto() {
		FormaPagamento b;
		String tipo = "Boleto Bancario", banco;
		int id, prazoPagamento, cont = 0;
		boolean ativo = true;
		
		try {
			id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Forma de Pagamento:"));
		}catch (NumberFormatException ex) {
			throw new NumberFormatException("O ID Deve Ser Um Numero Inteiro");
		}
		
		if(id <= 0) {
			throw new IllegalArgumentException("O ID Deve Ser Um Numero Inteiro Positivo");
		}
		for(int i = 0; i< Loja.getListaFormasPagamento().size(); i++) {
			if(Loja.getListaFormasPagamento().get(i).getId() == id) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		
		if(cont!=1) {
			try {
				prazoPagamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o Prazo de Pagamento:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("So Sao Permitidos Numeros Inteiros Para o Prazo de Pagamento");

			}
			
			if(prazoPagamento <= 0) {
				throw new IllegalArgumentException("So Sao Permitidos Numeros Inteiros Positivos Para o Prazo de Pagamento");
			}
			
			banco = JOptionPane.showInputDialog("Informe o Banco Emissor:");

			b = new BoletoBancario(id, tipo, prazoPagamento, ativo, banco);
			Loja.adicionarFormaPagamento(b);
		
		}
		
		return cont;
	
		
	}
}
