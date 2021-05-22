package Java_Na_Pratica;

import java.util.*;

//Desenvolver um c�digo que o usu�rio digite seu nome e caucule a quantidade de 
//carateres desse nome (espa�o em branco conta) 
//Se a quantidade for par, o sistema mostra todo em ma�scula, se for �mpar mostra todo em min�scula
// e no final verifica se o �ltimo caracter � vogal ou consoante.


public class String1 {

	public static void main(String[] args) {
		
		//Objeto criado para entrada de dados por teclado
		Scanner in = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite seu nome completo: ");
		String nome = in.nextLine();
		
		int qtd = nome.length(); // Armazena a quantidade de caracteres existente no nome na vari�vel int
		//caucule a quantidade de carateres desse nome (espa�o em branco conta) 
		
	/*############################################################################################################*/	
		
		//Se a quantidade for par, o sistema mostra todo em ma�scula, se for �mpar mostra todo em min�scula
		if(qtd %2==0) {
			
			System.out.println(nome.toUpperCase());
			
		}else {
			
			System.out.println(nome.toLowerCase());
		}

	/*############################################################################################################*/	 
		
		//Verifica se o �ltimo caracter � vogal ou consoante.
		char z = nome.charAt(qtd -1);//caracter da �ltima posi��o 
		
		switch(z) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println("A �ltima letra '"+z+"' � uma vogal!");// Se a �ltima letra do nome for vogal
			break;//programa encerrado
			
			default://Caso contr�rio retonra consoante
				System.out.println("A �ltima letra '"+z+"' � consoante");
		
		
		}
		
		
		

	}

}
