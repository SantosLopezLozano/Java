import java.util.Scanner;
/**
 *
 * @author Santos López Lozano
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] num = new int [12];
    
    num[0] = 999;
    num[2] = 888;
    num[4] = 777;
    num[6] = 666;
    num[8] = 555;
    num[10] = 444;
            
    System.out.print("Los valores del array num son los siguientes: ");
    for (int i = 0; i < 12; i++) {
      System.out.print(" " + num[i] + " ");
    }
  }
  
}
