package ejercicio1;

import java.util.ArrayList;

/**
 * @author Santos López Lozano
 */
public class Ejercicio1 {

  public static void main(String args[]) {
    ArrayList<String> alumnos = new ArrayList<>();
    
    alumnos.add("Alu1");
    alumnos.add("Alu2");
    alumnos.add("Alu3");
    alumnos.add("Alu4");
    alumnos.add("Alu5");
    alumnos.add("Alu6");

    alumnos.forEach(nombre -> {
      System.out.println(nombre);
    });
  }
}
