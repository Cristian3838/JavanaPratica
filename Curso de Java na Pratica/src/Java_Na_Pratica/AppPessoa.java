package Java_Na_Pratica;
import java.util.*;

public class AppPessoa {

	public static void main(String[] args) {
		Pessoa pessoa  = new Pessoa();
		pessoa.exibirDados("Cristian");
		pessoa.exibirDados("Cristian", 34);
		
		System.out.println(pessoa);
	}

}
