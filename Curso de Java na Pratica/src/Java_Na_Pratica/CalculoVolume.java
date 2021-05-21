package Java_Na_Pratica;
import java.util.*;

//Digite o programa que calcule o volume de um objeto  a partir de sua altura, comprimento e largura
//se o volume for divisível por 5, então calcula a raíz quadrada, e exibe o valor aredondado, se não
//exibe o valor fazendo um casting explícito.

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
		
		if (volume %5 ==0) {//se o volume for divisível por 5 for resto 0, então calcula a raíz quadrada
			
			double raíz = Math.sqrt(volume);// Se o volume for divisível por 5, então calcula a raíz quadrada, e exibe o valor aredondado
			System.out.println("A raíz quadrada de "+volume+" = "+Math.round(raíz));
			
			
		}else {
			
			System.out.println("O valor fazendo um casting explícito é: "+((int)volume));
		}

	}

}
