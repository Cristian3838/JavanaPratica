package Java_Na_Pratica;
import java.util.*;


//Digite um código que o usuário informe dois países, sua dimensão em(km2), 3 países de fronteira
//e ao final o sistema verifica se o país 1 faz fronteira com algum dos 3 países informados do país 2
//Classes ClassePaíses e AplicaçãoPaíses


public class AplicaçãoPaíses {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		ClassePaíses cp1 = new ClassePaíses();//Cria e instancia um obejto para a ClassePaíses com a variável cp1
		ClassePaíses cp2 = new ClassePaíses(); //Cria e instancia um obejto cp2 para acessar a ClassePaíses com a variável cp2
		String nome;
		double dimensão;
		
		
		
		//Informa o País 1
		
		System.out.println("Nome País: ");
		nome = in.nextLine();
		cp1.setNome(nome);
		
		System.out.println("Dimensão: ");
		dimensão = in.nextDouble();
		
		cp1.setFronteira();
		in.nextLine();
		
		
		
		
		
		//Informa o País 2
				
		System.out.println("Digite o segundo Páis: ");
		nome = in.nextLine();
		cp2.setNome(nome);
		
		System.out.println("Dimensão");
		dimensão = in.nextDouble();
		
		cp2.setFronteira();
		in.nextLine();
		
		
		//Comparação de Países
		
		cp1.getComparaPaís(cp1, cp2);
		cp1.getComparaFronteira(cp1, cp2);
		
		
		
		

	}

}
