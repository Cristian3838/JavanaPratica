package Java_Na_Pratica;
import java.util.*;
public class Boolean {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		boolean resultado;
		int n1;
		int n2;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = in.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		n2 = in.nextInt();
		
		
		if(n1>n2) {
			
			resultado =  true;
			
		}else {
			
			resultado = false;
		}
         
		
		System.out.println(resultado);
		
	}

}
