package Desafio02;

public class ValidadorDeSenha {
	public boolean validar(String s) {
		
		
		boolean letraMai =false;
		boolean letraMin =false;
		boolean numeral = false;
		boolean caracter = false;
	
		String[] senha = s.split("");
		if(senha.length < 6) {			
			System.out.println("Para Sua Senha Ficar Segura Precisa de no minimo 6 Caracters");
			return false;
		}
		for (int i =0;i < s.length();i++) {			
			if(senha[i].matches("[0-9]*")) {
				numeral = true;
			}
			else if(senha[i].matches("[a-z]*")) {
				letraMin = true;
			}
			else if(senha[i].matches("[A-Z]*")) {
				letraMai = true;
			}
			else{
				caracter = true;
			}
			
		}
		if(letraMai && letraMin && numeral && caracter == true) {
			return true;
			
		}else {
			if(!numeral) {
				System.out.println("**Para Sua Senha Ficar Segura Precisa de um Numeral");
			}
			if(!letraMai) {
				System.out.println("**Para Sua Senha Ficar Segura Precisa de uma Lera Maiuscula");
			}
			if(!letraMin) {
				System.out.println("**Para Sua Senha Ficar Segura Precisa de uma Letra Minuscula");
			}
			if(!caracter) {
				System.out.println("**Para Sua Senha Ficar Segura Precisa de um Caracter");
			}
			return false;
		}
		
	}
}
