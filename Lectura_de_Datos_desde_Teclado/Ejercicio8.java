/**
 * Por Santos López
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduzca las horas que has trabajado: ");
    numero = System.console().readLine();
    double horas= Integer.parseInt(numero);
    
    double sueldo = (double) (12 * horas);
    
    System.out.print("tu sueldo es " + sueldo);
  }
}
