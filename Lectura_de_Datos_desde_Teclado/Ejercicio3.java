/**
 * Por Santos López
 */
public class Ejercicio3{
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduce pesetas ");
    numero = System.console().readLine();
    int pesetas = Integer.parseInt(numero);
    
    double euros = (double) (pesetas / 166386);
    
    System.out.println(pesetas + " pesetas son " + euros + " euros");
  }
}
