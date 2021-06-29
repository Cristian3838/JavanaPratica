package Java_Na_Pratica;
import java.util.*;

public class Conta extends AppConta{
	
	
	//public - todas as classes ter�o acesso
	//private - apenas pode ter acesso dentro da classe.
	//protected - pode ter acesso estando dentro do mesmo pacote.
	//default - caso n�o tenha sido definido nenhum modoficador, permitindo o acesso dentro do pacote.
	
	//O Ideal � colocar os atributos como privado e manipulos somente atrav�s de m�todos para permitir verifica��es.
	
	private int numeroConta;
	private double saldo = 100;
	
	
	
	
	
	public void depositar(double deposito) {
		
		this.saldo = this.saldo+deposito; //Pega o saldo e incrementa o deposito passado como par�metro.
	}
	
	
	
	public void valorSaque(double valorSaque) {
		
		this.saldo = this.saldo-valorSaque;
		
		
	}
	
    public double recuperarSaldo() {
		
		return this.saldo;
	}

}
