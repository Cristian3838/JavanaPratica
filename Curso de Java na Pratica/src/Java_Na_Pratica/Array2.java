package Java_Na_Pratica; // Informa a qual pacote a classe pertence

import java.util.*;

//Escreva um código que contenha um método que crie um array e outro que altere este array.
//Os métodos devem receber um array com parâmetro

public class Array2 {
	
	
	//########Segundo passo#######
	//Criação de um método que altera o array
	
	public void alteraArray(int vetor[]) {
		//Void não exive valor de retorno
		//Método modificador de acesso público
		//Recebe como parâmetro o vetor criado de 5 elementos na linha 34
		//Um array no  Java é considerado um objeto
		
		for (int i = 0; i<vetor.length; i++)
			vetor[i] = vetor[i]*i;
		
		//vetor[i] = representa o primeiro elemento na posição 0 que seria o numero 5
		//i representa a posição 0 que está sendo inicializado
		//sendo assim vetor[5] = vetor[5]*0=0
		//sendo assim vetor[8] = vetor[8]*1=8
		//sendo assim vetor[11] = vetor[11]*2=22
		//sendo assim vetor[15] = vetor[15]*3=45
		//sendo assim vetor[18] = vetor[18]*4=72
	}
	
	
	//Criação de um método que exibe um array
	public void exibeArray(int vetor[]) {
		for(int i = 0; i< vetor.length; i++ )
			System.out.println(vetor[i]);
		
	}
	

	public static void main(String[] args) {
		
		
		//Nota: No array só podemos inserir um tipo de dados nele
		
		
		//########Primeiro passo#######
		
		
		// Declaração de variáveis
		int vetor[] = {5,8,11,15,18};// Criação de um array
		Array2 a2 = new Array2();// Criação e instancia de Array2 para chamar os métodos da classe Array
		// e atribui a variável de referância array a2
		
		/*
		 
		 int vetor [] = new vetor[5]; cria um objeto vetor e recebe como parâmetro 5 numeros
		 vetor[0] = 1;
		 vetor[1] = 2;
		 vetor[2] = 3;
		 vetor[3] = 4;
		 vetor[4] = 5;
		 
		 */
		
		System.out.println("Imprime vetor original");
		a2.exibeArray(vetor); //Método exibe o vetor passando com parâmetro o vetor
		a2.alteraArray(vetor); // Método altera o vetor passando como parãmetro o vetor
		
		
		System.out.println("Imprime vetor alterado");
		a2.exibeArray(vetor);// Nesta linha o método já exibe o array alterado
		

	}

}
