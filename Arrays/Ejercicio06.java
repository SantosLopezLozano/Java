import java.util.Scanner;
/**
 *
 * @author Santos López ÑLozano
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numero = new int[15];
      int i;
      
      System.out.println("introduce numeros:");
      
      for (i = 0; i < 15; i++) {
        numero[i] = Integer.parseInt(s.nextLine());
      }
      
      System.out.println();
      System.out.println("Original:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%2d ", i);
      }
      System.out.println(" ");
      for (i = 0; i < 75; i++) {
        System.out.print(" ");
      }
      System.out.println(" ");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%2d ", numero[i]);
      }
      System.out.println(" ");
      
      int aux = numero[14];
      for (i = 14; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[0] = aux;
      
      System.out.println("\nAlterado:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%2d ", i);
      }
      System.out.println(" ");
      for (i = 0; i < 75; i++) {
        System.out.print(" ");
      }
      System.out.println(" ");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%2d ", numero[i]);
      }
      System.out.println(" ");
  }
  
}
