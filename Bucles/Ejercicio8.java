import java.util.Scanner;
/**
 *Santos López Lozano
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿De qué número quiere saber la tabla de mutiplicar?");
    int entrada = s.nextInt();
    
    int i;
    for(i = 1; i <= 10; i++) {
    System.out.println(i * entrada);
    }
  }
  
}
