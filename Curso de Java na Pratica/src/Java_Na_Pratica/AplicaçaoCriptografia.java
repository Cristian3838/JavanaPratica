package Java_Na_Pratica;
import java.util.*;

//Realize um código que receba um texto, depoi faça a criptografia do texto substituindo os caratcteres por outros
//"n" posições a frente 
//Este código é conhecido como Cifra de César.


public class AplicaçaoCriptografia {

	public static void main(String[] args) {
		
		//Criação de Objetos e instância
		Scanner in = new Scanner (System.in);// Cria um objeto para entrada de dados
		Criptografia c  = new Criptografia (); //Cria um objeto da classe Criptografia e atribui a uma variável de referência c
		//A Variavel c vamos usar para acessar os metodos das classe Criptografia
		
		
		//Declaração de variáveis
		String mensagem, textoCrip, textoDescrip; //Variáveis do tipo String
		int valCifra;// Variáveldo tipo inteira
		
		
		//Entrada de dados
		System.out.println("Digite o texto: "); //Solicita ao usuário que entre coma informação
		mensagem = in.nextLine(); //Arquiva a informação digitada pelo usuário
		
		System.out.println("Valor da Cifra: "); //Solicita ao usuário que entre coma informação
		valCifra = in.nextInt(); //Arquiva o valor na variável valcifra
		
		textoCrip = c.criptografar(mensagem, valCifra);
		textoDescrip = c.descriptografar(textoCrip, valCifra);
		
		System.out.println("Texto Criptografado "+ textoCrip);
		System.out.println("Texto Descriptografado " + textoDescrip);//Sinal de menos faz a volta, ou seja descriptografa
		
		

	}

}
