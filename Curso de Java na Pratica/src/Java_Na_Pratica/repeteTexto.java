package Java_Na_Pratica;

import java.util.*;


//Fa�a um programa que exiba um texto, informado pelo usu�rio, 20 vezes e informando a quantidade
//de caracteres do texto. Fa�a um vers�o com while e outra com for.

public class repeteTexto {

	public static void main(String[] args) {
		
		System.out.println("Digite o texto: ");
		Scanner in = new Scanner(System.in);
		String texto = in.nextLine();//nextLine � usado para texto
		
		
		
		int aux = 0;
		System.out.println("Estrutura While");
		
		
		
		//Condi��o com While que exibe o texto informado pelo usu�rio 20 vezes
		while (aux < 20) {
			
			
			System.out.println(texto);
			System.out.println();// Este comando somente pula uma linha, fica uma linha em branco
			aux++;
		}
		
		System.out.println();// Este comando somente pula uma linha, fica uma linha em branco
		
		
		//Condi��o com For que exibe quantas letra tem no texto
		System.out.println("Estutura For");
		
		for(aux=0; aux<=20; aux++){
			
			
			System.out.println(texto);
			System.out.println();
		}
		
		
		System.out.println("O texto tem "+texto.length()+" caracteres");
		// O M�todo lenght da classe String conta quantos caracteres a no texto.
		
		
		
		
	}

}
