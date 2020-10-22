/**
 * Por Santos López
 */
public class Ejercicio7 {
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduzca el precio del producto: ");
    numero = System.console().readLine();
    double base= Integer.parseInt(numero);
    
    double iva = 21 * base / 100;
    double precioTotal = base + iva;

    System.out.print("el precio total del producto es " + precioTotal);
  }
}
