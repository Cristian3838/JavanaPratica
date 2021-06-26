package Java_Na_Pratica;

public class Cao extends Animal{
	
	public void latir() {
		
		System.out.println("O Cão late");
	}
	
	public void correr() {
		super.correr();
		System.out.println("cão!");
	}
	

}
