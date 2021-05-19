package Java_Na_Pratica;

import java.util.*;


//Faça um programa que exiba um texto, informado pelo usuário, 20 vezes e informando a quantidade
//de caracteres do texto. Faça um versão com while e outra com for.

public class repeteTexto {

	public static void main(String[] args) {
		
		System.out.println("Digite o texto: ");
		Scanner in = new Scanner(System.in);
		String texto = in.nextLine();//nextLine é usado para texto
		
		
		
		int aux = 0;
		System.out.println("Estrutura While");
		
		
		
		//Condição com While que exibe o texto informado pelo usuário 20 vezes
		while (aux < 20) {
			
			
			System.out.println(texto);
			System.out.println();// Este comando somente pula uma linha, fica uma linha em branco
			aux++;
		}
		
		System.out.println();// Este comando somente pula uma linha, fica uma linha em branco
		
		
		//Condição com For que exibe quantas letra tem no texto
		System.out.println("Estutura For");
		
		for(aux=0; aux<=20; aux++){
			
			
			System.out.println(texto);
			System.out.println();
		}
		
		
		System.out.println("O texto tem "+texto.length()+" caracteres");
		// O Método lenght da classe String conta quantos caracteres a no texto.
		
		
		
		
	}

}
