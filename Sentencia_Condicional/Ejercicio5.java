/**
* Por Santos López Lozano
*/
public class Ejercicio5 {
  public static void main(String[] args) {
    
    System.out.print("introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("no se puede.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
