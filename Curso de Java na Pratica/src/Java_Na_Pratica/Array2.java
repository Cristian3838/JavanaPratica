package Java_Na_Pratica; // Informa a qual pacote a classe pertence

import java.util.*;

//Escreva um c�digo que contenha um m�todo que crie um array e outro que altere este array.
//Os m�todos devem receber um array com par�metro

public class Array2 {
	
	
	//########Segundo passo#######
	//Cria��o de um m�todo que altera o array
	
	public void alteraArray(int vetor[]) {
		//Void n�o exive valor de retorno
		//M�todo modificador de acesso p�blico
		//Recebe como par�metro o vetor criado de 5 elementos na linha 34
		//Um array no  Java � considerado um objeto
		
		for (int i = 0; i<vetor.length; i++)
			vetor[i] = vetor[i]*i;
		
		//vetor[i] = representa o primeiro elemento na posi��o 0 que seria o numero 5
		//i representa a posi��o 0 que est� sendo inicializado
		//sendo assim vetor[5] = vetor[5]*0=0
		//sendo assim vetor[8] = vetor[8]*1=8
		//sendo assim vetor[11] = vetor[11]*2=22
		//sendo assim vetor[15] = vetor[15]*3=45
		//sendo assim vetor[18] = vetor[18]*4=72
	}
	
	
	//Cria��o de um m�todo que exibe um array
	public void exibeArray(int vetor[]) {
		for(int i = 0; i< vetor.length; i++ )
			System.out.println(vetor[i]);
		
	}
	

	public static void main(String[] args) {
		
		
		//Nota: No array s� podemos inserir um tipo de dados nele
		
		
		//########Primeiro passo#######
		
		
		// Declara��o de vari�veis
		int vetor[] = {5,8,11,15,18};// Cria��o de um array
		Array2 a2 = new Array2();// Cria��o e instancia de Array2 para chamar os m�todos da classe Array
		// e atribui a vari�vel de refer�ncia array a2
		
		/*
		 
		 int vetor [] = new vetor[5]; cria um objeto vetor e recebe como par�metro 5 numeros
		 vetor[0] = 1;
		 vetor[1] = 2;
		 vetor[2] = 3;
		 vetor[3] = 4;
		 vetor[4] = 5;
		 
		 */
		
		System.out.println("Imprime vetor original");
		a2.exibeArray(vetor); //M�todo exibe o vetor passando com par�metro o vetor
		a2.alteraArray(vetor); // M�todo altera o vetor passando como par�metro o vetor
		
		
		System.out.println("Imprime vetor alterado");
		a2.exibeArray(vetor);// Nesta linha o m�todo j� exibe o array alterado
		

	}

}
