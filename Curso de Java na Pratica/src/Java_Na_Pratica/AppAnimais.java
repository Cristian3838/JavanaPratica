package Java_Na_Pratica;
import java.util.*;

public class AppAnimais {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		
		Cao cao = new Cao();//Criado o objeto cão
		cao.latir(); 
		cao.correr();
		cao.setCor("Branco");//Comando para configurar uma cor para o animal.
		System.out.println("O Cão é da cor "+cao.getCor());// Comando que retorna uma cor para o animal.
		
        
        Passaro passaro = new Passaro();
        passaro.correr();
        passaro.voar();
        passaro.setCor("Verde");
        System.out.println(passaro.getCor());
	}

}
