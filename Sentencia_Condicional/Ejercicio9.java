/**
* Por Santos López Lozano
*/
public class Ejercicio9 {
  public static void main(String[] args) {

    System.out.print("Introduzca el valor de la a: ");
    double a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el valor de la b: ");
    double b = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el valor de la c: ");
    double c = Integer.parseInt(System.console().readLine());
    
    if (a == 0) {
      double x = (-b / a);
      
    } else {
      
      double y = b * b - 4 * a * c;
      if (y >= 0){
        Math.sqrt(y);
      }
    }
  }
}
    
  
