package Java_Na_Pratica;
import java.util.*;

public class Menu {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int menu = 0;
		menu = in.nextInt();
		
		System.out.println("Escolha o menu de op��es abaixo!");
		System.out.println("1 - NetFlix, 2 - HBO, 3 - Amazon Prime, 4 - Sair do sistema.");
		System.out.println("Qual sua escolha: ");
		
		
		
		switch(menu) {
		
		case 1:
			System.out.println("Abrindo programa��o NetFlix!");
			break;
			
		case 2:
			System.out.println("Abrindo programa��o HBO!");
			break;
		
		case 3:
			System.out.println("Abrindo Amazon Prime!");
			break;
			
		case 4:
			System.out.println("Sair do sistema!");
			break;
			
			default:
				System.out.println("Voc� deve escolher as op��es 1,2 ou 3!");
				break;
		
		
		}
		
	}

}
