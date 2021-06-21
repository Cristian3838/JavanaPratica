package Java_Na_Pratica;
import java.util.*;
public class While2 {

	public static void main(String[] args) {
		int numero = 0;
		int totalDeNumeros;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = in.nextInt();
		
		while(numero<=9){
			numero = numero+1;
			totalDeNumeros = numero;
			System.out.println(totalDeNumeros);
			
		}

	}

}
