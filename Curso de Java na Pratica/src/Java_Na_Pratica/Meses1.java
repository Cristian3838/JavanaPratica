package Java_Na_Pratica;
import java.util.*;

//Digite um c�digo que pede um n�mero correspondente a um m�s do ano 
//e exiba o nome e o n�mero de dias desse m�s

public class Meses1 {

	public static void main(String[] args) {
		
		//Objeto criado para entrada de dados
		Scanner in = new Scanner(System.in);
		
		
		//Declara��o de vari�veis
		int diaM�s; // Declara��o de vari�veis
		String nomeM�s;// Declara��o de vari�veis
		
		
		
		System.out.println("Digite um m�s do ano de 1 - 12: ");
		int m�s = in.nextInt();// Armazena a variavel digitada
		
		
		
		//Condi��o(Requisito)
		if(m�s>=1 && m�s<=12) {// Condi��o
			switch(m�s) {//Chave de controle
			case 1: diaM�s = 31; nomeM�s = "Janeiro"; break ;//Caso o usu�rio digite 1, diaM�s = 31; nomeM�s = "Janeiro";
			case 2: diaM�s = 28; nomeM�s = "Fevereiro";break;
			case 3: diaM�s = 30; nomeM�s = "Mar�o"; break;
			case 4: diaM�s = 30; nomeM�s = "Abril"; break;
			case 5: diaM�s = 31; nomeM�s = "Maio"; break;
			case 6: diaM�s = 30; nomeM�s = "Junho"; break;
			case 7: diaM�s = 31; nomeM�s = "Julho"; break;
			case 8: diaM�s = 31; nomeM�s = "Agosto";break;
			case 9: diaM�s = 30; nomeM�s = "Setembro"; break;
			case 10: diaM�s = 31; nomeM�s = "Outubro"; break;
			case 11: diaM�s = 30; nomeM�s = "Novembro"; break;
			case 12: diaM�s = 31; nomeM�s = "Dezembro"; break;
			
			default: diaM�s = 0;//Por padr�o temos que inicializar a vari�vel default
			nomeM�s = " ";// Inicialza a vari�vel
			
			 
			
			}//Fim do switch
			System.out.println("O m�s de  "+nomeM�s+" tem "+diaM�s+" dias.");
		
		
		}//Fim do If
		
		             
				
				
			else {
				System.out.println("Este numero n�o � um numero de m�s v�lido");
			}
		
		
		}//Fim while
		

	}


