package oop;

public class Animal {
	
	String nome;
	int idade;
	String cor;
	
	public Animal(String nome, int idade, String cor) {
		this.nome =  nome;
		this.idade = idade;
		this.cor = cor;
	}

	
	
	public void nome() {
		System.out.println("O nome da vaca e: "+nome);
	}
	
	public void idade() {
		System.out.println("A idade da vaca e: "+idade);
	}
	
	public void cor() {
		System.out.println("A cor da vaca e: "+cor);
	}
	
}
