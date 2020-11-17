import java.util.Scanner;
/**
 *Santos López Lozano
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numeroDeNotas = 1;
    long nota;
    long media;
    
    System.out.println("las notas de las que quiere saber la media.");
    System.out.println("Cuando termines de introducir notas ponga una negativa.");
    
    System.out.print("escriba una nota= ");
      nota = s.nextInt();
    long notaFinal = nota;
    
    while (nota >= 0) {
      System.out.print("escriba una nota= ");
      nota = s.nextInt();
      notaFinal = nota + notaFinal;
      numeroDeNotas++;
    }
    numeroDeNotas--;
    notaFinal = notaFinal - nota;
    System.out.println("Has introducido= " + numeroDeNotas + " notas");
    System.out.println("la suma de todas tus notas es= " + notaFinal);
    media = notaFinal / numeroDeNotas;
    System.out.println("la nota media es= " + media);
    
  }
}