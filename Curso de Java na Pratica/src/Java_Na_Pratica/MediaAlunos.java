package Java_Na_Pratica;// Indica a qual pacote a classe pertence

import java.util.Scanner; // Importa a classe Scanner que pertence a pacote java util

public class MediaAlunos {

	//System.in = entrar com os dados

	public static void main(String[] args) {// o que estiver dentro do m�todo main � o que sera executado pelo java
		
//Crie um programa que obtenha a de numeros fornceidos pelo usu�rio e utilizando a classe math
		//informe qual o mair dos 3 numeros forncidos ao usu�rio.
		
		
		
//Entrada de dados		
		Scanner in = new Scanner(System.in);// Cria um objeto da classe scanner para o usuario realizar
		//Como comando new vamos instanciar o objeto da classe Scanner e armazenar em in
		
		// entrada de dados
		
		System.out.println("Infome o nome do aluno: ");// Solicita ao usuario que entre com a informa��o
		String aluno = in.next();// guarda na v�riavel in os dados informados pelo usu�rio
		
		System.out.println("Informe a primeira nota: ");
		float x = in.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		float y = in.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		float z = in.nextFloat();
		
//Processamento de dados
		
		float nota =  ((float)(x+y+z))/3;
		
		//Classe Math pertence ao pacote do java chamado java.lang esse pacote � chamado automaticamente pelo Java
		
		x = Math.max(x, y);// Compara valor de x e y e exibe o maior valor
		y = Math.max(y, z); // Compara valor de y e z e exibe o maior valor
		
		
		//Sa�da de dados
		
		System.out.printf("O aluno "+ aluno+" teve a m�dia de :  %.2f", nota);
		System.out.println("\nMaior nota � "+Math.max(x, y));
		
		
		
	}

}
