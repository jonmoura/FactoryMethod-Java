package modelo;

public class UsuarioMulher extends Usuario {
	
	public UsuarioMulher (String nome) {
		this.nome = nome;
		System.out.println("Seja bem-vinda, Senhora " + this.nome);
	}

}
