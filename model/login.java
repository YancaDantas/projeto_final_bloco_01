package conta.model;

public class login extends Cadastro {

	    public login(String nomeCliente, String email, String telefone, String endereco, String senha) {
	        super(nomeCliente, email, telefone, endereco, senha);
	    }

	    public void cadastrarCliente(String nomeCliente, String email, String telefone, String endereco, String senha) {
	        
	        setNomeCliente(nomeCliente);
	        setEmail(email);
	        setTelefone(telefone);
	        setEndereco(endereco);
	        setSenha(senha);
	    }

	    public void atualizarCadastro(String email, String novoEmail, String novoTelefone, String novoEndereco, String novaSenha) {
	        if (getEmail().equals(email)) {
	            setEmail(novoEmail);
	            setTelefone(novoTelefone);
	            setEndereco(novoEndereco);
	            setSenha(novaSenha);
	            System.out.println("Cadastro atualizado com sucesso.");
	        } else {
	            System.out.println("Não foi possível atualizar o cadastro. Cliente não encontrado.");
	        }
	    }

	   
	}
