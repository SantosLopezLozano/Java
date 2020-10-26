/**
* Por Santos López Lozano
*/
public class Ejercicio2 {
  public static void main(String[] args) {
  
    System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
    int x = Integer.parseInt(System.console().readLine());

    if ((x >= 6) && (x <= 12)) {
      System.out.println("Buenos días");
    }
        
    if ((x >= 13) && (x <= 20)) {
      System.out.println("Buenas tardes");
    }
      
    if (((x >= 21) && (x < 24)) || ((x <= 5) && (x >= 0))) {
      System.out.println("Buenas noches");
    }
      
    if ((x >= 24) || (x < 0)) {
      System.out.println("no me sirve, muérete");
    }
     
     }
   }

