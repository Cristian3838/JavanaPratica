package Java_Na_Pratica;

import java.util.Scanner;
//import java.util.*  "isso importa todas as classes do pacote java.util"

public class Triangulo {
	
	//Realize um programa que calcule a hipotenusa de um triângulo retângulo a partir dos catetos
	//h² = a²+ b²

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		double hipotenusa;
		
		
		//Entrada de dados
		
		System.out.println("Informe o valor do cateto1: ");
		float cateto1 = in.nextFloat();
		
		System.out.println("Inform o valor do cateto2: ");
		float cateto2 = in.nextFloat();
		
		
		//Processamento de dados
		hipotenusa = Math.sqrt(Math.pow(cateto1,2)+ (Math.pow(cateto2,2)));
		//A Raíz quadrada Math.sqrt
		//Math.pow eleva um numero a outro
		
		System.out.println("A Hipotenusa é: "+Math.round(hipotenusa));
		//Math.round arredonda o reultado caso dê algum valor quebrado.
		
	

	}

}
