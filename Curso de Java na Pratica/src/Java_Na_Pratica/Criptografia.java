package Java_Na_Pratica;

import java.util.*;


//Realize um c�digo que receba um texto, depoi fa�a a criptografia do texto substituindo os caratcteres por outros
//"n" posi��es a frente 
//Este c�digo � conhecido como Cifra de C�sar.

public class Criptografia {

	
//######################################Para Criptografar#####################################################	
	    
	      public String criptografar(String mensagem, int valCifra) {//String, tipo de dado que a classe ira retornar
		//valCifra ser� quantos caracteres ele vai andar
		//mesangem do tipo String 
		// y � uma vari�vel local e s� pode ser usada dentrodo m�todo
		//Para informar a quantidade de carateres do texto ultizar o m�todo length da classe Scanner
		
//#################################################################################################################		
		
		
		int y = mensagem.length();//Informa a quantidade de caracteres de texto e atribui para a vari�vel y
		 String aux = "";// Inicializa a String com valor (0) vazio
		
		
		  for(int i = 0; i < y; i++) { //Enquanto a quantidade de caracteres for menor que o texto ele vai incrementar
			//come�ando com o valor vazio
			
	          aux = aux + (char)(mensagem.charAt(i)+valCifra);
			    //charAt retorna o valor da posi��o no caso (i)
			     //mensagem (texto passado com par�metro)
	              //(char) casting expl�cito, vai acumulando os caracteres
			
			
			
			    }//o For s� termina quando atingir o tamanho de y
		   
               return (aux);// Retorna uma String com ocomando retorno
	          }
	
	
	
//######################################Para Descriptografar#####################################################	           
    public String descriptografar(String mensagem, int valcifra) {
    	
     int y = mensagem.length();
      String aux = "";
    	     
       for(int i = 0; i < y; i++) {
    		   
        aux = aux + (char)(mensagem.charAt(i)-valcifra);
    	 //charAt retorna o valor da posi��o no caso (i)
   		  //mensagem (texto passado com par�metro)
   	       //(char) casting expl�cito, vai acumulando os caracteres
    	}
    	
       return (aux);
    }
    
    
//####################################################################################################################    

}
