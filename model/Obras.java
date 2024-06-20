package conta.model;

import conta.model.Livros;
import java.util.ArrayList;
import java.util.List;

public class Obras extends Livros {

    private List<Livros> listaLivros;

    public Obras(String nomeLivro, String generoLivro, String autorLivro, String editor) {
        super(nomeLivro, generoLivro, autorLivro, editor, "", "");
        listaLivros = new ArrayList<>();
    }

    public void cadastrarLivro(Livros livro) {
        listaLivros.add(livro);
    }

    public Livros buscarLivroPorNome(String nome) {
        for (Livros livro : listaLivros) {
            if (livro.getNomeLivro().equalsIgnoreCase(nome)) {
                return livro;
            }
        }
        return null; 
    }

    public List<Livros> buscarLivrosPorGenero(String genero) {
        List<Livros> livrosEncontrados = new ArrayList<>();
        for (Livros livro : listaLivros) {
            if (livro.getGeneroLivro().equalsIgnoreCase(genero)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados; 
    }

    
    public void adicionarNoCarrinho(Livros livro) {
        livro.setCarrinho("Sim"); 
    }

    
    public void removerDoCarrinho(Livros livro) {
        livro.setCarrinho("Não"); 
    }

    public List<Livros> getListaLivros() {
        return listaLivros;
    }
}