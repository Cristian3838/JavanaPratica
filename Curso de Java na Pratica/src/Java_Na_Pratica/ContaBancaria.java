package Java_Na_Pratica;
import java.util.*;
public class ContaBancaria {
          private int numeroConta;
          private double saldo;
          
          
          public ContaBancaria() {//m�todo construtor
        	  System.out.println("chamando m�todo");
        	  
          }
          
          public ContaBancaria(int nConta) {//m�todo construtor
        	  
        	  this.numeroConta = nConta;
        	  System.out.println("O numero da conta 1 �: " + numeroConta);
          }
}
