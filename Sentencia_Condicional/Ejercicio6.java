/**
* Por Santos López Lozano
*/
public class Ejercicio6 {
  public static void main(String[] args) {
    
    double g = 9.81;

    System.out.print("Introduzca el valor de la altura: ");
    double h = Integer.parseInt(System.console().readLine());
    
    double y = (2 * h) / g;
    
    if (y >= 0) {
      double x = Math.sqrt(y);
      System.out.println("valor de x = " + x);
    } else {
      System.out.println("valor de h invalido");
    }
  }
}
