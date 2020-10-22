/**
 * Por Santos López
 */
public class Ejercicio6{
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduzca la medida de la base de su triángulo: ");
    numero = System.console().readLine();
    double base= Integer.parseInt(numero);
    
    System.out.print("Y ahora introduzca la medida de la altura: ");
    numero = System.console().readLine();
    double altura= Integer.parseInt(numero);
    
    double area = (double) ((base * altura) / 2);
    
    System.out.println( "el área del cuadrado es " + area);
  }
}
