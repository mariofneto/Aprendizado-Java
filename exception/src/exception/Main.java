package exception;

import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			
				System.out.println("Entre com um valor: ");
				int x = scanner.nextInt();
				System.out.println("Entre com o valor para dividir o primeiro: ");
				int y = scanner.nextInt();
				int z = x/y;
				System.out.println("Resultado: "+z);
			}
		catch(ArithmeticException e) {
			System.out.println("O valor nao pode ser dividido por zero!");
		}
		catch(InputMismatchException e) {
			System.out.println("O valor tem que ser um numero!");
		}
		catch(Exception e) {
			System.out.println("Algo deu errado :(");
		}
		finally {
			scanner.close();
		}

	}

}
