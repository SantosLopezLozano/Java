import java.util.Scanner;
/**
 * Santos López Lozano
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    
     Scanner s = new Scanner(System.in);
    int[] numeros = new int [10];
    System.out.print("Pon Diez Números: ");
    int num =0;
    int max = 0;
    int min = 999999999;
    for (int i = 0; i < 10; i++) {
      num = Integer.parseInt(s.nextLine());
      numeros[i] = num;
      if(numeros[i]>max){
        max = numeros[i];
      }
      if(numeros[i]< min){
        min=numeros[i];
      }
    }
    System.out.println();
      
    for (int i = 0; i < numeros.length; i++) {
      if(numeros[i]== max){
        System.out.println(numeros[i]+" maximo");
      }else if(numeros[i]== min){
        System.out.println(numeros[i]+" minimo");
      }else{
        System.out.println(numeros[i]);
      }
      
    }
  }
}