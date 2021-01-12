import java.util.Scanner;
/**
 *
 * @author Santos López Lozano
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] num = new int[100];
    for (int i = 0; i < 100; i++) {
      num[i] = (int) (Math.random()*21);
      System.out.print(num[i]+" ");
    }
    System.out.println(" ");
    System.out.print("primer valor: ");
    int valor1 = Integer.parseInt(s.nextLine());
    System.out.print("segundo valor: ");
    int valor2 = Integer.parseInt(s.nextLine());
    for (int i = 0; i < 100; i++) {
      if(num[i]== valor1){
        System.out.print("'"+valor2+"' ");
      }else{
        System.out.print(num[i]+" ");
      }
    }
  }
  
}
