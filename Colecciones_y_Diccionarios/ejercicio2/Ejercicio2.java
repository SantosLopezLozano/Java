package ejercicio2;

import java.util.ArrayList;

/**
 * @author Santos López Lozano
 */
public class Ejercicio2 {
  
  public static void main(String args[]) {
    int suma = 0;
    int media = 0;
    int maximo = 0;
    int minimo = 1000000000;
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
    
    System.out.println("La suma total es: " + suma);
    System.out.println("La media: " + suma/longitud);
    System.out.println("El mínimo es: " + minimo);
    System.out.println("La máximo es: " + maximo);
  }
}
