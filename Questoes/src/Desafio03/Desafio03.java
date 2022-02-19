package Desafio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System .in);
		
		//Entrada da palavra digitado pelo usuario
		System.out.println("Qual a Palavra");
		String palavra = leitor.nextLine();
		
		qtdAnagrama(palavra);

	}
	//Contador de Anagramas
	public static void qtdAnagrama(String palavra) {
		//Lista para armazenar os anagramas
		ArrayList<String> lista = new ArrayList<String>();
		/*Nessa sequencia de for, ele faz com que seja percorida a palavra de dos geitos destintos, pegando uma letra da palavra e a sua posterior e as comparando*/
	    for(int i = 0; i < palavra.length(); i++) {
	        for(int j = i+1; j < palavra.length(); j++) {
				/*Neste primeiro if, é verificado se as letras das posiçoes i e j são iguais, caso seja verdadeiro e o valor de i seja maior que o valor j, passamos para o segundo if*/
	            if(palavra.charAt(i) == palavra.charAt(j) && (i <j)) {        
					/*No segundo if é verificado se a letra da possição i é diferente da letra da posição j, caso sim as duas letras são assumidas como anagrama, e me todos os demais casos as letras das posiçoes i e sua seguinte i+1 tambem são consideradas anagrama  */
	                if(palavra.charAt(i) != palavra.charAt(i+1)) {              
	                  String anagrama = palavra.substring(i, j);
	                  lista.add(anagrama);

	                }
					String anagrama = palavra.substring(i, i + 1);
					lista.add(anagrama);
	            }
	        }
	    }

	/*Os anagramas identificados são colocados dentro de um ArrayList e para sabermos quantos anagramas temos, basta imprimir o tamanho desse ArrayList */
		System.out.println(lista.size());
		
	}

}
