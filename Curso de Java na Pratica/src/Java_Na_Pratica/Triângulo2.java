package Java_Na_Pratica;

import java.util.*;//Importa todos dos pacotes do Java
//Programa que determinase o tri�ngulo � equilatero, is�celes ou escaleno.

public class Tri�ngulo2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		//Entrada dedados
		System.out.println("Digite o primeiro lado do tri�ngulo: ");// Entrada de dados pelo usu�rio
		float lado1 = in.nextFloat();
		
		System.out.println("Digite o segundo lado do tri�ngulo: "); // Entrada de dados pelo usu�rio
		float lado2 = in.nextFloat();
		
		System.out.println("Digite o terceiro lado do tri�ngulo: ");// Entrada de dados pelo usu�rio
		float lado3 = in.nextFloat();
		
		
		//Condi��o if
		
		if(lado1==lado2 && lado2==lado3 && lado3==lado1) {
			
			
			System.out.println("Equilatero, todos os lados iguais!");
		}
		
		else if(lado1!=lado2 && lado2!=lado3 && lado3!=lado1) {
			
			System.out.println("Escaleno, todos os lado diferentes!");
			
			
		}else  {
			
			
			System.out.println("Is�celes, um lado diferente, os outros iguais!");
		}
		
		
		
		
	}

}
