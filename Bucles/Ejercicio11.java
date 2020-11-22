import java.util.Scanner;
/**
 * Santos López Lozano
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int numero;
    int cuadrado;
    int cubo;
    
    System.out.print("Introduzca un número: ");
    numero = s.nextInt();
    
    for (int i = 1; i < 6; i++){
      cuadrado = numero * numero;
      cubo = numero * numero * numero;
      numero = numero + 1;
      System.out.printf("%5d %5d %5d\n", numero, cuadrado, cubo);
    }
  }
  
}
