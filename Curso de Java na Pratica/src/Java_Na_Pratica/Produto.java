package Java_Na_Pratica;

import java.util.*;

//Digite um código em que o usuário digita o nome de um produto, valor de custo, valor de venda e calcule o lucro.
//Verificar o erro se(if) o valor de venda é menor que o valor de custo
//Classes Produto e Aplicação

public class Produto extends AplicacaoProduto{
         
	      private String nomeProduto;// Variável privada através do encapsulamento private, vísivel somente nessa classe
	      //(Encasulamento)
	      private double precoCusto, precoVenda;// Variáveis privada através do encapsulamento private, 
	      //vísivel somente nessa classe(Encasulamento).
		
	      
	      public void setNomeProuto(String nomeProduto) {//Método acessor para atribuir um nome ao Produto
	    	  //A Varíável nomeProduto passada como parâmetro é local
	    	  
	    	  
	    	  this.nomeProduto = nomeProduto; // This.nomeProduto da Varíável private String nomeProduto
	    	  //recebe String nomeProduto passada como parãmetro dentro do método public void setNomeProuto
	    	  
	      }
	      
	      
		
		public void setPrecoCusto(double precoCusto) {//Atribui um precço de custo
			this.precoCusto = precoCusto;
		}
		
		
		public void setPrecoVenda(double precoVenda) {
			
			if(precoVenda < this.precoCusto) {
				
				System.out.println("Algo errado, o valor de venda é menor que o valor de custo");
				
			}else {
			
				this.precoVenda = precoVenda;
			
			}
			
			
		}		
	 
		public double getCalculaLucro() {
			
			return this.precoVenda - this.precoCusto;
	}
		
		
	      
	      
	      
}
