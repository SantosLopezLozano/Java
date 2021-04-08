package Ejemploarraylist2;

public class Pelicula {

  private String codigo;
  private String titulo;
  private int duracion; //en minutos
  private int anio; //año de estreno
  //para genero, explorar las siguientes mejoras:
  //-utilizar un tipo enumerado
  //-usar un array
  private String genero;

  public Pelicula(String codigo, String titulo, int duracion, int anio, String genero) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.duracion = duracion;
    this.anio = anio;
    this.genero = genero;
  }
  
}
