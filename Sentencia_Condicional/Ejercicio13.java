/**
* Por Santos López Lozano
*/
public class Ejercicio13 {
  public static void main(String[] args) {
    int  numero;
    
    System.out.println("introduzca tres numeros enteros y el programa lo ordenará:");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());
    int primero;
    int segundo;
    int tercero;
    
    if ((a < b) && (b < c)){
      primero = a;
    }  else {
      if ((b > a) && (b > c)){
        segundo = b
    }
    if (b > c) {
      numero = b;
      b = c;
      c = numero;
    }
    
    if (a > b) {
      numero = a;
      a = b;
      b = numero;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
  }
}
