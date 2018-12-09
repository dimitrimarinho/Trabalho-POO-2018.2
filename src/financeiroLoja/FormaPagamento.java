package financeiroLoja;

public abstract class FormaPagamento {

		private String nome;
		private int id;
		private boolean ativo;
		
		public FormaPagamento(String nome, int id, boolean ativo) {
			this.nome = nome;
			this.id = id;
			this.ativo = ativo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public boolean isAtivo() {
			return ativo;
		}

		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}
		
}
