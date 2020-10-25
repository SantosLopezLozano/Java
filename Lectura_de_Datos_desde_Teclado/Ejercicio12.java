/**
 * Por Santos López
 */
public class Ejercicio12{
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Por favor, introduzca la nota de su primer examen: ");
    numero = System.console().readLine();
    double n1= Integer.parseInt(numero);
    
    System.out.print("Y ahora introduzca la nota deeseada de media: ");
    numero = System.console().readLine();
    double nf= Integer.parseInt(numero);
    
    double n2 = (double) ( (nf / 0.6) - ( (n1 * 0.2) / 0.3) );
    
    System.out.println( "para sacar esa media tendrás que sacar en el segundo examen un " + n2);
  }
}
