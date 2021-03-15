package Ejercicio2;

public class Vehiculo {

  // Atributos de clase
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;

  // Getter de los kilometrosTotales de la clase
  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }


  // Atributos de instancia
  private int kilometrosRecorridos;

  // Getter de los kilometrosRecorridos de la instancia
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }


  // Método constructor del vehículo
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  // Método que aumenta el contador de km de la instancias y por tanto tambien los km totales de la clase
  public void recorre(int km) {
    this.kilometrosRecorridos += km;
    Vehiculo.kilometrosTotales += km;
  }

}
