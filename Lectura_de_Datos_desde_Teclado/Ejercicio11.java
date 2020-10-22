/**
 *Por Santos
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduzca Kb: ");
    numero = System.console().readLine();
    int Kb= Integer.parseInt(numero);
    
    int Mb = Kb / 1000;
    
    System.out.println (Kb + " Kb son " + Mb + " Mb");
  }
}
