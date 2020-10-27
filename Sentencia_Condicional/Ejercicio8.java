/**
* Por Santos López Lozano
*/
public class Ejercicio8 {
  public static void main(String[] args) {

    System.out.print("Introduzca el valor de la nota 1: ");
    double n1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el valor de la nota 2: ");
    double n2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el valor de la nota 3: ");
    double n3 = Integer.parseInt(System.console().readLine());
    
    if ((n1 < 0) || (n2 < 0) || (n3 < 0) || (n1 > 10) || (n2 > 10) || (n3 > 10)) {
      System.out.println("valor inválido");
    } else {
      double nf = ((n1 + n2 + n3) / 3);
      System.out.print("su nota final es: " + nf );
      
      if (nf < 5) {
      System.out.print("Insuficiente");
    }
    
    if ((nf >= 5) && (nf < 6)) {
      System.out.print("Suficiente");
    }
    
    if ((nf >= 6) && (nf < 7)) {
      System.out.print("Bien");
    }
    
    if ((nf >= 7) && (nf < 9)) {
      System.out.print("Notable");
    }
    
    if (nf >= 9) {
      System.out.print("Sobresaliente");
    }
    }
    }
    
    
  }
