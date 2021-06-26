package Java_Na_Pratica;
import java.util.*;

public class AppAnimais {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		
		Cao cao = new Cao();
		cao.latir();
		cao.correr();
		cao.setCor("Branco");
		System.out.println("O Cão é da cor "+cao.getCor());
		
        
        Passaro passaro = new Passaro();
        passaro.correr();
        passaro.voar();
        passaro.setCor("Verde");
        System.out.println(passaro.getCor());
	}

}
