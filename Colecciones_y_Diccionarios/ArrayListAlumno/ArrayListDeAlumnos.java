package ArrayListAlumno;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDeAlumnos {
  
  public static void main(String[] args) {
    
    Alumno alu1 = new Alumno(1, "Alan Brito", "1º DAM", 13);
    Alumno alu2 = new Alumno(2, "Elena Nito", "2º DAM", 14);
    Alumno alu3 = new Alumno(3, "Esteban Quito", "1º DAW", 12);
    
    // System.out.println(alu1);
    
    ArrayList<Alumno> alumnos = new ArrayList<>();
    
    alumnos.add(alu1);
    alumnos.add(alu3);
    alumnos.add(alu2);
    
    alumnos.add(new Alumno(10, "Elsa Pato", "2º DAW", 13));
    
    System.out.println("Listado de alumnos desordenado");
    
    for (Alumno alumno : alumnos) {
      System.out.println(alumno);
      
    }
    
    Collections.sort(alumnos);
    
    System.out.println("Listado de alumnos ordenado");
    
    for (Alumno alumno : alumnos) {
      System.out.println(alumno);
      
    }
    
  }
}
