package Java_Na_Pratica;
import java.util.*;

public class Funcionario extends AppSalario{
	
	String nome;
	double salario;
	double bonus;
	double descontoAdicional;
	
	
	/*public void recuperaSalario()*/ 
	
	    double recuperaSalario(double bonus, double descontoAdicional){//Método double exige um retorno
		
		this.salario = this.salario - (this.salario*0.10);
		//System.out.println("O Funcionario "+nome+" obteve um salario com descontos de "+salario);
		return this.salario+bonus-descontoAdicional;
		
			
			
			
		
		
	}
	

}
