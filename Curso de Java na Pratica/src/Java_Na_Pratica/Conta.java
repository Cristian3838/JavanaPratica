package Java_Na_Pratica;
import java.util.*;

public class Conta extends AppConta{
	
	
	//public - todas as classes terão acesso
	//private - apenas pode ter acesso dentro da classe.
	//protected - pode ter acesso estando dentro do mesmo pacote.
	//default - caso não tenha sido definido nenhum modoficador, permitindo o acesso dentro do pacote.
	
	//O Ideal é colocar os atributos como privado e manipulos somente através de métodos para permitir verificações.
	
	private int numeroConta;
	private double saldo = 100;
	
	
	
	
	
	public void depositar(double deposito) {
		
		this.saldo = this.saldo+deposito; //Pega o saldo e incrementa o deposito passado como parâmetro.
	}
	
	
	
	public void valorSaque(double valorSaque) {
		
		this.saldo = this.saldo-valorSaque;
		
		
	}
	
    public double recuperarSaldo() {
		
		return this.saldo;
	}

}
