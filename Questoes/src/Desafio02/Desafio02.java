package Desafio02;

import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System .in);
		//Instanciação da classe ValidadorDeSenha
		ValidadorDeSenha validarSenha = new ValidadorDeSenha();
		//Solicitando ao usuario que informe a senha que deve ser verificada
		System.out.println("---Validador de Senha---");
		System.out.println("Digite a senha");		
		String t =leitor.nextLine();
		
		//Verificação da segurança da senha, caso seja insegura é solicotado que informea novamente
		while(validarSenha.validar(t) != true) {
			System.out.println("Tente Novamente");
			t =leitor.nextLine();
		}
		//Caso a senha seja segura o programa para é e informado ao usuario que sua senha é segura
		System.out.println("===Senha Segura===");

		
	}
}
