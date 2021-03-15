package Ejercicio2;


public class Bicicleta extends Vehiculo {
	private int pinones; // número de piñones

	public Bicicleta(int p) {
		// super();
		this.pinones = p;
	}

	public void hazCaballito() {
		Do.println("Estoy haciendo el caballito.");
	}
}
