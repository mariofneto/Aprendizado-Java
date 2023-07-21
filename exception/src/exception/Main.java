package exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
		
		// ---- exercicio 1 ----
		// 1. Write a Java program that throws an exception and catch it using a try-catch block.
		
		Scanner scanner = new Scanner(System.in);
		/*
		try {
			System.out.print("Escreva o dividendo: ");
			int a = scanner.nextInt();
			System.out.print("Escreva o divisor: ");
			int b = scanner.nextInt();
			
			int div = a/b;
			
			System.out.println("O divisao deu "+div);
			
		}catch(Exception e){
			System.out.println("nome do erro "+ e.getMessage());
			System.out.println("nao pode dividir numero por zero");
		}*/
		
		// ---- exercicio 2 ----
		// 2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
		
		/*System.out.println("Escreva um numero da sua escolha:");
		int a = scanner.nextInt();
		
		
		if(a%2!=0) {
			throw new ArithmeticException("o numero nao pode ser impar!");
		}else {
			System.out.println("sabia escolha viu!");
		}*/
		
		// ---- exercicio 3 ----
		// 3. Write a Java program to create a method that reads a file and throws an exception if the file is not found.
		
		try {
			//FileWriter wr = new FileWriter("exemplo.txt");
			
			/*wr.write("esse e um exemplo\n sera que deu certo?");
			wr.close();*/
			
			FileReader rd = new FileReader("exemplo.txt");
			
			
			
			
			
			System.out.println("deu certo!");
		}catch(IOException e){
			System.out.println("nao deu certo!");
		}
		
		
		
	}
}
