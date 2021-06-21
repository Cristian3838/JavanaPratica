package Java_Na_Pratica;
import java.util.*;

public class While {
        
	
	
	public static void main(String[] args) {
		String[] postagens = {"Olá, pessoal!", ", ", "Postagens 1",", " ,"Postagens 2"};
		
		
		int totalDePostagens = postagens.length;
		int numero = 0;
		
		while(numero < totalDePostagens) {
			System.out.print(postagens[numero]);
			System.out.print("");
			numero++;
			
		}
		

	}

}
