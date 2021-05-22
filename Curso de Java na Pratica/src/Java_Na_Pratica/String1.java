package Java_Na_Pratica;

import java.util.*;

//Desenvolver um código que o usuário digite seu nome e caucule a quantidade de 
//carateres desse nome (espaço em branco conta) 
//Se a quantidade for par, o sistema mostra todo em maíscula, se for ímpar mostra todo em minúscula
// e no final verifica se o último caracter é vogal ou consoante.


public class String1 {

	public static void main(String[] args) {
		
		//Objeto criado para entrada de dados por teclado
		Scanner in = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite seu nome completo: ");
		String nome = in.nextLine();
		
		int qtd = nome.length(); // Armazena a quantidade de caracteres existente no nome na variável int
		//caucule a quantidade de carateres desse nome (espaço em branco conta) 
		
	/*############################################################################################################*/	
		
		//Se a quantidade for par, o sistema mostra todo em maíscula, se for ímpar mostra todo em minúscula
		if(qtd %2==0) {
			
			System.out.println(nome.toUpperCase());
			
		}else {
			
			System.out.println(nome.toLowerCase());
		}

	/*############################################################################################################*/	 
		
		//Verifica se o último caracter é vogal ou consoante.
		char z = nome.charAt(qtd -1);//caracter da última posição 
		
		switch(z) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println("A última letra '"+z+"' é uma vogal!");// Se a última letra do nome for vogal
			break;//programa encerrado
			
			default://Caso contrário retonra consoante
				System.out.println("A última letra '"+z+"' é consoante");
		
		
		}
		
		
		

	}

}
