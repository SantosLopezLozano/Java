/**
 * Santos López Lozano
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    
    int intentos = 5;
    int numeroIntroducido;
    boolean acertado = false;
    int numeroMisterioso = (int)(Math.random() * 101);
    
    System.out.println("Adivina núnero 1-100. 5 oportunidades.");

    do {
      System.out.print("Introduce número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      intentos--;

      if ( (numeroIntroducido > numeroMisterioso) && (intentos > 0) ){
        System.out.println("el número es menor");
        System.out.println("Te quedan " + intentos + " intentos.");
      }
      
      if ( (numeroIntroducido < numeroMisterioso) && (intentos > 0) ){
        System.out.println("el número es mayor");
        System.out.println("Te quedan " + intentos + " intentos.");
      }
      
      if (numeroIntroducido == numeroMisterioso) {
        acertado = true;
        System.out.println("has acertado");
      }
    } while (!acertado && (intentos > 0));
    
    if (!acertado) {
      System.out.println("no has acertado, el número era " + numeroMisterioso);
    }
  }
}
