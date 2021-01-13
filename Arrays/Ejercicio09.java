import java.util.Scanner;
/**
 *
 * @author santos López Lozano
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] num = new int[8];
    int i;
    System.out.print("Introduzca ocho números y pulse enter");
    
    for (i = 0; i < 8; i++) {
      num [i] = Integer.parseInt(s.nextLine());
    }
    
    for (int n : num) {
      if (n % 2 == 0) {
        System.out.println(n + " par");
      }else {
        System.out.println(n + " impar");
      }
    }
  } 
}