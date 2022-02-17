package Desafio02;

public class ValidadorDeSenha {
	public boolean validar(String s) {
		
		//Parametros para uma senha mais segura
		boolean letraMai =false;
		boolean letraMin =false;
		boolean numeral = false;
		boolean caracter = false;
		
		//A senha é separada caracter a caracter
		String[] senha = s.split("");
		//Verificação do tamanho da senha, caso ela seja muito pequena, não são feitas as demais verificaçoes e é solicitado uma senha maior
		if(senha.length < 6) {			
			System.out.println("Para Sua Senha Ficar Segura Precisa de no minimo 6 Caracters");
			return false;
		}
		//Verificação dos Parametros, letra a letra elas são verificadas para saber se é uma Letra maiuscula ou minuscula, numeral ou caracter, caso seja indentificado uma dessa caracteristicas o Parametro passa a ser verdadeiro

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
		//Apois verificar todos os caracters da senha, é verificado se ela segue todos os parametros de seguraça, caso sim retornase true e a senha é dada como segura
		if(letraMai && letraMin && numeral && caracter == true) {
			return true;
		
		//Caso a senha não corresponda a todos os parametros, é verificado quais elas não atende para que possa ser mostrado ao usuario oque falta para sua senha ser segura
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
