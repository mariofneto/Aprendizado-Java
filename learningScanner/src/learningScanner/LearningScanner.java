package learningScanner;
import java.util.Scanner;

public class LearningScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	// scanner.nextInt() está esperando que o dado do input venha um int.
		
		/*
		 System.out.println("Escreva abaixo dois numeros para serem somados");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		
		System.out.println("A soma dos dois numeros e igual a: "+(numero1+numero2));*/
	
		 	
	// scanner.nextLine() está esperando que o dado do input venha uma String
		
		System.out.println("Qual e o seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Seja bem-vindo "+nome+ "!");
		
	}

}
