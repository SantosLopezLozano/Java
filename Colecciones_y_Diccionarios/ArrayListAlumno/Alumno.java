package ArrayListAlumno;
public class Alumno implements Comparable<Alumno>{
  private int numExpediente;
  private String nombre;
  private String curso;
  private Integer edad;
  public Alumno(int numExpediente, String nombre, String curso, int edad) {
    this.numExpediente = numExpediente;
    this.nombre = nombre;
    this.curso = curso;
    this.edad = edad;
  }
  @Override
  public String toString() {
    String resultado = "══════════════════════════\n";
    resultado += "Nº Expediente: " + this.numExpediente;
    resultado += "\nNombre: " + this.nombre;
    resultado += "\nCurso: " + this.curso;
    resultado += "\nEdad: " + this.edad;
    resultado += "\n══════════════════════════\n";
    return resultado;
  }
  
  @Override
  public int compareTo(Alumno a){
    return this.nombre.compareTo(a.nombre);
            
//    if(this.edad < a.edad) {
//      return -1;
//    }else if(this.edad == a.edad) {
//      return 0;
//    }else {
//      return 1;
//    }
  }
}
