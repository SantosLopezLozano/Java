package Ejemploarraylist2;

import java.util.ArrayList;

public class CrudPeliculas {

  public static void main(String args[]) {
    //vidioteca inicial
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    peliculas.add(new Pelicula("qwuyywr", "pequeños detalles", 100, 2021, "policiaca"));
    peliculas.add(new Pelicula("qrrquwr", "grandes detalles", 100, 2021, "romance"));
    peliculas.add(new Pelicula("qwgguwr", "medianos detalles", 100, 2021, "misterio"));
    
    
    
    //lmenú rincipal
    System.out.println("1.Listado completo");
    System.out.println("2.Nueva Película");
    System.out.println("3. Borrado");
    System.out.println("4.Edición");
    System.out.println("Elige una opción: ");
  }
}
