package exibirClientes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import financeiroLoja.*;
import icones.Icones;


public class ExibirClientes {
	
	public static void exibirPessoa(PessoaFisica f) {
		ImageIcon fisica = Icones.iconePessoaFisica();
		JOptionPane.showMessageDialog(null, f.toString(), "Informacoes do Cliente", JOptionPane.INFORMATION_MESSAGE, fisica);
	}
	
	public static void exibirPessoa(PessoaJuridica j) {
		ImageIcon juridica = Icones.iconePessoaJuridica();
		JOptionPane.showMessageDialog(null, j.toString(), "Informacoes do Cliente", JOptionPane.INFORMATION_MESSAGE, juridica);
	}
}
