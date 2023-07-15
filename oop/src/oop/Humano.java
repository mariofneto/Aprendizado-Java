package oop;

public class Humano {
	
	String nome;
	int	idade;
	String religiao;
	
	public Humano(String nome, int idade, String religiao) {
		this.nome = nome;
		this.idade = idade;
		this.religiao = religiao;
	}
	
	public void Apresentar() {
		System.out.println("Oi, me chamo "+this.nome+", e tenho "+this.idade+" anos!");
	}
	
	public void Religiao() {
		System.out.println("Eu sou "+this.religiao+", mas respeito todo tipo de religiao!");
	}
	
	
}
