package dataStructures;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		// Existem varios tipos de estruturas de dados
		// focaremos nos mais comuns que são: array, stack e queue
		
		// array || matriz
		System.out.println("----- Array -----");
		String[] nomes = {"Mario", "Odila", "Sol", "Mel"};
		
		for(String nome : nomes) {
			System.out.print(nome+" | ");
		}
		System.out.println("");
		System.out.println("");
		
		// pilha || stack (famoso LIFO)
		System.out.println("----- Stack -----");
		Stack<String> roupas = new Stack<>();
		
		roupas.push("camisa-preta");
		roupas.push("camisa-vermelha");
		roupas.push("camisa-verde"); // essa sera removida primeiro
		
		System.out.println(roupas);
		
		roupas.pop();
		
		System.out.println(roupas);
		System.out.println("");
		System.out.println("");
		
		// fila || queue (famoso FIFO)
		System.out.println("----- QUEUE -----");
		Queue<Integer> senhas = new PriorityQueue<>();
		
		senhas.add(5);
		senhas.add(23);
		senhas.add(12);
		senhas.add(0);
		senhas.add(9);
		senhas.add(34);
		
		System.out.println(senhas);
		
		senhas.remove();
		
		System.out.println(senhas);
		System.out.println("");
		System.out.println("");
		
		// linked list
		System.out.println("----- LINKED LIST -----");
		LinkedList<Character> letrasAlfabeto = new LinkedList<Character>();
		
		letrasAlfabeto.add('a');
		letrasAlfabeto.add('b');
		letrasAlfabeto.add('c');
		letrasAlfabeto.add('d');
		letrasAlfabeto.add('e');
		letrasAlfabeto.add('f');
		
		System.out.println(letrasAlfabeto);
		
		letrasAlfabeto.addFirst('z');
		
		System.out.println(letrasAlfabeto);
		
		letrasAlfabeto.removeFirst();
		
		System.out.println(letrasAlfabeto);
		
	}

}
