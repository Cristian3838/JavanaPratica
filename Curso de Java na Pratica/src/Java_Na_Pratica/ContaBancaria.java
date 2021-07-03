package Java_Na_Pratica;
import java.util.*;
public class ContaBancaria {
          private int numeroConta;
          private double saldo;
          
          
          public ContaBancaria() {//método construtor
        	  System.out.println("chamando método");
        	  
          }
          
          public ContaBancaria(int nConta) {//método construtor
        	  
        	  this.numeroConta = nConta;
        	  System.out.println("O numero da conta 1 é: " + numeroConta);
          }
}
