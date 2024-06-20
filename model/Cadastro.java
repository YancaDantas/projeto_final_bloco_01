package conta.model;

public abstract class Cadastro {
	
	protected String nomeCliente;
	protected String email;
	protected String telefone;
	protected String endereco;
	private String senha;
	
	public Cadastro(String nomeCliente, String email, String telefone, String endereco, String senha) {
		
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.senha = senha;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
