package Java_Na_Pratica;
import java.util.*;

//Digite um c�digo que o usu�rio informe dois pa�ses, sua dimens�o em(km2), 3 pa�ses de fronteira
//e ao final o sistema verifica se o pa�s 1 faz fronteira com algum dos 3 pa�ses informados do pa�s 2
//Classes ClassePa�ses e Aplica��oPa�ses


public class ClassePa�ses extends Aplica��oPa�ses{
	
	private String nome;//V�ri�vel String nome, Encapsulamento atrav�s do M�todo acessador private
	private String [] fronteira = new String [3];// Vari�vel fronteira do tipo String encapsulada pelo m�todo acessador private
	Scanner in = new Scanner (System.in);
	
	
	public void setNome(String n) {
		
		this.nome = n;
		
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	
	
	public void setFronteira() {
		
		System.out.println("Informeos 3 pa�ses de fronteira: ");
		int aux = 0;
		
		for(int i = 0 ; i < fronteira.length; i++) {//Length retorna o tamanho do array
			//Para i menor que 3 ele executa o c�digo
			//Porque os elementos no array come�a com 0
			
			aux++;//Vari�vel aux ser� incrementada em 1 unidade
			
			System.out.println("Pa�s fronteira "+aux);
			fronteira[i] = in.nextLine();//Recebe o �ndice no momento que no caso � 0
			
			
			}
		
		}
	
	
	public boolean getComparaPa�s(ClassePa�ses x, ClassePa�ses y) {
		
		
		
		
		if(x.nome.equals(y.nome)) {
			
			System.out.println("Pa�ses iguais");
			return true;
			
		}else System.out.println("Pa�ses diferentes");
		return false;
	}
     
	
	public boolean getComparaFronteira( ClassePa�ses x, ClassePa�ses y ) {
		for(int i = 0; i < x.fronteira.length; i++){
			if(x.nome.equals(y.fronteira[i])) {
				
				System.out.println("O Pa�s 1 informado("+x.nome+")faz fronteira  com o Pa�s 2 informado ("+y.nome+")");
				
				
			}//fim do for
			
			
		}
		
		return true;
	}
	
	
}

//equals da classe String serve para compara conte�dos
