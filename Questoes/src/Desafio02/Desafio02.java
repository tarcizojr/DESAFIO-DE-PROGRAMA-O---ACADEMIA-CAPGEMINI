package Desafio02;

import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System .in);
		
		ValidadorDeSenha validarSenha = new ValidadorDeSenha();
		
		System.out.println("---Validador de Senha---");
		System.out.println("Digite a senha");
		
		String t =leitor.nextLine();
		
		while(validarSenha.validar(t) != true) {
			System.out.println("Tente Novamente");
			t =leitor.nextLine();
		}
		
		System.out.println("===Senha Segura===");

		
	}
}
