import java.util.Scanner;
/**
 *
 * @author Santos López Lozano
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    char [] simbolo = new char [10];
    
    simbolo[0] = 'C';
    simbolo[1] = 'O';
    simbolo[2] = 'D';
    simbolo[3] = 'E';
    simbolo[5] = 'V';
    simbolo[6] = 'E';
    simbolo[7] = 'I';
    simbolo[8] = 'N';
            
    System.out.print("Los caracteres del array simbolo son los siguientes: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(" " + simbolo[i] + " ");
    }
  }
  
}
