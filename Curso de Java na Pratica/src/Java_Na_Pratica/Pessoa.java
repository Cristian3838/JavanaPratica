package Java_Na_Pratica;
import java.util.*;
public class Pessoa extends AppPessoa{
	
	private String pessoa;
	private int idade;
      
	
	
	public void exibirDados(String nome) {
		
		System.out.println("Exibir apenas nome "+nome);
	}
	
	public void exibirDados(String nome, int idade) {
		
		System.out.println("Exibindo nome: "+nome+" idade: "+idade);
}

}