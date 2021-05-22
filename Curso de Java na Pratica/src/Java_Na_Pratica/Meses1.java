package Java_Na_Pratica;
import java.util.*;

//Digite um código que pede um número correspondente a um mês do ano 
//e exiba o nome e o número de dias desse mês

public class Meses1 {

	public static void main(String[] args) {
		
		//Objeto criado para entrada de dados
		Scanner in = new Scanner(System.in);
		
		
		//Declaração de variáveis
		int diaMês; // Declaração de variáveis
		String nomeMês;// Declaração de variáveis
		
		
		
		System.out.println("Digite um mês do ano de 1 - 12: ");
		int mês = in.nextInt();// Armazena a variavel digitada
		
		
		
		//Condição(Requisito)
		if(mês>=1 && mês<=12) {// Condição
			switch(mês) {//Chave de controle
			case 1: diaMês = 31; nomeMês = "Janeiro"; break ;//Caso o usuário digite 1, diaMês = 31; nomeMês = "Janeiro";
			case 2: diaMês = 28; nomeMês = "Fevereiro";break;
			case 3: diaMês = 30; nomeMês = "Março"; break;
			case 4: diaMês = 30; nomeMês = "Abril"; break;
			case 5: diaMês = 31; nomeMês = "Maio"; break;
			case 6: diaMês = 30; nomeMês = "Junho"; break;
			case 7: diaMês = 31; nomeMês = "Julho"; break;
			case 8: diaMês = 31; nomeMês = "Agosto";break;
			case 9: diaMês = 30; nomeMês = "Setembro"; break;
			case 10: diaMês = 31; nomeMês = "Outubro"; break;
			case 11: diaMês = 30; nomeMês = "Novembro"; break;
			case 12: diaMês = 31; nomeMês = "Dezembro"; break;
			
			default: diaMês = 0;//Por padrão temos que inicializar a variável default
			nomeMês = " ";// Inicialza a variável
			
			 
			
			}//Fim do switch
			System.out.println("O mês de  "+nomeMês+" tem "+diaMês+" dias.");
		
		
		}//Fim do If
		
		             
				
				
			else {
				System.out.println("Este numero não é um numero de mês válido");
			}
		
		
		}//Fim while
		

	}


