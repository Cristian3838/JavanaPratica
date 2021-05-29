package Java_Na_Pratica;

import java.util.*;


//Realize um código que receba um texto, depoi faça a criptografia do texto substituindo os caratcteres por outros
//"n" posições a frente 
//Este código é conhecido como Cifra de César.

public class Criptografia {

	
//######################################Para Criptografar#####################################################	
	    
	      public String criptografar(String mensagem, int valCifra) {//String, tipo de dado que a classe ira retornar
		//valCifra será quantos caracteres ele vai andar
		//mesangem do tipo String 
		// y é uma variável local e só pode ser usada dentrodo método
		//Para informar a quantidade de carateres do texto ultizar o método length da classe Scanner
		
//#################################################################################################################		
		
		
		int y = mensagem.length();//Informa a quantidade de caracteres de texto e atribui para a variável y
		 String aux = "";// Inicializa a String com valor (0) vazio
		
		
		  for(int i = 0; i < y; i++) { //Enquanto a quantidade de caracteres for menor que o texto ele vai incrementar
			//começando com o valor vazio
			
	          aux = aux + (char)(mensagem.charAt(i)+valCifra);
			    //charAt retorna o valor da posição no caso (i)
			     //mensagem (texto passado com parâmetro)
	              //(char) casting explícito, vai acumulando os caracteres
			
			
			
			    }//o For só termina quando atingir o tamanho de y
		   
               return (aux);// Retorna uma String com ocomando retorno
	          }
	
	
	
//######################################Para Descriptografar#####################################################	           
    public String descriptografar(String mensagem, int valcifra) {
    	
     int y = mensagem.length();
      String aux = "";
    	     
       for(int i = 0; i < y; i++) {
    		   
        aux = aux + (char)(mensagem.charAt(i)-valcifra);
    	 //charAt retorna o valor da posição no caso (i)
   		  //mensagem (texto passado com parâmetro)
   	       //(char) casting explícito, vai acumulando os caracteres
    	}
    	
       return (aux);
    }
    
    
//####################################################################################################################    

}
