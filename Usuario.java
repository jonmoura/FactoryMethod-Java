package modelo;

public class Usuario {
	
	public String nome;
	public String sexo;
	
	public Usuario() {}
	
	public Usuario(String sexo) {
		super();
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
