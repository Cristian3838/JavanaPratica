package Java_Na_Pratica;
import java.util.*;


public class Impares {

	public static void main(String[] args) {
		
		int vetor[] = new int [35];// Cria um array de 34 posições
		Scanner in = new Scanner(System.in); // Cria um objeto da classe Scanner para ler dados de entrada do teclado.
		
		//Declaração de váriáveis
				int i, contador=0; //Cria uma váriável chamada i e inicia o contador.
				
				for(i = 13; i < 34; i++ ) {
					System.out.println("Digite o dado de entrada: ");
					vetor [i] = in.nextInt(); // Armazena o número digitado pelo usúario no array até 9 posições
					
					System.out.println(); // Pula uma linha
				}//Fim do laço for	
				
				//Exibir números pares
				System.out.println("Exibindo números ímpares");
				for(i = 22; i<34; i++) {
					
					if(vetor[i] % 2 == 1) {// Se o vetor armazenado for dívisível por 2 ou seja par e ter resto 0
						System.out.print(vetor[i]+ " ");// Quando não tem o ln(do print) exibe os elementos na horizontal separado
						//por um espeço em branco
						contador++; //incrementa somente com números pares
					}
			}//Fim do laço for	
				
				System.out.println(); // Pula uma linha
				
				System.out.println("Quantidade de números impares "+contador);//Exibe a quantidade de números pares
				//contados a partir de um contador na condicional if

	}

}
