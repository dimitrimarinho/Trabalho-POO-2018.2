package geekStore;

import javax.swing.JOptionPane;

public class Games extends Produto implements AlterarCarrinho {

	private String categoria, plataforma, desenvolvedora, dataLancamento, idioma, legenda, resolucao, adicional;
	private int idadeRecomendada, numeroOnline, numeroOffline;
	
	public Games(String id, String nome, String descricao, double preco, boolean disponibilidade, int unidadesDisponiveis,
			String categoria,String plataforma, String desenvolvedora, String dataLancamento, String idioma, 
			String legenda, String resolucao, String adicional, int idadeRecomendada, int numeroOnline, int numeroOffline) {
		
		super(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis);
		this.categoria = categoria;
		this.plataforma = plataforma;
		this.desenvolvedora = desenvolvedora;
		this.dataLancamento = dataLancamento;
		this.idioma = idioma;
		this.legenda = legenda;
		this.resolucao = resolucao;
		this.adicional = adicional;
		this.idadeRecomendada = idadeRecomendada;
		this.numeroOnline = numeroOnline;
		this.numeroOffline = numeroOffline;
	}
	
	
	public void adicionarItem(Produto games) {
		int verif = JOptionPane.DEFAULT_OPTION, dec = games.getUnidadesDisponiveis(), quant;
		String verif2 = "M";
		if(games.isDisponibilidade() == true) {
			verif = JOptionPane.showConfirmDialog(null, "Deseja Adicionar o Produto Ao Carrinho?");
			if(verif == JOptionPane.YES_OPTION) {
				while(verif2.equals("M") ) {
					try {
						quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade do Produto:"));
					}catch(NumberFormatException ex) {
						throw new NumberFormatException("A Quantidade Deve Ser Um Numero Inteiro");
					}
					
					if(quant <= 0) {
						throw new IllegalArgumentException("A Quantidade Deve Ser Um Numero Inteiro Positivo");
					}
					
					if(quant >= 1 && quant <= dec ) {
						CarrinhoCompra.adicionarProduto(games,quant);
						JOptionPane.showMessageDialog(null, "     Produto Adicionado!");
						games.setUnidadesDisponiveis(dec - quant);
						if(games.getUnidadesDisponiveis() == 0) {
							games.setDisponibilidade(false);
						}
						verif2 = "OK";
					}else {
						JOptionPane.showMessageDialog(null, "     Quantidade Invalida!");
					}
				}
			}
		}else 
			JOptionPane.showMessageDialog(null, "Nao ha estoque do produto solicitado");				
	}
		
		
	@Override
	public String toString(){
		return ("Nome: "+super.getNome()
		+"\nDescricao: "+super.getDescricao()
		+"\nPreco: "+super.getPreco()
		+"\nDisponibilidade: "+super.isDisponibilidade()
		+"\nUnidades: "+super.getUnidadesDisponiveis()
		+"\nCategoria: "+getCategoria()
		+"\nPlataforma: "+getPlataforma()
		+"\nDesenvolvedora: "+getDesenvolvedora()
		+"\nData de Lancamento: "+getDataLancamento()
		+"\nIdioma(s): "+getIdioma()
		+"\nLegenda(s): "+getLegenda()
		+"\nResolucao: "+getResolucao()
		+"\nInclui: "+getAdicional()
		+"\nIdade Recomendada: "+getIdadeRecomendada()
		+"\nN� Jogadores Online: "+getNumeroOnline()
		+"\nN� Jogadores Offline: "+getNumeroOffline());
		
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public String getAdicional() {
		return adicional;
	}

	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	public int getIdadeRecomendada() {
		return idadeRecomendada;
	}

	public void setIdadeRecomendada(int idadeRecomendada) {
		this.idadeRecomendada = idadeRecomendada;
	}


	public int getNumeroOnline() {
		return numeroOnline;
	}


	public void setNumeroOnline(int numeroOnline) {
		this.numeroOnline = numeroOnline;
	}


	public int getNumeroOffline() {
		return numeroOffline;
	}


	public void setNumeroOffline(int numeroOffline) {
		this.numeroOffline = numeroOffline;
	}
	
	
	
}