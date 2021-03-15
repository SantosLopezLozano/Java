package ejercicio1;
/**
 *
 * @author Santos López
 */
public class PruebaCaballo {
  
  public static void main(String[] args) {
    Caballo c = new Caballo("razadora", "Special Week", "F", 60);
    
    System.out.println("Hola, me llamo " + c.getNombre());
    c.come();
  }  
}
