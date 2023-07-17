
public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.setName("Mario");
		person1.setIdade(21);
		person2.setName("Odila");
		person2.setIdade(21);
		
		System.out.println(person1.getName());
		System.out.println(person1.getIdade());
		System.out.println("=======");
		System.out.println(person2.getName());
		System.out.println(person2.getIdade());
		
	}

}
