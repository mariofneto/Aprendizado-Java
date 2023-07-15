package inheritance;

public class Car extends Vehicle {
	
	boolean precisaHabilitacao;
	
	Car(String marca, String nomeCondutor, int numeroRodas, boolean precisaHabilitacao){
		super(marca, nomeCondutor, numeroRodas);
		this.precisaHabilitacao = precisaHabilitacao;
	}
	@Override
	void detalhes() {
		System.out.println("Eu "+nomeCondutor+" estou Dirigindo meu carro "+marca+" *bibi*");
	}
}
