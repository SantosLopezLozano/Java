/**
 * Por Santos López
 */
public class Ejercicio9{
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduzca el radio: ");
    numero = System.console().readLine();
    double radio= Integer.parseInt(numero);
    
    System.out.print("Y ahora introduzca la medida de la altura: ");
    numero = System.console().readLine();
    double altura= Integer.parseInt(numero);
    
    double area = ( (PI  * radio * radio * altura) / 3.0);
    
    System.out.println( "el área del cuadrado es " + area);
  }
}
