package Java_Na_Pratica;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		
		System.out.println("Digite a sua nota: ");
		int nota = in.nextInt();
		
		
		
		
		switch(nota){
			
		case 0:
		case 1:
		case 2:
		case 3:
		
			System.out.println("Nota ruim, estude mais!");
			break;
			
			
		case 4:	
			System.out.println("Você esta de recuperação!");
			break;
			
		case 5:
			System.out.println("Parabéns! Você passou na prova :) ");
			break;
			
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Excelente nota!  Você passou na prova!");
			break;
		
		default: 
		System.out.println("Nota Inválida!");
		
		
			
		     }
		    
	}

}
