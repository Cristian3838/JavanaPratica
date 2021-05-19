package Java_Na_Pratica;

import java.util.*;//Importa todos dos pacotes do Java
//Programa que determinase o triângulo é equilatero, isóceles ou escaleno.

public class Triângulo2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		//Entrada dedados
		System.out.println("Digite o primeiro lado do triângulo: ");// Entrada de dados pelo usuário
		float lado1 = in.nextFloat();
		
		System.out.println("Digite o segundo lado do triângulo: "); // Entrada de dados pelo usuário
		float lado2 = in.nextFloat();
		
		System.out.println("Digite o terceiro lado do triângulo: ");// Entrada de dados pelo usuário
		float lado3 = in.nextFloat();
		
		
		//Condição if
		
		if(lado1==lado2 && lado2==lado3 && lado3==lado1) {
			
			
			System.out.println("Equilatero, todos os lados iguais!");
		}
		
		else if(lado1!=lado2 && lado2!=lado3 && lado3!=lado1) {
			
			System.out.println("Escaleno, todos os lado diferentes!");
			
			
		}else  {
			
			
			System.out.println("Isóceles, um lado diferente, os outros iguais!");
		}
		
		
		
		
	}

}
