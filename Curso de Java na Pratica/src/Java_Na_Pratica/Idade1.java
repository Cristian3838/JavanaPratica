package Java_Na_Pratica;
import java.util.*;


public class Idade1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = in.nextInt();
		
		if(idade<12) {
			
			System.out.println("Você é uma criança!");
		}else if(idade>=12 && idade<=18) {
			
			System.out.println("Você é um adolecente!");
		}else if (idade >= 65){
			
			System.out.println("Você é um idoso!");
		}else {
			
			System.out.println("Você é um adulto!");
		}
		

	}

}
