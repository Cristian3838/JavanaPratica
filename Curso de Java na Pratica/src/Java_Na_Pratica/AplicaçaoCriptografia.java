package Java_Na_Pratica;
import java.util.*;

//Realize um c�digo que receba um texto, depoi fa�a a criptografia do texto substituindo os caratcteres por outros
//"n" posi��es a frente 
//Este c�digo � conhecido como Cifra de C�sar.


public class Aplica�aoCriptografia {

	public static void main(String[] args) {
		
		//Cria��o de Objetos e inst�ncia
		Scanner in = new Scanner (System.in);// Cria um objeto para entrada de dados
		Criptografia c  = new Criptografia (); //Cria um objeto da classe Criptografia e atribui a uma vari�vel de refer�ncia c
		//A Variavel c vamos usar para acessar os metodos das classe Criptografia
		
		
		//Declara��o de vari�veis
		String mensagem, textoCrip, textoDescrip; //Vari�veis do tipo String
		int valCifra;// Vari�veldo tipo inteira
		
		
		//Entrada de dados
		System.out.println("Digite o texto: "); //Solicita ao usu�rio que entre coma informa��o
		mensagem = in.nextLine(); //Arquiva a informa��o digitada pelo usu�rio
		
		System.out.println("Valor da Cifra: "); //Solicita ao usu�rio que entre coma informa��o
		valCifra = in.nextInt(); //Arquiva o valor na vari�vel valcifra
		
		textoCrip = c.criptografar(mensagem, valCifra);
		textoDescrip = c.descriptografar(textoCrip, valCifra);
		
		System.out.println("Texto Criptografado "+ textoCrip);
		System.out.println("Texto Descriptografado " + textoDescrip);//Sinal de menos faz a volta, ou seja descriptografa
		
		

	}

}
