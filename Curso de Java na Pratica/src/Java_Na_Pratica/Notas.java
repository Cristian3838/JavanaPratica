package Java_Na_Pratica;
import java.util.*;

//Recebe 3 notas e diz se o aluno foi aprovado ou reprovado, realiza também o casting explícito

public class Notas {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		//Entrada de dados
		
		System.out.println("Entre com a primeira nota: ");
		float nota1 = in.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		float nota2 = in.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		float nota3 = in.nextFloat();
		
		
		//Processamento de dados
		
		float media = (int)(nota1+nota2+nota3)/3;// Casting (int) tranformar uma condição de float
		//para a condição inteiro
		
		
		//Saída de dados
		System.out.println("Média do Aluno foi: "+media);
		
		//Condição
		
		
		if(media>7) {
			
			
		System.out.println("O Aluno está aprovado!");
		
		}else if(media>=5) {
			
			
			System.out.println("O Aluno está em recuperação!");
			
			
		}else {
			
			
			System.out.println("O Aluno está reprovado!");
		}
		

	}

}
