package Java_Na_Pratica;
import java.util.*;

public class AppConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.depositar(100); // saldo de 200 somado com 100 reais já existente na conta.
		conta.valorSaque(23);//saldo de 177 reais pois foi sacado 23 reais da conta corrente.
		
		
		System.out.println(conta.recuperarSaldo());// como tornamos saldo com privado, foi criado um método recuperarSaldo
		//na classe Conta para recuperar o saldo.

	}

}
