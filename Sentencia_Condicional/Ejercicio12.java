/**
* Por Santos López Lozano
*/
public class Ejercicio12 {
  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("Éste es un pequeño cuestionario para hacer un ejercicio");
    
    System.out.println("Primera pregunta");
    System.out.println("Él chocolate marrón es marron? ");
    respuesta = System.console().readLine();
    if (respuesta.equals("si")) {
      puntos++;
    }
    
    System.out.println("segunda pregunta");
    System.out.println("Él chocolate negro es negro? ");
    respuesta = System.console().readLine();
    if (respuesta.equals("si")) {
      puntos++;
    }
    
    System.out.println("tercera pregunta");
    System.out.println("Él chocolate blanco es blanco? ");
    respuesta = System.console().readLine();
    if (respuesta.equals("si")) {
      puntos++;
    }
    
    System.out.println("sexta pregunta");
    System.out.println("Él caballo blanco de santiago es blanco? ");
    respuesta = System.console().readLine();
    if (respuesta.equals("si")) {
      puntos++;
    }
    
    System.out.println("octaba pregunta");
    System.out.println("Él caballo negro de santiago es negro? ");
    respuesta = System.console().readLine();
    if (respuesta.equals("si")){
      puntos++;
    }
   
    System.out.println("decima pregunta");
    System.out.println("Él chocolate marrón es amarillo? ");
    respuesta = System.console().readLine();
    if (respuesta.equals("no")){
      puntos++;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos.");

  }
}
