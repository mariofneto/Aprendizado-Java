package testes;
//import java.util.Random;
import java.util.Scanner;
// import javax.swing.JOptionPane; // usado para o GUI

public class Teste {

	public static void main(String[] args) {
		
		// ===== UTILIZANDO GUI =====
		
		/* String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		
		JOptionPane.showMessageDialog(null, "Ola "+nome+" voce tem "+idade+" anos.");
		*/
		
		// ===== CALCULO DA HIPOTENUSA =====
		
		// “A hipotenusa é igual à raiz quadrada da soma dos catetos ao quadrado”
		
		/* Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa Calculo da hipotenusa");
		System.out.println("==============================");
		System.out.println("Escreva o primeiro cateto: ");
		double primeiroCateto = scanner.nextDouble();
		System.out.println("Escreva o segunda cateto: ");
		double segundoCateto = scanner.nextDouble();
		
		double hipotenusa = Math.sqrt((primeiroCateto * primeiroCateto) + (segundoCateto * segundoCateto));
		
		System.out.println("A hipotenusa e de "+hipotenusa); */
		
		// ===== NUMEROS ALEATORIOS =====
		
		/*Random random = new Random();
		
		int jogarDado = random.nextInt(6)+1;
		double dolar = random.nextDouble(6);
		boolean fome = random.nextBoolean();
		
		System.out.println(fome);*/
		
		// ===== IF / ELSE =====
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("qual e a sua idade?");
		int idade = scanner.nextInt();
		
		if(idade < 13) {
			System.out.println("voce e uma crianca");
		}
		else if(idade < 18) {
			System.out.println("voce e um adolescente");
		}
		else if(idade < 75) {
			System.out.println("voce e um adulto");
		}
		else {
			System.out.println("voce esta quase morrendo seu velho");
		}
		scanner.close();
		*/
		
		// ===== SWITCH CASE =====
		
		/*String dia = "batata";
		
		switch(dia) {
		case "segunda": System.out.println("Hoje e segunda");break;
		case "terca": System.out.println("Hoje e terca");break;
		case "quarta": System.out.println("Hoje e quarta");break;
		case "quinta": System.out.println("Hoje e quinta");break;
		case "sexta": System.out.println("Hoje e sexta");break;
		case "sabado": System.out.println("Hoje e sabado");break;
		case "domingo": System.out.println("Hoje e domingo");break;
		default: System.out.println("Esse dia nao existe");break;
		}*/
		
		// ===== OPERADORES LOGICOS =====
		
		/* int idade = 20;
		boolean gay = true;
		
		if(idade == 19 && gay == true) {
			System.out.println("Voce tem 19 anos e e gay");
		}else if(idade == 20 && gay == true) {
			System.out.println("tudo certo");
		}*/
		
		// ===== WHILE =====
		
		//int cont = 0;
		/*
		while(cont <= 10) {
			System.out.println("Estamos na volta: "+cont);
			cont++;
		}*/
		
		// ===== DO WHILE =====
		
		/*do {
			System.out.println("Estamos na volta: "+cont);
			cont++;
		}while(cont <= 10);*/
		
		// ===== FOR =====
		
		/*for(int cont = 0; cont <= 10; cont++) {
			System.out.println("Estamos na volta: "+cont);
		}*/
		
		// ===== FOR EM ARRAYS =====
		
		/*String[] nomes = {"Mario", "Odila", "Julia"};
		
		for(String nome : nomes){
			System.out.println(nome);
		}*/
		
		// ===== ARRAYS =====
		
		/*String[] motos = {"BMW GS 500", "KAWASAKI NINJA", "CB 1000"};
		
		for(String moto : motos) {
			System.out.println(moto);
		}
		
		System.out.println("-----------------");
		System.out.println("Tamanho do array de motos e igual a: "+motos.length);
		System.out.println("-----------------");*/
		
		// ===== 2D Arrays = Array de array =====
		
		 /*int[][] numeros = {{1,2,3,4},{4,5,6}};
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println();
			for(int j=0; j<numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			
		}*/
		
		// ===== Métodos String =====
		
		
		/*String nome = "Mario";
		boolean result = nome.equalsIgnoreCase("maRio");
		
		System.out.println(result);*/
		
		// ===== Wrapper Class =====
		
		/* int numero1 = 10;
		Integer numero2 = 10;
		
		boolean temcpf1 = true;
		Boolean temcpf2 = true;
		
		System.out.println(temcpf1);
		System.out.println(temcpf2.getClass());*/
		
		// ===== ARRAY OF OBJECTS =====
		
		//Food[] myFavoritesFoods = new Food[3];
		
		/*
		Food strogonoff = new Food("Strogonoff","De frango",10.5);
		Food lasanha = new Food("Lasanha","Massa", 25);
		Food macarronada = new Food("Macarronada","Massa", 6.99);
	
		Food[] myFavoritesFoods = {strogonoff, lasanha, macarronada};
		
		System.out.println(myFavoritesFoods[0].name);
		*/
		
		// ===== Brincando com Arrays =====
		/*int[] numbers = new int[3];
		
		numbers[0] = 37;
		numbers[1] = 22;
		numbers[2] = 89;
		
		for(int number : numbers) {
			System.out.println(number);
		}*/
		
		
		// ===== Object Passing =====
		
		/*Car car1 = new Car("BMW");
		Car car2 = new Car("Chevette");
		
		Garage garage = new Garage();
		
		garage.park(car1);
		garage.park(car2);*/
		
		
		
		
		
		
	}
}
