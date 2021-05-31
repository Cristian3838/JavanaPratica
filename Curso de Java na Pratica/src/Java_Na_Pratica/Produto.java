package Java_Na_Pratica;

import java.util.*;

//Digite um c�digo em que o usu�rio digita o nome de um produto, valor de custo, valor de venda e calcule o lucro.
//Verificar o erro se(if) o valor de venda � menor que o valor de custo
//Classes Produto e Aplica��o

public class Produto extends AplicacaoProduto{
         
	      private String nomeProduto;// Vari�vel privada atrav�s do encapsulamento private, v�sivel somente nessa classe
	      //(Encasulamento)
	      private double precoCusto, precoVenda;// Vari�veis privada atrav�s do encapsulamento private, 
	      //v�sivel somente nessa classe(Encasulamento).
		
	      
	      public void setNomeProuto(String nomeProduto) {//M�todo acessor para atribuir um nome ao Produto
	    	  //A Var��vel nomeProduto passada como par�metro � local
	    	  
	    	  
	    	  this.nomeProduto = nomeProduto; // This.nomeProduto da Var��vel private String nomeProduto
	    	  //recebe String nomeProduto passada como par�metro dentro do m�todo public void setNomeProuto
	    	  
	      }
	      
	      
		
		public void setPrecoCusto(double precoCusto) {//Atribui um prec�o de custo
			this.precoCusto = precoCusto;
		}
		
		
		public void setPrecoVenda(double precoVenda) {
			
			if(precoVenda < this.precoCusto) {
				
				System.out.println("Algo errado, o valor de venda � menor que o valor de custo");
				
			}else {
			
				this.precoVenda = precoVenda;
			
			}
			
			
		}		
	 
		public double getCalculaLucro() {
			
			return this.precoVenda - this.precoCusto;
	}
		
		
	      
	      
	      
}
