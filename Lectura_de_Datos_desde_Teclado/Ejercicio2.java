/**
 * Por Santos López
 */
public class Ejercicio2{
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduce euros ");
    numero = System.console().readLine();
    double euros = Integer.parseInt(numero);
    
    int pesetas = (int) (euros * 166386);
    
    System.out.println(euros + " euros son " + pesetas + " pesetas");
  }
}
