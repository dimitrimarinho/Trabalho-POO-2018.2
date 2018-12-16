package financeiroLoja;

public abstract class FormaPagamento {

		private String tipo;
		private int id, prazoPagamento;
		private boolean ativo;
		
		public FormaPagamento(int id, String tipo, int prazoPagamento, boolean ativo) {
			this.id = id;
			this.tipo = tipo;
			this.prazoPagamento = prazoPagamento;
			this.ativo = ativo;
			
		}
		
		@Override
		public String toString() {
			return("ID: "+getId()
			+"\nTipo: "+getTipo()
			+"\nPrazo de Pagamento: "+getPrazoPagamento() + " Dias"
			+"\nStatus: "+isAtivo());
			
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getPrazoPagamento() {
			return prazoPagamento;
		}

		public void setPrazoPagamento(int prazoPagamento) {
			this.prazoPagamento = prazoPagamento;
		}

		public boolean isAtivo() {
			return ativo;
		}

		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}

		

		
}
