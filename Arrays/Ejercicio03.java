import java.util.Scanner;
/**
 *
 * @author Santos López Lozano
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] num = new int [5];
    int i;
    
    System.out.println("Escriba valores para el array");
    
    for (i = 0; i < 5; i++) {
      num[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("numeros introducidos a la inversa");
    for (i = 4; i >= 0; i--) {
      System.out.print(num[i] + " ");
    }
  }
  
}
