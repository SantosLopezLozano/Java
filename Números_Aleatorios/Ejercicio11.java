import java.util.Scanner;

/**
 *Santos López Lozano
 */
public class Ejercicio11 {
  
  public static void main(String[] args) {
    
    int nota;
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for(int i = 0; i < 20; i++) {
      
      nota = (int)(Math.random() * 5);
      
      switch(nota) {
        case 0:
          suspensos++;
          break;
        case 1:
          suficientes++;
          break;
        case 2:
          bienes++;
          break;
        case 3:
          notables++;
          break;
        case 4:
          sobresalientes++;
          break;
        default:
      }

    }
    
    System.out.println("\nsuspensos: " + suspensos);
    System.out.println("suficientes: " + suficientes);
    System.out.println("bienes: " + bienes);
    System.out.println("notables: " + notables);
    System.out.println("sobresalientes: " + sobresalientes);
  }
}