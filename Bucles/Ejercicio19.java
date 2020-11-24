import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Piramide {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("con qué caracter quiere llenar la pirámide?");
    System.out.print("-> ");
    String caracter = s.next();
    
    System.out.println("que altura quiere que tenga la piráminde");
    System.out.print("-> ");
    int altura = s.nextInt();
    
    int lineas = 1;
    int espacios = altura - 1;
    int base = 1;
      
    while (lineas <= altura) {
      
      //para los espacios
      for (int i = 1; i <= espacios; i++){
        System.out.print(" ");
      }
      //para la lineas
      for (int i = 1; i <= base; i++) {
        System.out.print(caracter);
      }
      
      System.out.println();
      lineas++;
      espacios--;
      base += 2;
    }
  }
  
}
