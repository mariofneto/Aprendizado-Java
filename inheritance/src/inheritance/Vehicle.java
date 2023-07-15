package inheritance;

public class Vehicle {
	String marca;
	String nomeCondutor;
	int numeroRodas;
	
	public Vehicle(String marca, String nomeCondutor, int numeroRodas) {
		this.marca = marca;
		this.nomeCondutor = nomeCondutor;
		this.numeroRodas = numeroRodas;
	}

	void detalhes() {
		System.out.println("Sem detalhes");
	}
}
