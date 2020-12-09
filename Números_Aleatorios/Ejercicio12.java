import java.util.Scanner;

/**
 *Santos López Lozano
 */
public class Ejercicio12 {

  public static void main(String[] args) 
    throws InterruptedException {

    int linea = 0;
    
    for(int i = 0; i < 9999; i++) {
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
      
      if (linea++ == 60) {
        linea = 0;
        Thread.sleep(50);
        System.out.println();
        System.out.print("\033[33m");
      }
    }
  }
}