import java.util.Scanner;

/**
 * Santos López Lozano
 */
public class Ejercicio7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int resultadoDeLaCarrera;
    int columnas = 3;
    
    for (int fila = 1; fila <= 14; fila++) {
      System.out.printf("%4d. |" , fila);
      
      for (int apuesta = 1; apuesta <= columnas; apuesta++){
        resultadoDeLaCarrera = (int)(Math.random() * 3) + 1;
        switch(resultadoDeLaCarrera) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
          }
        }
      System.out.println();
    }
    
    System.out.print("\n Al 15 - Locales ---> ");
    int goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M");
    
    System.out.print("   Visitantes ---> ");
    goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M ");
  }
}


