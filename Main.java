package visao;

import java.util.Scanner;
import modelo.FactoryUsuario;

public class Main {
	
	public static Scanner ler = new Scanner(System.in);
	public static String nome;
	public static String sexo;
	
	public static void main(String[] args) {
		
		FactoryUsuario factory = new FactoryUsuario();
		
		System.out.printf("Digite o seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("Informe seu sexo: \n");
		System.out.printf("Masculino (M)\n");
		System.out.printf("Feminino (F)\n");
		System.out.printf("Não responder (N)\n");
		sexo = ler.nextLine();
				
		factory.getUsuario(nome, sexo);		
	}
}
