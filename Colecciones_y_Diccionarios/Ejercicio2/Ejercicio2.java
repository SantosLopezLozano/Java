package Ejercicio2;

import java.util.ArrayList;

/**
 * @author Santos López Lozano
 */
public class Ejercicio2 {
  
  public static void main(String args[]) {
    int suma = 0;
    double media = 0;
    int maximo = 0;
    int minimo = 100;
    double longitud = (int)(Math.random() * 11 + 10);
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    for(int i = 0; i < longitud; i++){
     numeros.add((int) (Math.random()*101));
    }
    
    System.out.println(numeros);
    
    for (int n: numeros) {
      suma = suma + n;
      
      if(n < minimo) {
        minimo = n;
      }
      if(n > maximo){
        maximo = n;
      }
    }
    media = (double)suma / (double)longitud;
    
    System.out.println("La suma total es: " + suma);
    System.out.println("La media: " + media);
    System.out.println("El mínimo es: " + minimo);
    System.out.println("La máximo es: " + maximo);
  }
}
