package Java_Na_Pratica;
import java.util.*;


public class Impares {

	public static void main(String[] args) {
		
		int vetor[] = new int [35];// Cria um array de 34 posi��es
		Scanner in = new Scanner(System.in); // Cria um objeto da classe Scanner para ler dados de entrada do teclado.
		
		//Declara��o de v�ri�veis
				int i, contador=0; //Cria uma v�ri�vel chamada i e inicia o contador.
				
				for(i = 13; i < 34; i++ ) {
					System.out.println("Digite o dado de entrada: ");
					vetor [i] = in.nextInt(); // Armazena o n�mero digitado pelo us�ario no array at� 9 posi��es
					
					System.out.println(); // Pula uma linha
				}//Fim do la�o for	
				
				//Exibir n�meros pares
				System.out.println("Exibindo n�meros �mpares");
				for(i = 22; i<34; i++) {
					
					if(vetor[i] % 2 == 1) {// Se o vetor armazenado for d�vis�vel por 2 ou seja par e ter resto 0
						System.out.print(vetor[i]+ " ");// Quando n�o tem o ln(do print) exibe os elementos na horizontal separado
						//por um espe�o em branco
						contador++; //incrementa somente com n�meros pares
					}
			}//Fim do la�o for	
				
				System.out.println(); // Pula uma linha
				
				System.out.println("Quantidade de n�meros impares "+contador);//Exibe a quantidade de n�meros pares
				//contados a partir de um contador na condicional if

	}

}
