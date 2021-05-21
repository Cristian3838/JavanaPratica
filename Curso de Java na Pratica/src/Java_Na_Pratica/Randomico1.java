package Java_Na_Pratica;

import java.util.*;

//Digite um código que gera um numero randômico de 1 a 20 e o usuário deve adivinhar qual é esse numero.
//Realize algum teste de erro

public class Randomico1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);// Cria uma requisição de dados ao usuário
		
		int x = 0;
		int aleat = (int)(Math.random()*20); // Faz um casting explícto de um numero randômico para um numero inteiro
		//Cria um numero radômico convertido para um tipo inteiro de 0 a 20
		
		System.out.println("Adininhe o numero? ");
		
		while(x != aleat) {// Enquanto x estiver diferente de 0 a 20
			
			System.out.println("Digite um numero de um a 20: ");
			x = in.nextInt();// Armazena o numero digitado na variável x
			
			
			//Teste de erro
			if(x < 0 || x > 20) { // Se x estiver fora da faixa de 0 a 20
				System.out.println("Numero fora do intervalo");
				
			}else if(x==aleat){//Se o numero digitado for = ao numero aleat
				System.out.println("Parabéns! "+ x + "é o numero.");
				break;// pausa o programa
				
			
			
			}else{
				
				System.out.println(": Tente novamente ");
			}
			
		    
		
		}
		

	}

}
