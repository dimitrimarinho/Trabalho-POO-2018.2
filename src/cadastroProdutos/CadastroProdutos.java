package cadastroProdutos;

import geekStore.*;


import javax.swing.JOptionPane;

public class CadastroProdutos {
	
	public static int cadastroCamisa() {
		Produto c;
		String id, nome, descricao, modelo, material, cor, fornecedor, ilustrador, tamanho;
		double preco;
		boolean disponibilidade = true;
		int unidadesDisponiveis, cont = 0;
		
		id = JOptionPane.showInputDialog("Informe o ID da Camisa:");
		for(int i = 0; i< Loja.getEstoque().size(); i++) {
			if(Loja.getEstoque().get(i).getId().equals(id)) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		if(cont!=1) {
			nome  = JOptionPane.showInputDialog("Informe o Nome da Camisa:");
			descricao = JOptionPane.showInputDialog("Informe a Descricao da Camisa:");
			
			try {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preco da Camisa:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Preco Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(preco < 0) {
				throw new IllegalArgumentException("O Preco Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				unidadesDisponiveis = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Unidades Disponiveis:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("As Unidades Disponiveis Devem Ser Numeros Inteiros");
			}
			
			if(unidadesDisponiveis <= 0) {
				throw new IllegalArgumentException("As Unidades Disponiveis Devem Ser Numeros Inteiros Positivos");
			}
			
			modelo = JOptionPane.showInputDialog("Informe o Modelo da Camisa:");
			material = JOptionPane.showInputDialog("Informe o Material da Camisa:");
			cor = JOptionPane.showInputDialog("Informe a Cor da Camisa:");
			fornecedor = JOptionPane.showInputDialog("Informe o Fornecedor da Camisa:");
			ilustrador = JOptionPane.showInputDialog("Informe o Ilustrador da Camisa:");
			tamanho = JOptionPane.showInputDialog("Informe o Tamanho da Camisa:");
			
			c = new Camisa(id, nome,descricao,preco,disponibilidade,unidadesDisponiveis,modelo,material,cor,fornecedor,ilustrador,tamanho);
			Loja.adicionarProduto(c);
		}
		
		return cont;
		
		
	}
		
	public static int cadastroColecionaveis() {
		Produto co;
		String id, nome, descricao, categoria, dimensoes, conteudoCaixa, material, marca;
		double preco, peso;
		boolean disponibilidade = true;
		int unidadesDisponiveis, cont = 0;
		
		id = JOptionPane.showInputDialog("Informe o ID do Colecionavel:");
		for(int i = 0; i< Loja.getEstoque().size(); i++) {
			if(Loja.getEstoque().get(i).getId().equals(id)) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		if(cont!=1) {
			nome  = JOptionPane.showInputDialog("Informe o Nome do Colecionavel:");
			descricao = JOptionPane.showInputDialog("Informe a Descricao do Colecionavel:");
			
			try {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preco do Colecionavel:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Preco Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(preco < 0) {
				throw new IllegalArgumentException("O Preco Deve Ser Um Numero Real ou Positivo");
			}
			
			try {
				unidadesDisponiveis = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Unidades Disponiveis:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("As Unidades Disponiveis Devem Ser Numeros Inteiros");
			}
			
			if(unidadesDisponiveis <= 0) {
				throw new IllegalArgumentException("As Unidades Disponiveis Devem Ser Numeros Inteiros Positivos");
			}
			
			categoria = JOptionPane.showInputDialog("Informe a Categoria do Colecionavel:");
			dimensoes = JOptionPane.showInputDialog("Informe as Dimensoes do Colecionavel:");
			conteudoCaixa = JOptionPane.showInputDialog("Informe o Conteudo da Caixa do Colecionavel:");
			material = JOptionPane.showInputDialog("Informe o Material do Colecionavel:");
			marca = JOptionPane.showInputDialog("Informe a Marca do Colecionavel:");
			
			try {
				peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Colecionavel:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Peso Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(peso <= 0) {
				throw new IllegalArgumentException("O Peso Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			co = new Colecionaveis(id, nome,descricao,preco,disponibilidade,unidadesDisponiveis,
			categoria,dimensoes,conteudoCaixa,material,marca,peso);
			Loja.adicionarProduto(co);
		}
		
		return cont;
	}
		
	public static int cadastroLivro() {
		Produto l;
		String id, nome, descricao, categoria, editora, iSBN, materialCapa, idioma, autor, numeroEdicao;
		double preco, peso;
		int unidadesDisponiveis, anoLancamento, paginas, cont = 0;
		boolean disponibilidade = true;
		
		id  = JOptionPane.showInputDialog("Informe o ID do Livro:");
		for(int i = 0; i< Loja.getEstoque().size(); i++) {
			if(Loja.getEstoque().get(i).getId().equals(id)) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		if(cont!=1) {
			nome  = JOptionPane.showInputDialog("Informe o Titulo do Livro:");
			descricao = JOptionPane.showInputDialog("Informe a Descricao do Livro:");
			
			try {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preco do Livro:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Preco Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(preco < 0) {
				throw new IllegalArgumentException("O Preco Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				unidadesDisponiveis = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Unidades Disponiveis:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("As Unidades Disponiveis Devem Ser Numeros Inteiros");
			}
			
			if(unidadesDisponiveis <= 0) {
				throw new IllegalArgumentException("As Unidades Disponiveis Devem Ser Numeros Inteiros Positivos");
			}
			
			categoria = JOptionPane.showInputDialog("Informe a Categoria do Livro:");
			editora = JOptionPane.showInputDialog("Informe a Editora do Livro:");
			iSBN = JOptionPane.showInputDialog("Informe o ISBN do Livro:");
			materialCapa = JOptionPane.showInputDialog("Informe o Tipo de Material da Capa do Livro:");
			idioma = JOptionPane.showInputDialog("Informe o Idioma do Livro:");
			
			try {
				peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Livro:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Peso Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(peso <= 0) {
				throw new IllegalArgumentException("O Peso Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				anoLancamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano de Lancamento do Livro:"));
				paginas = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Paginas do Livro:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Ano e O Numero de Paginas Devem Ser Numeros Inteiros");
			}
			
			if(anoLancamento <= 0 || paginas <= 0 ) {
				throw new IllegalArgumentException("O Ano e O Numero de Paginas Devem Ser Numeros Inteiros Positivos");
			}
			
			autor = JOptionPane.showInputDialog("Informe o Autor(es) do Livro:");
			numeroEdicao = JOptionPane.showInputDialog("Informe o Numero da Edicao do Livro:");
			
			l = new Livro(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, editora,
			iSBN, materialCapa, idioma, peso, anoLancamento, paginas, autor, numeroEdicao);
			Loja.adicionarProduto(l);
		}
		
		return cont;
	}
		
	public static int cadastroGames() {
		Produto g;
		String id, nome, descricao, categoria, plataforma, desenvolvedora, dataLancamento, idioma, legenda, resolucao, adicional;
		double preco;
		boolean disponibilidade = true;
		int unidadesDisponiveis, idadeRecomendada, numeroOnline, numeroOffline, cont = 0;
		
		id  = JOptionPane.showInputDialog("Informe o ID do Jogo:");
		for(int i = 0; i< Loja.getEstoque().size(); i++) {
			if(Loja.getEstoque().get(i).getId().equals(id)) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		
		if(cont!=1) {
			nome  = JOptionPane.showInputDialog("Informe o Nome do Jogo:");
			descricao = JOptionPane.showInputDialog("Informe a Descricao do Jogo:");
			
			try {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preco do Jogo:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Preco Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(preco < 0) {
				throw new IllegalArgumentException("O Preco Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				unidadesDisponiveis = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Unidades Disponiveis:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("As Unidades Disponiveis Devem Ser Numeros Inteiros");
			}
			
			if(unidadesDisponiveis <= 0) {
				throw new IllegalArgumentException("As Unidades Disponiveis Devem Ser Numeros Inteiros Positivos");
			}
			
			categoria = JOptionPane.showInputDialog("Informe a Categoria do Jogo:");
			plataforma = JOptionPane.showInputDialog("Informe a Plataforma do Jogo:");
			desenvolvedora = JOptionPane.showInputDialog("Informe a Desenvolvedora do Jogo:");
			dataLancamento = JOptionPane.showInputDialog("Informe a Data de Lancamento do Jogo:");
			idioma = JOptionPane.showInputDialog("Informe o(s) Idioma(s) Disponiveis no Jogo:");
			legenda = JOptionPane.showInputDialog("Informe a(s) Legenda(s) Disponiveis no Jogo:");
			resolucao = JOptionPane.showInputDialog("Informe as Resolucoes Disponiveis no Jogo:");
			adicional = JOptionPane.showInputDialog("Informe o Que Vem Incluso No Jogo:");
			
			try {
				idadeRecomendada = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade Recomendada Para o Jogo:"));
				numeroOnline = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Jogadores Disponiveis no Modo Online o Jogo:"));
				numeroOffline = numeroOnline = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Jogadores Disponiveis no Modo Online do Jogo:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("A Idade e o Numero de Jogadores Online Offline Devem Ser Numeros Inteiros");
			}
			
			if(idadeRecomendada < 10) {
				throw new IllegalArgumentException("A Idade Recomendada Deve Ser No Minimo 10 Anos.");
			}
			
			if(numeroOnline <= 0 || numeroOffline <= 0) {
				throw new IllegalArgumentException("O Numero De Jogadores Tanto Online Quanto Offline Devem Ser Positivos e Maiores Que 0");
			}
				
			g = new Games(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, plataforma,
				desenvolvedora, dataLancamento, idioma, legenda, resolucao, adicional, idadeRecomendada, numeroOnline,
				numeroOffline);
			Loja.adicionarProduto(g);
		}
			
		return cont;
	}
		
	public static int cadastroQuadrinho() {
		Produto q;
		String id, nome, descricao, categoria, editora, iSBN, materialCapa, idioma, ilustrador,
		nacionalidade, licenciador, personagemPrincipal, sagaFinalizada;
		double preco, peso;
		int unidadesDisponiveis, anoLancamento, paginas, cont = 0;
		boolean disponibilidade = true;
		
		id  = JOptionPane.showInputDialog("Informe o ID do Quadrinho:");
		for(int i = 0; i< Loja.getEstoque().size(); i++) {
			if(Loja.getEstoque().get(i).getId().equals(id)) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		
		if(cont!=1) {
			nome  = JOptionPane.showInputDialog("Informe o Titulo do Quadrinho:");
			descricao = JOptionPane.showInputDialog("Informe a Descricao do Quadrinho:");
			
			try {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preco do Quadrinho:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Preco Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(preco < 0) {
				throw new IllegalArgumentException("O Preco Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				unidadesDisponiveis = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Unidades Disponiveis:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("As Unidades Disponiveis Devem Ser Numeros Inteiros");
			}
			
			if(unidadesDisponiveis <= 0) {
				throw new IllegalArgumentException("As Unidades Disponiveis Devem Ser Numeros Inteiros Positivos");
			}
			
			categoria = JOptionPane.showInputDialog("Informe a Categoria do Quadrinho:");
			editora = JOptionPane.showInputDialog("Informe a Editora do Quadrinho:");
			iSBN = JOptionPane.showInputDialog("Informe o ISBN do Quadrinho:");
			materialCapa = JOptionPane.showInputDialog("Informe o Tipo de Material da Capa do Quadrinho:");
			idioma = JOptionPane.showInputDialog("Informe o Idioma do Quadrinho:");
			
			try {
				peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Quadrinho:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Peso Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(peso <= 0) {
				throw new IllegalArgumentException("O Peso Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				anoLancamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano de Lancamento do Quadrinho:"));
				paginas = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Paginas do Quadrinho:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Ano e O Numero de Paginas Devem Ser Numeros Inteiros");
			}
			
			if(anoLancamento <= 0 || paginas <= 0 ) {
				throw new IllegalArgumentException("O Ano e O Numero de Paginas Devem Ser Numeros Inteiros Positivos");
			}
			
			licenciador = JOptionPane.showInputDialog("Informe a Empresa que Licencia do Quadrinho:");
			nacionalidade = JOptionPane.showInputDialog("Informe a Nacionalidade do Quadrinho:");
			personagemPrincipal = JOptionPane.showInputDialog("Informe o Personagem Principal do Quadrinho:");
			ilustrador = JOptionPane.showInputDialog("Informe o(s) Ilustrador(es) do Quadrinho:");
			sagaFinalizada =JOptionPane.showInputDialog("A Saga do Quadrinho Esta Finalizada? (Sim/Nao)");
			
			q = new Quadrinho(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria, editora,
			iSBN, materialCapa, idioma, peso, anoLancamento, paginas, nacionalidade, personagemPrincipal, sagaFinalizada, ilustrador, licenciador);
			Loja.adicionarProduto(q);
		}
		
		return cont;		
	}	
	
	public static int cadastroManga() {
		Produto m;
		String id, nome, descricao, categoria, editora, iSBN, materialCapa, idioma, mangaka,
		personagemPrincipal, ilustrador, sagaFinalizada;
		double preco, peso;
		int unidadesDisponiveis, anoLancamento, paginas, quantidadePublicada, cont = 0;
		boolean disponibilidade = true;
		
		id  = JOptionPane.showInputDialog("Informe o ID do Manga:");
		for(int i = 0; i< Loja.getEstoque().size(); i++) {
			if(Loja.getEstoque().get(i).getId().equals(id)) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		
		if(cont!=1) {
			nome  = JOptionPane.showInputDialog("Informe o Titulo do Manga:");
			descricao = JOptionPane.showInputDialog("Informe a Descricao do Manga:");
			
			try {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preco do Manga:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Preco Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(preco < 0) {
				throw new IllegalArgumentException("O Preco Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				unidadesDisponiveis = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Unidades Disponiveis:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("As Unidades Disponiveis Devem Ser Numeros Inteiros");
			}
			
			if(unidadesDisponiveis <= 0) {
				throw new IllegalArgumentException("As Unidades Disponiveis Devem Ser Numeros Inteiros Positivos");
			}
			
			categoria = JOptionPane.showInputDialog("Informe a Categoria do Manga:");
			editora = JOptionPane.showInputDialog("Informe a Editora do Manga:");
			iSBN = JOptionPane.showInputDialog("Informe o ISBN do Manga:");
			materialCapa = JOptionPane.showInputDialog("Informe o Tipo de Material da Capa do Manga:");
			idioma = JOptionPane.showInputDialog("Informe o Idioma do Manga:");
			
			try {
				peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Manga:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Peso Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(peso <= 0) {
				throw new IllegalArgumentException("O Peso Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				anoLancamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano de Lancamento do Manga:"));
				paginas = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Paginas do Manga:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Ano e O Numero de Paginas Devem Ser Numeros Inteiros");
			}
			
			if(anoLancamento <= 0 || paginas <= 0 ) {
				throw new IllegalArgumentException("O Ano e O Numero de Paginas Devem Ser Numeros Inteiros Positivos");
			}
			
			mangaka = JOptionPane.showInputDialog("Informe o Mangaka do Manga:");
			personagemPrincipal = JOptionPane.showInputDialog("Informe o Personagem Principal do Manga:");
			ilustrador = JOptionPane.showInputDialog("Informe o(s) Ilustrador(es) do Manga:");
			
			try {
				quantidadePublicada = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade Publicada do Manga:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("A Quantidade Publicada Deve Ser Um Numero Inteiro");
			}
			
			if(quantidadePublicada <= 0) {
				throw new IllegalArgumentException("A Quantidade Publicada Deve Ser Um Numero Inteiro Positivo");
			}
			
			sagaFinalizada = JOptionPane.showInputDialog("A Saga do Manga Esta Finalizada?");
			
			m = new Manga(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria,
					 editora, iSBN, materialCapa, idioma, peso, anoLancamento, paginas,
					 mangaka, personagemPrincipal, ilustrador, quantidadePublicada, sagaFinalizada);
			Loja.adicionarProduto(m);
		}
		
		return cont;
	}
		
	public static int cadastroBotton() {
		Produto b;
		String id, nome, descricao, categoria, material, dimensoes, fornecedor, franquia;
		double preco;
		boolean disponibilidade = true;
		int unidadesDisponiveis, cont = 0;
		
		id = JOptionPane.showInputDialog("Informe o ID do Botton:");
		for(int i = 0; i< Loja.getEstoque().size(); i++) {
			if(Loja.getEstoque().get(i).getId().equals(id)) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		
		if(cont!=1) {
			nome  = JOptionPane.showInputDialog("Informe o Nome do Botton:");
			descricao = JOptionPane.showInputDialog("Informe a Descricao do Botton:");
			
			try {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preco do Botton:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Preco Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(preco < 0) {
				throw new IllegalArgumentException("O Preco Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				unidadesDisponiveis = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Unidades Disponiveis:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("As Unidades Disponiveis Devem Ser Numeros Inteiros");
			}
			
			if(unidadesDisponiveis <= 0) {
				throw new IllegalArgumentException("As Unidades Disponiveis Devem Ser Numeros Inteiros Positivos");
			}
			
			categoria = JOptionPane.showInputDialog("Informe a Categoria do Botton:");
			material = JOptionPane.showInputDialog("Informe o Material do Botton:");
			dimensoes = JOptionPane.showInputDialog("Informe as Dimensoes do Botton:");
			franquia = JOptionPane.showInputDialog("Informe a Franquia do Botton:");
			fornecedor = JOptionPane.showInputDialog("Informe o Fornecedor do Botton:");
			
			b = new Botton(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria,
					material, dimensoes, franquia, fornecedor);
			Loja.adicionarProduto(b);
		}
		
		return cont;
		
	}
	
	public static int cadastroEstojo() {
		Produto e;
		String id, nome, descricao, categoria, material, dimensoes, cor, marca;
		double preco, profundidade;
		boolean disponibilidade = true;
		int unidadesDisponiveis, numeroCompartimentos, cont = 0;
		
		id  = JOptionPane.showInputDialog("Informe o ID do Estojo:");
		for(int i = 0; i< Loja.getEstoque().size(); i++) {
			if(Loja.getEstoque().get(i).getId().equals(id)) {
				JOptionPane.showMessageDialog(null, "          ID Ja Existente!");
				cont = 1;
				break;
			}
		}
		
		
		if(cont!=1) {
			nome  = JOptionPane.showInputDialog("Informe o Nome do Estojo:");
			descricao = JOptionPane.showInputDialog("Informe a Descricao do Estojo:");
			
			try {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preco do Estojo:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Preco Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(preco < 0) {
				throw new IllegalArgumentException("O Preco Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			try {
				unidadesDisponiveis = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Unidades Disponiveis:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("As Unidades Disponiveis Devem Ser Numeros Inteiros");
			}
			
			if(unidadesDisponiveis <= 0) {
				throw new IllegalArgumentException("As Unidades Disponiveis Devem Ser Numeros Inteiros Positivos");
			}
			
			categoria = JOptionPane.showInputDialog("Informe a Categoria do Estojo:");
			material = JOptionPane.showInputDialog("Informe o Material do Estojo:");
			dimensoes = JOptionPane.showInputDialog("Informe as Dimensoes do Estojo:");
			
			try {
				numeroCompartimentos = Integer.parseInt(JOptionPane.showInputDialog("Informe a Numero de Compartimentos do Estojo:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("O Numero de Compartimentos Deve Ser Inteiro");
			}
			
			if(numeroCompartimentos <= 0) {
				throw new IllegalArgumentException("O Minimo de Compartimentos Deve Ser 1");
			}
			
			try {
				profundidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a Profundidade do Estojo:"));
			}catch(NumberFormatException ex) {
				throw new NumberFormatException("A Profundidade Deve Ser Um Numero Real ou Inteiro");
			}
			
			if(profundidade <= 0) {
				throw new IllegalArgumentException("A Profundidade Deve Ser Um Numero Real ou Inteiro Positivo");
			}
			
			cor = JOptionPane.showInputDialog("Informe a Cor do Estojo:");
			marca = JOptionPane.showInputDialog("Informe a Marca do Estojo:");
			
			e = new Estojo(id, nome, descricao, preco, disponibilidade, unidadesDisponiveis, categoria,
					material, dimensoes, numeroCompartimentos, profundidade, cor, marca);
			Loja.adicionarProduto(e);
		}
		
		return cont;		
	}	
	
}