package ejercicio3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Ejercicio3 {
  
  public static void main(String args[]) {
    
    Scanner scan = new Scanner(System.in);
    
    ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
    
    System.out.println("escribe 10 numeros: ");
    
    for (int i = 0; i < 10; i++) {
      listaDeNumeros.add(scan.nextInt());
    }
    
    System.out.println("sin ordenar " + listaDeNumeros);
    
    Collections.sort(listaDeNumeros);
    
    System.out.println("ordenada " + listaDeNumeros);
  }
}