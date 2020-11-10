import java.util.Scanner;

/**
 * Santos López Lozano
 */
public class Ejercicio7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String clave = "7777";
    int intentos = 4;
    do {
      
      System.out.println("Introduzca 4 dígitos.");
      String entrada = s.next();
      
      if(!entrada.equals(clave)) {
        
        intentos--;
        System.out.println("Error, vuelva a intentarlo.");
        System.out.println("Tienes " + (intentos) + " intentos.\n");
        
      } else {
        
        System.out.println("Clave correcta.");
        intentos = 0;
        
      }
      
    } while (intentos > 0 && intentos <= 4);
  }
}


