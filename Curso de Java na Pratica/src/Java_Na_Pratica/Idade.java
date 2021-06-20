package Java_Na_Pratica;

import java.util.*;

public class Idade {

	public static void main(String[] args) {
		
		int paciente1;
		int paciente2;
		int resultado;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("A Vacina será ministrada para os que tiverem idade maior!");
		
		
		
		System.out.println("Paciente1 digite sua idade: ");
		paciente1 = in.nextInt();
		
		
		System.out.println("Paciente2 digite sua idade: ");
		paciente2  = in.nextInt();
		
		
		
		if(paciente1 > paciente2) {
			
			resultado = paciente1;
		}else {
		
		    resultado = paciente2;
		}
		
		
		System.out.println("O Paciente mais velho é o paciente de idade: "+ resultado);

	}
	
	

}

