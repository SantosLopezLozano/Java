package HashMap;

import java.util.HashMap;
/**
 * @author Santos lópez Lozano
 */
public class EjemploHashMap {
  
  public static void main(String args[]) {
    
    HashMap<String, String> diccionarioEspañolIngles = new HashMap<String, String> ();
    
    diccionarioEspañolIngles.put("ratón", "mouse");
    diccionarioEspañolIngles.put("raton", "Mokey Mous");
    diccionarioEspañolIngles.put("pantalla", "screen");
    diccionarioEspañolIngles.put("teclado", "keyboard");
    diccionarioEspañolIngles.put("libro", "book");
    diccionarioEspañolIngles.put("lápiz", "pen");
    
    System.out.println(diccionarioEspañolIngles.get("pantalla"));
    System.out.println(diccionarioEspañolIngles.get("raton"));
    System.out.println(diccionarioEspañolIngles.get("ratón"));
    System.out.println(diccionarioEspañolIngles.get("lapiz"));
    
//se usa mas que nada para los if, sirve para ver si el diccionario tiene o no el elemento que se busca
    
    if (diccionarioEspañolIngles.containsKey("papel")){
      System.out.println("La palabra estña en el diccionario");
      System.out.println("en ingles se dice " + diccionarioEspañolIngles.get("papel"));
    }
    
//System.out.println(diccionarioEspañolIngles.containsKey("papel"));

    if (diccionarioEspañolIngles.containsKey("libro")){
      System.out.println("La palabra libro está en el diccionario");
      System.out.println("en ingles se dice " + diccionarioEspañolIngles.get("libro"));
    }
    
//System.out.println(diccionarioEspañolIngles.containsKey("libro"));
//para extraer cosas del diccionario usar entrySet
//
//    System.out.println("todas las entradas del diccionario extraidas con enttrySet");
//    System.out.println(diccionarioEspañolIngles.entrySet);
//    
////para extraer cosas del diccionario una a una
//    
//    System.out.println("\nentradas del diccionario extridas una a una");
//    for (diccionarioEspañolIngles.Entry pareja: diccionarioEspañolIngles.entrySet()){
//      System.out.println(clave.getKey() + " --> " + valor.getKey());
//    } 
    
  }
}
