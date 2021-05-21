package Java_Na_Pratica;

import java.util.*;

//Digite um c�digo que gera um numero rand�mico de 1 a 20 e o usu�rio deve adivinhar qual � esse numero.
//Realize algum teste de erro

public class Randomico1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);// Cria uma requisi��o de dados ao usu�rio
		
		int x = 0;
		int aleat = (int)(Math.random()*20); // Faz um casting expl�cto de um numero rand�mico para um numero inteiro
		//Cria um numero rad�mico convertido para um tipo inteiro de 0 a 20
		
		System.out.println("Adininhe o numero? ");
		
		while(x != aleat) {// Enquanto x estiver diferente de 0 a 20
			
			System.out.println("Digite um numero de um a 20: ");
			x = in.nextInt();// Armazena o numero digitado na vari�vel x
			
			
			//Teste de erro
			if(x < 0 || x > 20) { // Se x estiver fora da faixa de 0 a 20
				System.out.println("Numero fora do intervalo");
				
			}else if(x==aleat){//Se o numero digitado for = ao numero aleat
				System.out.println("Parab�ns! "+ x + "� o numero.");
				break;// pausa o programa
				
			
			
			}else{
				
				System.out.println(": Tente novamente ");
			}
			
		    
		
		}
		

	}

}
