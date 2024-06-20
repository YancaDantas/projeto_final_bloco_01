package conta.model;

public abstract class Livros {
		
		public String nomeLivro;
		public String generoLivro;
		public String autorLivro;
		public String editor;
		public String carrinho;
		public String cadastrarLivro;
		public float valor;
		
		public Livros(String nomeLivro, String generoLivro, String autorLivro, String editor, String carrinho, String cadastrarLivro) {
			
			this.nomeLivro = nomeLivro;
			this.generoLivro = generoLivro;
			this.autorLivro = autorLivro;
			this.editor = editor;
			this.carrinho = carrinho;	
			this.cadastrarLivro = cadastrarLivro;
			this.valor = valor;
			
		}

		public String getNomeLivro() {
			return nomeLivro;
		}

		public void setNomeLivro(String nomeLivro) {
			this.nomeLivro = nomeLivro;
		}

		public String getGeneroLivro() {
			return generoLivro;
		}

		public void setGeneroLivro(String generoLivro) {
			this.generoLivro = generoLivro;
		}

		public String getAutorLivro() {
			return autorLivro;
		}

		public void setAutorLivro(String autorLivro) {
			this.autorLivro = autorLivro;
		}

		public String getEditor() {
			return editor;
		}

		public void setEditor(String editor) {
			this.editor = editor;
		}

		public String getCarrinho() {
			return carrinho;
		}

		public void setCarrinho(String carrinho) {
			this.carrinho = carrinho;
		}
		
		public void setCadastrarLivros(String cadastrarLivro) {
			this.cadastrarLivro = cadastrarLivro;
			
		}
		
		public void setValor(float valor) {
			this.valor = valor;
		}
}


