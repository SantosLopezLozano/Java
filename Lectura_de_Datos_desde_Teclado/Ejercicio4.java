/**
 * Por Santos López
 */
public class Ejercicio4{
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduce un número ");
    numero = System.console().readLine();
    double n1= Integer.parseInt(numero);
    
    System.out.print("Por favor, introduce otro número ");
    numero = System.console().readLine();
    double n2= Integer.parseInt(numero);
    
    double suma = (double) (n1 + n2);
    double resta =  (double) (n1 - n2);
    double multiplicacion = (double) (n1 * n2);
    double division = (double) (n1 / n2);
    
    System.out.println( n1 + " + " + n2 + " = " + suma);
    System.out.println( n1 + " - " + n2 + " = " + resta);
    System.out.println( n1 + " * " + n2 + " = " + multiplicacion);
    System.out.println( n1 + " / " + n2 + " = " + division);
  }
}
