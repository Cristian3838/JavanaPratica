package Java_Na_Pratica_Testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Teste_Array_1 {

	@Test
	public void test_Array1() {
		
			
			int vetor[] = new int [10];// Cria um array de 9 posi��es
			Scanner in = new Scanner(System.in); // Cria um objeto da classe Scanner para ler dados de entrada do teclado.

	//########################################################################################################################		
			
			//Declara��o de v�ri�veis
			int i, contador=0; //Cria uma v�ri�vel chamada i e inicia o contador.
			
			for(i = 0; i < 10; i++ ) {
				System.out.println("Elemento "+i+":");
				vetor [i] = in.nextInt(); // Armazena o n�mero digitado pelo us�ario no array at� 9 posi��es
				
				System.out.println(); // Pula uma linha
			}//Fim do la�o for	
	//#############################################################################################################			
				//Exibir n�meros pares
				System.out.println("Exibindo n�meros pares");
				for(i = 0; i<10; i++) {
					
					if(vetor[i] % 2 == 0) {// Se o vetor armazenado for d�vis�vel por 2 ou seja par e ter resto 0
						System.out.print(vetor[i]+ " ");// Quando n�o tem o ln(do print) exibe os elementos na horizontal separado
						//por um espe�o em branco
						contador++; //incrementa somente com n�meros pares
					}
			}//Fim do la�o for	
		
				
				
	//################################################################################################################
				
				System.out.println(); // Pula uma linha
				
	//################################################################################################################			
				
			
			
			
			
			System.out.println("Quantidade de n�meros pares "+contador);//Exibe a quantidade de n�meros pares
			//contados a partir de um contador na condicional if
			
	//################################################################################################################
			
			System.out.println();//Pula uma linha
			
	//################################################################################################################
			
			Arrays.sort(vetor);//Usando o m�todo sort da classe Arrays para ordenar o Array vetor
			
			
			System.out.println("Exibindo oredenadamente");
			for(i = 0; i<10; i++) {
				
				System.out.println(vetor[i]);
			}
			
	//###############################################################################################################		
			
			System.out.println("Informe o elemento a ser pesquisado: ");
			int elemento = in.nextInt();
			
			System.out.println("Indice do elemento "+Arrays.binarySearch(vetor, elemento));
			
			//binary search exibe o �ndice de um elemento informado
			
	//################################################################################################################		

		
	}

}
