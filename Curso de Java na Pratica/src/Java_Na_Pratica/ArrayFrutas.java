package Java_Na_Pratica;
import java.util.*;

public class ArrayFrutas {

	public static void main(String[] args) {
		//Mostra tudo no array
		String [] frutas = {"Abacate", "Melância", "Banana"}; 
		Arrays.sort (frutas); 
		System.out.println (Arrays.toString (frutas)); 
		
		
		//Adiciona  e remove itens no array
		ArrayList frutas2 = new ArrayList();
		
		//Adiciona um Aray de frutas
		frutas2.add("Uva"); 
		frutas2.add("Kiwi"); 
		frutas2.add("Laranja");
		frutas2.add("Carambola");
		
		
		frutas2.set(0, "Piqui");//Troca Uva por Piqui
		
		frutas2.remove(2);//Esta removendo Laranja
		
		
		
		System.out.println(frutas2);
		
		

	}

}
