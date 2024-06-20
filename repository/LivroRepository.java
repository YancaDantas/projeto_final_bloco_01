package repository;

import conta.model.Livros;
import conta.model.Cadastro;

public interface LivroRepository {
	
	public void cadastrarLivro(String listaLivros);
	public void buscarLivroPorNome(String nomeLivro);
	public void buscarLivroPorGenero(String listaLivros);
	public void adicionarNoCarrinho (String carrinho, String nomeLivro);
	public void removerDoCarrinho (String carrinho, String nomeLivro);

	
	public void cadastrarCliente(String login);
	public void atualizarCadastro(String email, String endereco, String telefone);
	
	
	

}
