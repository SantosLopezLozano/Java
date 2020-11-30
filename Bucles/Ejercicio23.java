/**
 * Santos López Lozano
 */
public class Ejercicio23 {

  public static void main(String[] args) {

    System.out.println("introduzca números");
    System.out.println("El programa termina cuando la suma sea mayor que 10000.");
    
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.println("introducidos  " + numeroDeElementos + " números.");
    System.out.println("suma total " + suma + ".");
    System.out.println("media  " + suma / numeroDeElementos + ".");
  }
}
