/**
 * Santos López Lozano
 */
public class Ejercicio15{

  public static void main(String[] args) {
        
    System.out.print("Introduzca un simbolo para usar en la pirámide: ");
    String simbolo = System.console().readLine();
    System.out.println("hacia arriba: 1");
    System.out.println("hacia abajo: 2");
    System.out.println("hacia izquierda: 3");
    System.out.println("hacia derecha: 4");
    int opcion = Integer.parseInt(System.console().readLine());

    switch(opcion) {
      case 1:
        System.out.println("  " + simbolo);
        System.out.println(" " + simbolo + simbolo + simbolo);
        System.out.println(simbolo + simbolo + simbolo + simbolo + simbolo);
        break;
      case 2:
        System.out.println(simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println(" " + simbolo+ simbolo+ simbolo);
        System.out.println("  " + simbolo);
        break;
      case 3:
        System.out.println("    " + simbolo);
        System.out.println("  " + simbolo+ " " + simbolo);
        System.out.println(simbolo + " " + simbolo + " " + simbolo);
        System.out.println("  " + simbolo + " " + simbolo);
        System.out.println("    " + simbolo);
        break;
      case 4:
        System.out.println(simbolo);
        System.out.println(simbolo + " " + simbolo);
        System.out.println(simbolo + " " + simbolo + " " + simbolo);
        System.out.println(simbolo + " " + simbolo);
        System.out.println(simbolo);
        break;
      default:
    }
  }
}
