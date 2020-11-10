import java.util.Scanner;
/**
 *Santos López Lozano
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numeroDeNotas = 0;
    long nota;
    
    System.out.println("las notas de las que quiere saber la media.");
    System.out.println("Cuando termines de introducir notas ponga una negativa.");
    
    do {
      System.out.print("escriba una nota= ");
      nota = s.nextInt();
      numeroDeNotas++;
    } while (nota >= 0);
    System.out.println(numeroDeNotas);
  }
}