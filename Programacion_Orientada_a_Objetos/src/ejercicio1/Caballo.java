package ejercicio1;

/**
 *
 * @author Santos López Lozano
 */
public class Caballo {
  //atributos: cualidades del objeto en cuestion//////////////////////
  String raza;
  String nombre;
  String sexo;
  double peso;
  int dimensiones;
  int edad;
  int carrerasGanadas;
    
  //metodos: acciones de hace, constructores, getter y setter////////////////////////
  
  //constructor
  Caballo(String r, String n, String s, double p) {
    this.raza = r;
    this.nombre = n;
    this.sexo = s;
    this.peso = p;
  }
  
  //getter

  public String getNombre() {
    return nombre;
  }
  //setter
  
  public void setNombre(String nom) {
    this.nombre = nom;
  }
  
  //acciones: como hacer que el caballo coma
  
  public void come() {
    System.out.println("Ñam ñam ñam");
  }
  
}
