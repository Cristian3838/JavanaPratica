package Java_Na_Pratica;

import java.util.*;

//Digite um c�digo que simula uma calculadora com as 4 oper��es b�sicas: soma, subtra��o, multiplica��o e divis�o.
//ultilize os m�todos get/set e um valor de sentinela para controlar a sa�da do while
//Classes Calculadora e opera��es

public class Operacoes extends Calculadora{
	
	
	//Primeiro passo declara��o de vari�veis(Ingredientes)
	private double soma,sub,mult,div; //Private: Modificador de acesso para encapsulamento, 
	//private indica que as varI�veis declaradas s� podem ser acessadas por esta classe
	//para termos acesso em outra classe dessas vari�veis precisamos do get/set
    double valor1, valor2;// vari�veis acessadas pela classe inteira.

 //######################################## Soma ##########################################################   
    
    public void setSoma(double valor1, double valor2) {//Cria um m�todo public 
    	// As vari�veis passadas como par�metro s�o vari�veis locais, s� acessadas por esse m�todo
    	//para atribuir valor na opera��o de soma de valores (Como usarei os ingredientes)
    	
    	
    	this.soma = valor1 + valor2;//Atribui a soma atrav�s do comando this a soma de valor1 e valor2
    	
    	
    }


	public double getSoma() {
		return this.soma; // Retorma o valor de soma realizada atrav�s do m�todo this
	}

	
//######################################## Subtra��o ########################################################## 
	
	public void setSub(double valor1, double valor2) {
		this.sub = valor1 - valor2;
	}

	public double getSub() {
		return this.sub;
	}


	

//######################################## Multiplica��o ########################################################## 
	
	public void setMult(double valor1, double valor2) {
		this.mult = valor1 * valor2;
	}
	
	public double getMult() {
		return this.mult;
	}


	//######################################## Divis�o ########################################################## 

	public void setDiv(double valor1, double valor2) {
		this.div = valor1 / valor2;
	}
	
	public double getDiv() {
		return this.div;
	}


	
    
    
    
}
