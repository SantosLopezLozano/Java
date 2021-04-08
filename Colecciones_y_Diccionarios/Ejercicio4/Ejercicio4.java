package Ejercicio4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Ejercicio4 {
  
  public static void main(String args[]) {
    
    Scanner scan = new Scanner(System.in);
    
    ArrayList<String> listaDeNombres= new ArrayList<>();
    
    System.out.println("Escribe 10 palabras: ");
    
    for (int i = 0; i < 10; i++) {
      listaDeNombres.add(scan.next());
    }
    
    System.out.println("original " + listaDeNombres);
      
    Collections.sort(listaDeNombres);
      
    System.out.println("ordenada" + listaDeNombres);
  }
}

  