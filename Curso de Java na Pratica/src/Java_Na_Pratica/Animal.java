package Java_Na_Pratica;

public class Animal {
	
	double tamanho;
	double peso;
	String cor;
	
	
	public void dormir() {
		
		System.out.println("Dormir com um animal");
	}
	
	public void correr() {
		System.out.println("Correr como um");
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
