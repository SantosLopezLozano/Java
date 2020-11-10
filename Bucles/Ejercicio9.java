import java.util.Scanner;
/**
 *Santos López Lozano
 */
public class Ejercicio9 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numeroDeDigitos = 1;
    
    System.out.println("Introduzca un número para que calcule cuántos dígitos tiene");
    int entrada = s.nextInt();
    System.out.println();
    
    while (entrada > 10){
      entrada /= 10;
      numeroDeDigitos++;
    }
    System.out.println(numeroDeDigitos);
  }
}