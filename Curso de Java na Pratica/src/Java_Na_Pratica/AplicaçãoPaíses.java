package Java_Na_Pratica;
import java.util.*;


//Digite um c�digo que o usu�rio informe dois pa�ses, sua dimens�o em(km2), 3 pa�ses de fronteira
//e ao final o sistema verifica se o pa�s 1 faz fronteira com algum dos 3 pa�ses informados do pa�s 2
//Classes ClassePa�ses e Aplica��oPa�ses


public class Aplica��oPa�ses {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		ClassePa�ses cp1 = new ClassePa�ses();//Cria e instancia um obejto para a ClassePa�ses com a vari�vel cp1
		ClassePa�ses cp2 = new ClassePa�ses(); //Cria e instancia um obejto cp2 para acessar a ClassePa�ses com a vari�vel cp2
		String nome;
		double dimens�o;
		
		
		
		//Informa o Pa�s 1
		
		System.out.println("Nome Pa�s: ");
		nome = in.nextLine();
		cp1.setNome(nome);
		
		System.out.println("Dimens�o: ");
		dimens�o = in.nextDouble();
		
		cp1.setFronteira();
		in.nextLine();
		
		
		
		
		
		//Informa o Pa�s 2
				
		System.out.println("Digite o segundo P�is: ");
		nome = in.nextLine();
		cp2.setNome(nome);
		
		System.out.println("Dimens�o");
		dimens�o = in.nextDouble();
		
		cp2.setFronteira();
		in.nextLine();
		
		
		//Compara��o de Pa�ses
		
		cp1.getComparaPa�s(cp1, cp2);
		cp1.getComparaFronteira(cp1, cp2);
		
		
		
		

	}

}
