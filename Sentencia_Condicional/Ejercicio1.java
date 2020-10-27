/**
 *
 * Por Santos López Lozano
 */

public class Ejercicio1 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Diga un día de la semana: ");
    dia = (System.console().readLine());
    
    switch (dia.toLowerCase() ){
      case "lunes":
        System.out.println( "Entornos de desarrollo");
        break;
      case "martes":
        System.out.println( "Programación");
        break;
      case "miércoles":
        System.out.println( "Programación");
        break;
      case "jueves":
        System.out.println( "Programación");
        break;
      case "viernes":
        System.out.println("FOL");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
  }
}
