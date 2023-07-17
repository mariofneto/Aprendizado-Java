package polymorphismDinamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Animal animal;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha uma das opcoes: ");
		System.out.print("(1=dog) Ou (2=cat): ");
		int escolha = scanner.nextInt();
		
		if(escolha == 1) {
			animal = new Dog();
			animal.barulho();
		}
		else if(escolha == 2) {
			animal = new Cat();
			animal.barulho();
		}
		else {
			System.out.println("Valor invalido, tente 1 ou 2");
		}

	}

}
