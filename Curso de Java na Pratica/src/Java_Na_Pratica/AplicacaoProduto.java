package Java_Na_Pratica;
import java.util.*;

//Digite um código em que o usuário digita o nome de um produto, valor de custo, valor de venda e calcule o lucro.
//Verificar o erro se(if) o valor de venda é menor que o valor de custo
//Classes Produto e Aplicação

public class AplicacaoProduto {

	public static void main(String[] args) {
		
		String nomeProduto;
		double precoCusto, precoVenda;
		
		Scanner in = new Scanner (System.in);//Objeto para entrada de dados pelo usuário
		
		Produto p = new Produto();//Cria um objeto Produto para a classe Produto
		
		System.out.println("Nome de Produto: ");
		nomeProduto = in.nextLine();
		p.setNomeProuto(nomeProduto);//A variável p chama o método setNomeProuto da classe Produto
		//através do obejto criado Produto p = new Produto();
		
		System.out.println("Preço de Custo: ");
		precoCusto = in.nextDouble();
		p.setPrecoCusto(precoCusto);
		
		System.out.println("Preço de Venda: ");
		precoVenda = in.nextDouble();
		p.setPrecoVenda(precoVenda);
		
		
		
		System.out.println("O lucro da empresa foi de: "+p.getCalculaLucro());
		
		
		
		
		
		
		
		

	}

}
