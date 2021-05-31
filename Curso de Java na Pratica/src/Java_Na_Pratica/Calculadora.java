package Java_Na_Pratica;
import java.util.*;

//Digite um c�digo que simula uma calculadora com as 4 oper��es b�sicas: soma, subtra��o, multiplica��o e divis�o.
//ultilize os m�todos get/set e um valor de sentinela para controlar a sa�da do while
//Classes Calculadora e opera��es


public class Calculadora {

	public static void main(String[] args) {
		
		double valor1, valor2; //Vari�veis declaradas na classe Opera��es
		int op = 0;
		
		
		Scanner in = new Scanner(System.in); //Cria um objeto da classe scanner atrav�s do m�todo new e vari�vel in
		Operacoes calc = new Operacoes();//Cria um objeto Opera��es da classe Opera��es
		//Atrav�s da vari�vel opera��es e ser� utilizada para acessar os m�todos da  classe opera��es
		
		
		//La�o condicional While
		
		while(op!=99) {// Enquanto op for diferente de 99
			
			System.out.println();//Pula uma linha
			System.out.println("Calculadora");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("4 - Divis�o");
			System.out.println("99 - Sair");
			System.out.println("Escolha um n�mero: ");
			op = in.nextInt(); // Armazena o n�mero do menu digitado pelo usu�rio 
			
			switch(op) {//Essa chave de controle testa o valor de op
			
			case 1: // N�mero informado pelo usu�rio
				System.out.println("Soma");
				System.out.println("Digite um n�mero: ");
				calc.valor1 = in.nextDouble();
				
				System.out.println("Digite outro n�mero: ");
				calc.valor2 = in.nextDouble();
				calc.setSoma(calc.valor1, calc.valor2);
			
			System.out.println("Resultado "+calc.getSoma());
			break;
			
			
			case 2:
				System.out.println();
				System.out.println("Subtra��o");
				System.out.println("Digite um n�mero: ");
				calc.valor1 = in.nextDouble();
				
				System.out.println("Digite outro n�mero: ");
				calc.valor2 = in.nextDouble();
				calc.setSub(calc.valor1, calc.valor2);
				
				System.out.println("Resultado "+ calc.getSub());
				break;
				
			case 3:
				System.out.println();
				System.out.println("Multiplica��o");
				System.out.println("Digite um n�mero: ");
				calc.valor1 = in.nextDouble();// Esse valor 1 se refere a vari�vel calc da classe opera��es
				
				System.out.println("Digite outro n�mero: ");
				calc.valor2 = in.nextDouble();// Esse valor 2 se refere a vari�vel calc da classe opera��es
			    calc.setMult(calc.valor1, calc.valor2);// Acessa o m�todo setSoma da var�avel calc da classe opera��es
			    
			    System.out.println("Resultado "+ calc.getMult());//M�todo de retorno da vari�vel calc da classe opera��es
			    break;
			    
			case 4:
				System.out.println();
				System.out.println("Dicis�o");
				System.out.println("Digite um n�mero: ");
				calc.valor1 = in.nextDouble();
				
				System.out.println("Digite outro n�mero: ");
				calc.valor2 = in.nextDouble();
				calc.setDiv(calc.valor1, calc.valor2);
				
				System.out.println("Resultado "+ calc.getDiv());
			    break;
			    
			    default: System.out.println("Saindo do sistema");
			
			}
			
		}
		

	}

}
