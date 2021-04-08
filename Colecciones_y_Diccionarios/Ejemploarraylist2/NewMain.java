package Ejemploarraylist2;

import java.util.ArrayList;

public class NewMain {

  public static void main(String[] args) {
    ArrayList<String> animales = new ArrayList<>();
    
    animales.add("gato");
    animales.add("perro");
    animales.add("canario");
    animales.add("ajolote");
    animales.add("perro");
    animales.add("mapache");
    
    System.out.println(animales);
    
    animales.remove("perro");
    System.out.println(animales);
    
    animales.remove(3);
    System.out.println(animales);
    
    
  }
  
}
