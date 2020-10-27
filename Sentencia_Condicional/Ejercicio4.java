/**
* Por Santos López Lozano
*/
public class Ejercicio4 {
  public static void main(String[] args) {

    int sueldo;

    System.out.print("Introduzca el número de horas de trabajo: ");
    int horasTrabajo = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajo < 40) {
      sueldo = 12 * horasTrabajo;
    } else {
      sueldo = (40 * 12) + ((horasTrabajo - 40) * 16);
    }
    System.out.println("su sueldo será de:" + sueldo);

  }
}
