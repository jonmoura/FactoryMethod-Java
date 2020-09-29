package modelo;

public class FactoryUsuario {
	
	public Usuario getUsuario(String nome, String sexo) {
		if (sexo.equals("M"))
			return new UsuarioHomem(nome);
		if (sexo.equals("F"))
			return new UsuarioMulher(nome);
		if (sexo.equals("N"))
			return new UsuarioNeutro(nome);
		return null;
	}

}
