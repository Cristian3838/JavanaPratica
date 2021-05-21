package Java_Na_Pratica;
import java.util.*;

//Digite o programa que calcule o volume de um objeto  a partir de sua altura, comprimento e largura
//se o volume for divis�vel por 5, ent�o calcula a ra�z quadrada, e exibe o valor aredondado, se n�o
//exibe o valor fazendo um casting expl�cito.

public class CalculoVolume {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a altura do objeto: ");
		float altura = in.nextFloat();
		
		System.out.println("Digite a largura do objeto: ");
		float largura = in.nextFloat();
		
		System.out.println("Digite o comprimento do objeto: ");
		float comprimento = in.nextFloat();
		
		float volume = altura*largura*comprimento;
		
		if (volume %5 ==0) {//se o volume for divis�vel por 5 for resto 0, ent�o calcula a ra�z quadrada
			
			double ra�z = Math.sqrt(volume);// Se o volume for divis�vel por 5, ent�o calcula a ra�z quadrada, e exibe o valor aredondado
			System.out.println("A ra�z quadrada de "+volume+" = "+Math.round(ra�z));
			
			
		}else {
			
			System.out.println("O valor fazendo um casting expl�cito �: "+((int)volume));
		}

	}

}
