package Java_Na_Pratica;
import java.util.*;
public class AppSalario {

	public static void main(String[] args) {
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Cristian";
		funcionario.salario = 2000;
	    double recuperarSalario = funcionario.recuperaSalario(0, 0);//Aqui neste m�todo esta todo calculo efetuado atrav�s da classe Funcionario
		
		
		System.out.println("O Salario do "+funcionario.nome+" � "+recuperarSalario);
		
		
				
	}			
}