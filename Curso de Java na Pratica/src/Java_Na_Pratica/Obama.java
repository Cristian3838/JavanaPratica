package Java_Na_Pratica;

public class Obama extends Cidadao implements Presidente{

	
	//Cria um contrato entre Obama e a interface presidente
	// se Obama quiser ser preseidente ele tem que obrigatóriamente implementar o método public void ganharEleicao
	@Override
	public void ganharEleicao() {
		System.out.println("ganhar uma eleição nos Estados Unidos");
		
	}

	@Override
	public void conquistarEleitores() {
		System.out.println("Com trabalho");
		
	}
	
	

}
