package Desafio01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		//Pergunta ao usuario a quantidade de caracteres
		System.out.print("Digite a quantidade de vezes: ");
		int n =Integer.parseInt(leitor.nextLine());
		
		//Nessa seguencia de for, no for mais externo é executado a quantidade de vezes corespondete ao valor digitado pelo usuario

		//O segundo for, é rodado a quantidade de n - qual degrau esta no momento, para que seja adicionados os escaçoes em brancos, ex: se for o primeiro degrau com a entrada 6, são postos 5 espaços em branco

		//No ultimo for, é colocado a quantidade de caracter "*" correspondente ao degrau, se for o primeiro degrau de uma entrada 6, o for acima são incluidos 5 espaços em branco e um caracter

		//Por ultimo é colocado um print vazilo para pular a linha
		
		for (int i = 1; i <= n; i++) {			
			for (int j = n - i; j >= 1; j--) {  
				System.out.print(" ");			
			}	
			
			for (int k = 1; k <= i; k++) {  
				System.out.print("*"); 
				}
			System.out.println();
			}

	}
}
