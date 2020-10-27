/**
* Por Santos López Lozano
*/
public class Ejercicio5 {
  public static void main(String[] args) {

    System.out.print("Introduzca el valor de a: ");
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el valor de b: ");
    int b = Integer.parseInt(System.console().readLine());
    
    if ((a < 0) || (a > 0)){
      int x = (-b / a);
      System.out.println("valor de x = " + x);
    } else {
      System.out.println("valor de a invalido");
    }
  }
}
