package Java_Na_Pratica;
import java.util.*;

//Digite um código que o usuário informe dois países, sua dimensão em(km2), 3 países de fronteira
//e ao final o sistema verifica se o país 1 faz fronteira com algum dos 3 países informados do país 2
//Classes ClassePaíses e AplicaçãoPaíses


public class ClassePaíses extends AplicaçãoPaíses{
	
	private String nome;//Váriável String nome, Encapsulamento através do Método acessador private
	private String [] fronteira = new String [3];// Variável fronteira do tipo String encapsulada pelo método acessador private
	Scanner in = new Scanner (System.in);
	
	
	public void setNome(String n) {
		
		this.nome = n;
		
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	
	
	public void setFronteira() {
		
		System.out.println("Informeos 3 países de fronteira: ");
		int aux = 0;
		
		for(int i = 0 ; i < fronteira.length; i++) {//Length retorna o tamanho do array
			//Para i menor que 3 ele executa o código
			//Porque os elementos no array começa com 0
			
			aux++;//Variável aux será incrementada em 1 unidade
			
			System.out.println("País fronteira "+aux);
			fronteira[i] = in.nextLine();//Recebe o índice no momento que no caso é 0
			
			
			}
		
		}
	
	
	public boolean getComparaPaís(ClassePaíses x, ClassePaíses y) {
		
		
		
		
		if(x.nome.equals(y.nome)) {
			
			System.out.println("Países iguais");
			return true;
			
		}else System.out.println("Países diferentes");
		return false;
	}
     
	
	public boolean getComparaFronteira( ClassePaíses x, ClassePaíses y ) {
		for(int i = 0; i < x.fronteira.length; i++){
			if(x.nome.equals(y.fronteira[i])) {
				
				System.out.println("O País 1 informado("+x.nome+")faz fronteira  com o País 2 informado ("+y.nome+")");
				
				
			}//fim do for
			
			
		}
		
		return true;
	}
	
	
}

//equals da classe String serve para compara conteúdos
