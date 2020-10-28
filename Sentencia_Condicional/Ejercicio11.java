/**
* Por Santos López Lozano
*/
public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.print("Éste es un programa para calcular cuanto falta para medianoche");
    
    System.out.print("Escriba la hora que es: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("indique ahora los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    if ((hora <= 23) && (hora >= 0) && (minutos <= 59) && (minutos >= 0)) {
      int segundosQueFaltan = 86400 - (((hora * 60) + minutos) * 60);
      System.out.print("quedan "+ segundosQueFaltan + " segundos para medianoche");
    }

  }
}

