package ejercicio5;

/**
 *
 * @author Santos López Lozano
 */
public class Pizza {
  
  // atributos
  private static int totalPedidas;
  private static int totalServidas;
  
  private String tamano;
  private String tipo;
  private String estado;
  
  //metodos
  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estado = "pedida";
    Pizza.totalPedidas++;
  }
  
  public String toString() {
    return "Pizza{" + "tamaño=" + tamano + ", tipo=" + tipo + ", estado=" + estado + '}';
  }
  
  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }
  
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServidas++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }
}
