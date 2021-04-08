package Ejemploarraylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEjemplosClase {

  public static void main(String args[]) {
    
    Scanner scan = new Scanner(System.in);
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    for(int i = 0; i < 20; i++){
     numeros.add((int) (Math.random()*100));
    }
    
    System.out.println(numeros);
    
    //System.out.println("numeros que eliminar");
    //int yess = scan.nextInt();
    
    numeros.removeIf(numero -> esPar(numero));
    numeros.removeIf(numero -> esPrimo(numero));
    
    
    System.out.println(numeros);  
  }
  
  public static boolean esPar(int numero) {
        //Si el resto de numero entre 2 es 0, el numero es par
        if(numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
  public static boolean esPrimo(int numero){
  int contador = 2;
  boolean primo=true;
  while ((primo) && (contador!=numero)){
    if (numero % contador == 0)
      primo = false;
    contador++;
  }
  return primo;
  }
}
  

