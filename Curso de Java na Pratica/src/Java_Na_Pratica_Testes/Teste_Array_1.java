package Java_Na_Pratica_Testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Teste_Array_1 {

	@Test
	public void test_Array1() {
		
			
			int vetor[] = new int [10];// Cria um array de 9 posições
			Scanner in = new Scanner(System.in); // Cria um objeto da classe Scanner para ler dados de entrada do teclado.

	//########################################################################################################################		
			
			//Declaração de váriáveis
			int i, contador=0; //Cria uma váriável chamada i e inicia o contador.
			
			for(i = 0; i < 10; i++ ) {
				System.out.println("Elemento "+i+":");
				vetor [i] = in.nextInt(); // Armazena o número digitado pelo usúario no array até 9 posições
				
				System.out.println(); // Pula uma linha
			}//Fim do laço for	
	//#############################################################################################################			
				//Exibir números pares
				System.out.println("Exibindo números pares");
				for(i = 0; i<10; i++) {
					
					if(vetor[i] % 2 == 0) {// Se o vetor armazenado for dívisível por 2 ou seja par e ter resto 0
						System.out.print(vetor[i]+ " ");// Quando não tem o ln(do print) exibe os elementos na horizontal separado
						//por um espeço em branco
						contador++; //incrementa somente com números pares
					}
			}//Fim do laço for	
		
				
				
	//################################################################################################################
				
				System.out.println(); // Pula uma linha
				
	//################################################################################################################			
				
			
			
			
			
			System.out.println("Quantidade de números pares "+contador);//Exibe a quantidade de números pares
			//contados a partir de um contador na condicional if
			
	//################################################################################################################
			
			System.out.println();//Pula uma linha
			
	//################################################################################################################
			
			Arrays.sort(vetor);//Usando o método sort da classe Arrays para ordenar o Array vetor
			
			
			System.out.println("Exibindo oredenadamente");
			for(i = 0; i<10; i++) {
				
				System.out.println(vetor[i]);
			}
			
	//###############################################################################################################		
			
			System.out.println("Informe o elemento a ser pesquisado: ");
			int elemento = in.nextInt();
			
			System.out.println("Indice do elemento "+Arrays.binarySearch(vetor, elemento));
			
			//binary search exibe o índice de um elemento informado
			
	//################################################################################################################		

		
	}

}
