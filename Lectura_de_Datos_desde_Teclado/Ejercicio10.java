/**
 *Por Santos
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduzca Mb: ");
    numero = System.console().readLine();
    int Mb= Integer.parseInt(numero);
    
    int Kb = Mb * 1000;
    
    System.out.println (Mb + " Mb son " + Kb + " Kb");
  }
}
