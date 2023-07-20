package exception;

import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
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
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("O valor tem que ser um numero!");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Algo deu errado :(");
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
		 */
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("----CADASTRO DE USUARIO, PRENCHA OS CAMPOS-----");
			System.out.println("");
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Idade: ");
			int idade = scanner.nextInt();
			System.out.print("Senha: ");
			String senha = scanner.next();
			
			System.out.println("----SEUS DADOS----");
			System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nSenha: "+senha+"\n");
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		
	}
}
