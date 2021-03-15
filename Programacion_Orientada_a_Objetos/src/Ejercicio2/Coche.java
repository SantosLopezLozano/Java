package Ejercicio2;

public class Coche extends Vehiculo {
	private int cilindrada; // cilidrada en cm cúbicos

	public Coche(int c) {
		// super();
		this.cilindrada = c;
	}

	public void quemaRueda() {
		Do.println("RrrrRRRRNnnnnnnn");
	}
}
