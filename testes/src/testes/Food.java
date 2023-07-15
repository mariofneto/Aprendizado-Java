package testes;

public class Food {
	
	String name;
	String type;
	double price;
	
	public Food(String name, String type, double price){
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public void eat() {
		System.out.println("Eu estou comendo a comida");
	}
}
