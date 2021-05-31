package Java_Na_Pratica;

import java.util.*;

//Digite um código que simula uma calculadora com as 4 operções básicas: soma, subtração, multiplicação e divisão.
//ultilize os métodos get/set e um valor de sentinela para controlar a saída do while
//Classes Calculadora e operações

public class Operacoes extends Calculadora{
	
	
	//Primeiro passo declaração de variáveis(Ingredientes)
	private double soma,sub,mult,div; //Private: Modificador de acesso para encapsulamento, 
	//private indica que as varIáveis declaradas só podem ser acessadas por esta classe
	//para termos acesso em outra classe dessas variáveis precisamos do get/set
    double valor1, valor2;// variáveis acessadas pela classe inteira.

 //######################################## Soma ##########################################################   
    
    public void setSoma(double valor1, double valor2) {//Cria um método public 
    	// As variáveis passadas como parâmetro são variáveis locais, só acessadas por esse método
    	//para atribuir valor na operação de soma de valores (Como usarei os ingredientes)
    	
    	
    	this.soma = valor1 + valor2;//Atribui a soma através do comando this a soma de valor1 e valor2
    	
    	
    }


	public double getSoma() {
		return this.soma; // Retorma o valor de soma realizada através do método this
	}

	
//######################################## Subtração ########################################################## 
	
	public void setSub(double valor1, double valor2) {
		this.sub = valor1 - valor2;
	}

	public double getSub() {
		return this.sub;
	}


	

//######################################## Multiplicação ########################################################## 
	
	public void setMult(double valor1, double valor2) {
		this.mult = valor1 * valor2;
	}
	
	public double getMult() {
		return this.mult;
	}


	//######################################## Divisão ########################################################## 

	public void setDiv(double valor1, double valor2) {
		this.div = valor1 / valor2;
	}
	
	public double getDiv() {
		return this.div;
	}


	
    
    
    
}
