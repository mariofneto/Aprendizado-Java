
public class Fish implements prey,predator{

	@Override
	public void flee() {
		System.out.println("*Fish nadando para fugir do predador*");
		
	}

	@Override
	public void eat() {
		System.out.println("*Fish nadando para comer as presas*");
		
	}

}
