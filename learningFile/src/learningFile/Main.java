package learningFile;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("filename.txt");
			
			if(file.createNewFile()) {
				System.out.println("O arquivo foi criado.");
			}
			else {
				System.out.println("O arquivo ja existe.");
				System.out.println(file.getPath());
				System.out.println(file.getAbsolutePath());
			}
		}
		catch(IOException e) {
			
			System.out.println("Um erro ocorreu.");
			e.printStackTrace();
		}

	}

}
