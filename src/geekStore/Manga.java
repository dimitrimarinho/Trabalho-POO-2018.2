package geekStore;

public class Manga extends Titulo {
	
	private String mangaka;
	private int quantidadePublicada;
	private boolean sagaFinalizada;
	
	public Manga(String nome, String descricao, double preco, boolean disponibilidade, String categoria, String editora,
			String iSBN, String materialCapa, String idioma, double peso, int anoLancamento, int paginas,
			String mangaka, int quantidadePublicada, boolean sagaFinalizada) {
		super(nome, descricao, preco, disponibilidade, categoria, editora, iSBN, materialCapa, idioma, peso,
				anoLancamento, paginas);
		this.mangaka = mangaka;
		this.quantidadePublicada = quantidadePublicada;
		this.sagaFinalizada = sagaFinalizada;
	}

	public String getMangaka() {
		return mangaka;
	}

	public void setMangaka(String mangaka) {
		this.mangaka = mangaka;
	}

	public int getQuantidadePublicada() {
		return quantidadePublicada;
	}

	public void setQuantidadePublicada(int quantidadePublicada) {
		this.quantidadePublicada = quantidadePublicada;
	}

	public boolean isSagaFinalizada() {
		return sagaFinalizada;
	}

	public void setSagaFinalizada(boolean sagaFinalizada) {
		this.sagaFinalizada = sagaFinalizada;
	}
	
}
