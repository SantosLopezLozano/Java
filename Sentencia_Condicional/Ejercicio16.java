/**
 * Santos López Lozano
 */
public class Ejercicio16{

  public static void main(String[] args) {
    
    String respuesta;
    int puntos = 0;
    
    System.out.print("Test para saber si tu pareja te es fiel v para verdadero f para falso: ");
    System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("Ha aumentado sus gastos de vestuario: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("Ha perdido el interés que mostraba anteriormente por ti: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("No te deja que mires la agenda de su teléfono móvil: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
        
    System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("Has notado que últimamente se perfuma más: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    if ( puntos <= 10 ) {
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ( (puntos > 11 ) && (puntos <= 22) ) {
      System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");    
    }
    
    if ( puntos >= 22 ) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
    }
  }
}
