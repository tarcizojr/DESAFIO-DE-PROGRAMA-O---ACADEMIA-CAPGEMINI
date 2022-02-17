package Desafio03;

import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System .in);
		
		System.out.println("Qual a Palavra");
		String palavra = leitor.nextLine();
		
		String[] lista = qtdAnagrama(palavra);
		System.out.println(lista.length);
	}
	

	public static String[] qtdAnagrama(String palavra) {
		String[] lista = new String[palavra.length()];

		if (palavra.length() >= 1) { 
			for (int i = 0; i < palavra.length(); i++) {				
				String anterior = palavra.substring(0, i); 
				String posterior = palavra.substring(i + 1); 
				qtdAnagrama(anterior + posterior);				
			}
		}
	
		return lista;
	}

}
