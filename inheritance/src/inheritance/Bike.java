package inheritance;

public class Bike extends Vehicle{
	
	boolean precisaHabilitacao;

	Bike(String marca, String nomeCondutor, int numeroRodas, boolean precisaHabilitacao){
		super(marca, nomeCondutor,numeroRodas);
		this.precisaHabilitacao = precisaHabilitacao;
	}
	@Override
	void detalhes() {
		System.out.println("Andando com a minha "+marca+" *uhul*");
	}
}
