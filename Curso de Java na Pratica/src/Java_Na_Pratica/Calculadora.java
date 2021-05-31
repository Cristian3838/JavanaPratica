package Java_Na_Pratica;
import java.util.*;

//Digite um código que simula uma calculadora com as 4 operções básicas: soma, subtração, multiplicação e divisão.
//ultilize os métodos get/set e um valor de sentinela para controlar a saída do while
//Classes Calculadora e operações


public class Calculadora {

	public static void main(String[] args) {
		
		double valor1, valor2; //Variáveis declaradas na classe Operações
		int op = 0;
		
		
		Scanner in = new Scanner(System.in); //Cria um objeto da classe scanner através do método new e variável in
		Operacoes calc = new Operacoes();//Cria um objeto Operações da classe Operações
		//Através da variável operações e será utilizada para acessar os métodos da  classe operações
		
		
		//Laço condicional While
		
		while(op!=99) {// Enquanto op for diferente de 99
			
			System.out.println();//Pula uma linha
			System.out.println("Calculadora");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("4 - Divisão");
			System.out.println("99 - Sair");
			System.out.println("Escolha um número: ");
			op = in.nextInt(); // Armazena o número do menu digitado pelo usuário 
			
			switch(op) {//Essa chave de controle testa o valor de op
			
			case 1: // Número informado pelo usuário
				System.out.println("Soma");
				System.out.println("Digite um número: ");
				calc.valor1 = in.nextDouble();
				
				System.out.println("Digite outro número: ");
				calc.valor2 = in.nextDouble();
				calc.setSoma(calc.valor1, calc.valor2);
			
			System.out.println("Resultado "+calc.getSoma());
			break;
			
			
			case 2:
				System.out.println();
				System.out.println("Subtração");
				System.out.println("Digite um número: ");
				calc.valor1 = in.nextDouble();
				
				System.out.println("Digite outro número: ");
				calc.valor2 = in.nextDouble();
				calc.setSub(calc.valor1, calc.valor2);
				
				System.out.println("Resultado "+ calc.getSub());
				break;
				
			case 3:
				System.out.println();
				System.out.println("Multiplicação");
				System.out.println("Digite um número: ");
				calc.valor1 = in.nextDouble();// Esse valor 1 se refere a variável calc da classe operações
				
				System.out.println("Digite outro número: ");
				calc.valor2 = in.nextDouble();// Esse valor 2 se refere a variável calc da classe operações
			    calc.setMult(calc.valor1, calc.valor2);// Acessa o método setSoma da varíavel calc da classe operações
			    
			    System.out.println("Resultado "+ calc.getMult());//Método de retorno da variável calc da classe operações
			    break;
			    
			case 4:
				System.out.println();
				System.out.println("Dicisão");
				System.out.println("Digite um número: ");
				calc.valor1 = in.nextDouble();
				
				System.out.println("Digite outro número: ");
				calc.valor2 = in.nextDouble();
				calc.setDiv(calc.valor1, calc.valor2);
				
				System.out.println("Resultado "+ calc.getDiv());
			    break;
			    
			    default: System.out.println("Saindo do sistema");
			
			}
			
		}
		

	}

}
