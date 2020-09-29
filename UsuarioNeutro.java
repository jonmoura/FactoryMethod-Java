package modelo;

public class UsuarioNeutro extends Usuario {
	
	public UsuarioNeutro (String nome) {
		this.nome = nome;
		System.out.println("Olá, " + this.nome);
	}

}
