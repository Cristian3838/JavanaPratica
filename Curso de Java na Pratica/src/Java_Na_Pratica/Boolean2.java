package Java_Na_Pratica;
import java.util.*;

public class Boolean2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int totalCompra;
		int idade;
		boolean resultado;
		
		
		System.out.println("Digite o total de suas compras: ");
		totalCompra = in.nextInt();
		
		System.out.println("Digite sua idade: ");
		idade = in.nextInt();
		
		
		
	    if(idade >= 18 && totalCompra >=40) {
			
			resultado = true;
			System.out.println("Parabéns, você tem 10% de desconto no total de suas compras!");
		}else {
			
			resultado = false;
			System.out.println("Condição de desconto não atendida!");
			System.out.println("Você tem que ser maior de 18 anos e ter efetuado compras acima de 40  reais!");
		}
		
		System.out.println(resultado);
	}

}
