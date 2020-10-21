/**
 * Por Santos López
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduce un número: ");
    numero = System.console().readLine();
    int n1 = Integer.parseInt(numero);
    
    System.out.print("Por favor, introduce otro número: ");
    numero = System.console().readLine();
    int n2 = Integer.parseInt(numero);
    
    int total = n1 * n2;
    
    System.out.println(n1 + " * " + n2 + " = " + total);
  }
}
