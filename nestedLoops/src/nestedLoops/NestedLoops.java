package nestedLoops;
import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int row;
		int col;
		String symbol;
		
		
		System.out.println("Digite o numero de linhas: ");
		row = scanner.nextInt();
		System.out.println("Digite o numero de colunas: ");
		col = scanner.nextInt();
		System.out.println("Digite o simbolo: ");
		symbol = scanner.next();
		
		for(int i=1; i<=row; i++) {
			System.out.println();
			for(int j=1; j<=col;j++) {
				System.out.print(symbol);
			}
		}
		

	}

}
