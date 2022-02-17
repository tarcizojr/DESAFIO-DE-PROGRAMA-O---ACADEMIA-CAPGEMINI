package Desafio01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de vezes: ");
		int n =Integer.parseInt(leitor.nextLine());
		
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
