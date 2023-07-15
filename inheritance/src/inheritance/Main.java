package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("FIAT","Mario Neto", 4, true);
		Bike bike1 = new Bike("Monark","Ze Ferreira", 2, false);
		
		car1.detalhes();
		bike1.detalhes();

	}

}
