package arrayList;
import java.util.ArrayList;

public class TrabalhandoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String>carros = new ArrayList<String>();
		
		carros.add("Fiat Uno");
		carros.add("Doblo");
		carros.add("Prisma");
		carros.add("Fiat Touro");
		
		
		// System.out.println(carros.get(2));
		
		/*for(String carro : carros) {
			System.out.println(carro);
		}*/
		
	
		// carros.remove(0);
		// carros.clear();
		
		for(int i=0; i<carros.size();i++) {
			System.out.println("ID "+i+": "+carros.get(i));
		}
		

	}

}