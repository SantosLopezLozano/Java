package Ejercicio2;

import java.util.Scanner;

public class Do {


// Colorear texto (y cursiva y subrayado)

// Función a la que se le pasa como argumentos, un 'color' ('red' por ejemplo),
// un 'modo' ('bold' por ejemplo) y la 'cadena de texto' a modificar
// y la función te devulve el texto introducido con las modificaciones especificadas.

// Se pueden usar abreviaciones de una letra (o de 2 si estuviera repetida)
// para los 'colores' y los 'modos' en lugar de toda la palabra
// como 'r' en lugar de 'red'.

// Para usar colores claros hay que poner en el 1er parametro el valor 'true'.
public static String color(boolean light, String color, String modo, String texto) {

	String nuevoTexto = texto;

	switch(color) {
		case "black": 	color = !light ? "30" : "90"; break;
		case "b": 			color = !light ? "30" : "90"; break;

		case "red": 		color = !light ? "31" : "91"; break;
		case "r": 			color = !light ? "31" : "91"; break;

		case "green": 	color = !light ? "32" : "92"; break;
		case "g": 			color = !light ? "32" : "92"; break;

		case "yellow": 	color = !light ? "33" : "93"; break;
		case "y": 			color = !light ? "33" : "93"; break;

		case "blue": 		color = !light ? "34" : "94"; break;
		case "bl": 			color = !light ? "34" : "94"; break;

		case "magenta": color = !light ? "35" : "95"; break;
		case "m": 			color = !light ? "35" : "95"; break;

		case "cyan": 		color = !light ? "36" : "96"; break;
		case "c": 			color = !light ? "36" : "96"; break;

		case "white": 	color = !light ? "37" : "97"; break;
		case "w": 			color = !light ? "37" : "97"; break;
	}

	switch(modo) {
		case "bold": 				modo = ";1"; break;
		case "b": 					modo = ";1"; break;

		case "italics": 		modo = ";3"; break;
		case "i": 					modo = ";3"; break;

		case "underline": 	modo = ";4"; break;
		case "u": 					modo = ";4"; break;

		case "background": 	modo = ";7"; break;
		case "bg": 					modo = ";7"; break;
	}

	nuevoTexto = "\033[" + color + modo + "m" + nuevoTexto + "\033[0m";

	return nuevoTexto;

}


// Imprimir texto en pantalla

public static void print(String texto) {
  System.out.print(texto);
}

public static void print(char texto) {
  System.out.print(texto);
}

public static void print(int n) {
  System.out.print(n);
}

public static void print(long n) {
  System.out.print(n);
}

public static void print(float n) {
  System.out.print(n);
}

public static void print(double n) {
  System.out.print(n);
}


public static void println() {
  System.out.println();
}

public static void println(String texto) {
  System.out.println(texto);
}

public static void println(char texto) {
  System.out.println(texto);
}

public static void println(int n) {
  System.out.println(n);
}

public static void println(long n) {
  System.out.println(n);
}

public static void println(float n) {
  System.out.println(n);
}

public static void println(double n) {
  System.out.println(n);
}




// Función que automatiza la entrada de datos por teclado
public static int inputInt() {
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  return n;
}

public static long inputLong() {
  Scanner s = new Scanner(System.in);
  long n = s.nextLong();
  return n;
}

public static float inputFloat() {
  Scanner s = new Scanner(System.in);
  float n = s.nextFloat();
  return n;
}

public static double inputDouble() {
  Scanner s = new Scanner(System.in);
  double n = s.nextDouble();
  return n;
}

public static String inputString() {
  Scanner s = new Scanner(System.in);
  String n = s.nextLine();
  return n;
}





// Función que comprueba si el número dado es devolviendo "true" o "false" al acabar
public static boolean esCapicua(int x) { // El inverso (el número dado la vuelta) tiene que ser el mismo

  int n = x;
  int inverso = 0;

  String nS = Integer.toString(n); // Convertirlo a cadena de texto para saber su longitud

  for(int i = 0; i < nS.length(); i++) {
    inverso = (inverso * 10) + (n % 10);
    n /= 10;
  }

  //System.out.println("inverso = " + inverso); // console.log(inverso)

  if(x == inverso) {
    return true;
  } else {return false;}

}


// Función que comprueba si el número dado es primo devolviendo "true" o "false" al acabar
public static boolean esPrimo(int x) {

  int n = x;

  for(int i = 2; i < n || n == 1; i++) {
    if(n == 1) { // Si 'n' es igual a 1
      return true;
    } else

    if(n % i != 0) { // Comprobar si no es divisible con algún número
      if(i == n - 1) { // Devolver 'verdadero' en la última iteración. Sin esto, devolvería 'verdadero' la 1ra vez que viese que no es divisible
        return true;
      }
    } else {break;} // No es primo
  }
  return false;

}


// Depende de la función 'esPrimo()'
// Función que localiza el número primo más cercano del número que se le pasa como argumento devolviendo dicho número primo más cercano al acabar
public static int siguientePrimo(int x) {

  int n = x + 1;

  while(!esPrimo(n)) { // Mientras no sea primo aumentar 'n' hasta dar con el siguiente primo
    n++;
  }

  return n;

}


// Función que toma como argumento un número y que devuelve el número de dígitos que tiene
public static int cuentaDigitos(int n) {

  String d = Integer.toString(n); // Almacena el número dado como cadena de texto

  return d.length(); // Longitud de la cadena de texto que equivale al número de digitos del número

}



// Función que toma como argumento un número y que devuelve el número volteado
public static int volteaNumeros(int n) {

  int d = 0; // Variable que almacena el número volteado
  int m = n; // Copia de 'n', el número original

  for(int i = 1; i <= Integer.toString(n).length(); i++) { // Operar hasta alcanzar la cantidad de dígitos del número introducido 'n'
    d = d * 10 + m % 10; // Añadir dígitos a 'd'
    m /= 10; // Reducir 'm' para ir cogiendo los dígitos
  }

  return d; // Número dado la vuelta

}


// Función que toma como argumento un número y un indice y que obtiene el dígito correspondiente del número dado
public static int digitoPorIndice(int n, int index) {

  final int L = Integer.toString(n).length(); // Longitud del número
  //System.out.println("\nconsole.log(Longitud = "+L+")\n");

  int[] digitos = new int[L]; // Array que contendrá los dígitos del número

  for(int i = 0; i < L; i++) {
    digitos[i] = n % 10;
    n /= 10;
    //System.out.println("console.log(digitos["+i+"] = "+digitos[i]+")");
  }

  //System.out.println();

  return digitos[(L - 1) - index];

}



// Función que toma como argumento un número y un digito y que obtiene el indice de la 1ª ocurrencia del dígito del número dado
public static int indicePorDigito(int n, int digito) {

  final int L = Integer.toString(n).length(); // Longitud del número
  //System.out.println("\nconsole.log(Longitud = "+L+")\n");

  int[] digitos = new int[L]; // Array que contendrá los dígitos del número
  int index = -1;

  for(int i = 0; i < L; i++) {
    digitos[(L-1) - i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
    n /= 10;
    if(digitos[i] == digito && index == -1) {
      index = i;
    }
  }


  return index;

}



// Función que toma como argumento un número y la cantidad de dígitos que se desea borrar por la derecha
public static int suprimirDigitosDerecha(int n, int cantidad) {

  final int L = Integer.toString(n).length(); // Longitud del número

  int[] digitos = new int[L]; // Array que contendrá los dígitos del número

  // Pasar los dígitos del número al array
  for(int i = 0; i < L; i++) {
    digitos[(L-1) - i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
    n /= 10;
  }

  // Crear el nuevo número
  int nuevoNumero = 0;
  for(int i = 0; i < L - cantidad; i++) {
    nuevoNumero = nuevoNumero * 10 + digitos[i]; // Introducción de dígitos en 'nuevoNumero' limitando los digitos de los que se compodrá con 'cantidad'
  }


  return nuevoNumero;

}




// Función que toma como argumento un número y la cantidad de dígitos que se desea borrar por la derecha
public static int suprimirDigitosIzquierda(int n, int cantidad) {

  final int L = Integer.toString(n).length(); // Longitud del número

  int[] digitos = new int[L]; // Array que contendrá los dígitos del número

  // Pasar los dígitos del número al array
  for(int i = 0; i < L; i++) {
    digitos[(L-1) - i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
    n /= 10;
  }

  // Crear el nuevo número
  int nuevoNumero = 0;
  for(int i = cantidad; i < L; i++) { // Empezar a añadir números a 'nuevoNumero' desde la 'cantidad' de números establecida de forma que nos saltamos los números del principio al generar el nuevo número
    nuevoNumero = nuevoNumero * 10 + digitos[i]; // Introducción de dígitos en 'nuevoNumero' limitando los digitos de los que se compodrá con 'cantidad'
  }


  return nuevoNumero;

}



// Función que toma como argumento un número y el conjunto de números que se desea añadir a la derecha
public static int anadirDigitosDerecha(int n, int cantidad) {

  final int L = Integer.toString(n).length(); // Longitud del número

  final int CL = Integer.toString(cantidad).length();; // Longitud del número a añadir

  int[] digitos = new int[L + CL]; // Array que contendrá los dígitos del número

  // Pasar los dígitos del número al array
  // [(n) | cantidad]
  for(int i = (L - 1); i >= 0; i--) {
    digitos[i] = n % 10; // Introducción de digitos empezando por la posición de la longitud de 'n'
    n /= 10;
  }

  // Pasar 'cantidad' a la izquierda del array
  // [n | (cantidad)]
  for(int i = ((L + CL) - 1); i >= L; i--) {
    digitos[i] = cantidad % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
    cantidad /= 10;
  }

  // Crear el nuevo número == [n | cantidad]
  int nuevoNumero = 0;
  for(int i = 0; i < L + CL; i++) {
    nuevoNumero = nuevoNumero * 10 + digitos[i];
  }

  return nuevoNumero;

}



// Función que toma como argumento un número y el conjunto de números que se desea añadir a la izquierda
public static int anadirDigitosIzquierda(int n, int cantidad) {

  final int L = Integer.toString(n).length(); // Longitud del número

  final int CL = Integer.toString(cantidad).length();; // Longitud del número a añadir

  int[] digitos = new int[L + CL]; // Array que contendrá los dígitos del número

  // Pasar los dígitos del número al array
  // [cantidad | (n)]
  for(int i = (L + CL) - 1; i >= 0; i--) {
    digitos[i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
    n /= 10;
  }

  // Pasar 'cantidad' a la izquierda del array
  // [(cantidad) | n]
  for(int i = (CL - 1); i >= 0; i--) {
    digitos[i] = cantidad % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
    cantidad /= 10;
  }

  // Crear el nuevo número == [cantidad | n]
  int nuevoNumero = 0;
  for(int i = 0; i < L + CL; i++) {
    nuevoNumero = nuevoNumero * 10 + digitos[i];
  }

  return nuevoNumero;

}



// Función que toma como argumento un número y el valor del inicial y el valor final del intervalo para seleccionar esa porción del número 
public static int porcionNumero(int n, int i1, int i2) {

  final int L = Integer.toString(n).length(); // Longitud del número


  int[] digitos = new int[L]; // Array que contendrá los dígitos del número

  // Pasar los dígitos del número al array
  for(int i = (L - 1); i >= 0; i--) {
    digitos[i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
    n /= 10;
  }

  // Generar el nuevo número
  int nuevoNumero = 0;
  for(int i = i1; i <= i2; i++) {
    nuevoNumero = nuevoNumero * 10 + digitos[i];
  }

  return nuevoNumero;

}



// Función que toma como argumento 2 números y los junta devolviendo un único número
public static int juntaNumeros(int n1, int n2) {

  // Transformar los números en cadenas de texto para poder juntarlos
  String n1S = Integer.toString(n1);
  String n2S = Integer.toString(n2);
  

  // Generar el nuevo número
  String nuevoNumeroString = n1S + n2S;
  int nuevoNumero = Integer.parseInt(nuevoNumeroString);

  return nuevoNumero;

}



// Función que se le pasa un número y devuelve un array que contiene los dígitos del número
public static long[] numeroAArray(long n) {
        
  final int L = Long.toString(n).length();

  long[] array = new long[L];

  // Pasar los dígitos del número al array
  for(int i = 0; i < L; i++) {
      array[(L-1) - i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
      n /= 10;
  }
  
  return array;
}




// Función que toma como argumento un array y lo dibuja en pantalla (para DEBUGGING)
public static void pintaArrayInt(int[] array) {
        
  for(int i = 0; i < array.length; i++) {
      System.out.printf("array[%3d] = %7d;\n" , i, array[i]);
  }

}


// Función que devuelve un array tomando como argumentos el tamaño del array (L), y el valor mínimo (N1) y máximo (N2) del intervalo de los números aleatorios de los que se va a componer
public static int[] generaArrayInt(final int L, int N1, int N2) {
        
  int[] array = new int[L];

  N2 -= N1; // Decrementar 'N2' con 'N1' para compesar el incremento posterior que le hace 'N1'
  for(int i = 0; i < L; i++) {
      array[i] = (int)(Math.random() * (N2 + 1)) + N1; // Ocupar el array de números aleatorios
  }

  return array;
}



// Función a la que se le pasa como parámetro un 'array' y devuelve el valor mínimo contenido en él
public static int minimoArrayInt(int[] array) {

  int minimo = array[0]; // Inicializar 'minimo' con el 1er número del array

  for(int i = 0; i < array.length; i++) {
      if(array[i] < minimo) {
          minimo = array[i];
      }
  }

  return minimo;
}



// Función a la que se le pasa como parámetro un 'array' y devuelve el valor máximo contenido en él
public static int maximoArrayInt(int[] array) {

  int maximo = array[0]; // Inicializar 'maximo' con el 1er número del array

  for(int i = 0; i < array.length; i++) {
      if(array[i] > maximo) {
          maximo = array[i];
      }
  }

  return maximo;
}



// Función que toma como parámetro un array y devuelve la media de los números que contiene
public static int mediaArrayInt(int[] array) {

  int media = 0; // Inicialización de media

  for(int i = 0; i < array.length; i++) { // Sumar a la 'media' los valores del 'array'
      media += array[i];
  }

  media /= array.length; // Dividir a la 'media' la longitud del 'array' para obtener la media de los números

  return media;
}



// Función a la que se le pasa como parametros un 'número' y un 'array' y comprueba si el número se encuentra en el array devolviendo 'true' en caso afirmativo o 'false' en caso contrario
public static boolean estaEnArray(int n, int[] array) {
        
  for(int i = 0; i < array.length; i++) { // Recorrer array
      if(n == array[i]) { // Si el número se encuentra en el array devolver 'true'
          return true;
      }
  }

  return false;
}




// Función que toma como parámetros un número y un array, y devuelve el índice del número en el array, en caso de que el número no existiera en el array devolvería '-1'
public static int indiceEnArray(int n, int[] array) {

  for(int i = 0; i < array.length; i++) {
    if(n == array[i]) {
      return i;
    }
  }

  return -1;
}

// Función que toma como argumento un array y devuelve otro array con los valores volteados de posición
public static int[] volteaArrayInt(int[] array) {

  int[] arrayVolteado = new int[array.length]; // Crear nuevo array donde almacenar los valores del array original volteados

  for(int i = 0; i < array.length; i++) {
  arrayVolteado[i] = array[(array.length-1) - i]; // Introducir al revés los números del array original en 'arrayVolteado' 
  }

  return arrayVolteado;
}


// Función que toma como argumento un número y un array y devuelve un array con los números desplazados a la derecha tantos lugares como se especifique 
public static int[] desplazaDerechaArrayInt(int n, int[] array) {

  if(n == 0) { // Si el indice de desplazamiento es 0 devolver el mismo array
    return array;
  }

  // Crear nuevo array donde almacenar los valores del array original desplazados a la derecha
  int[] arrayDesplazadoDerecha = new int[array.length];

  for(int i = 0, j = array.length - n; i < array.length; i++, j++) {

    if( (j) < 0) { // Si 'j' baja de 0 colocarlo en la posición final
      j = array.length - n;
    }

    if( (j) >= array.length) { // Si 'j' es igual o mayor que la 'longitud del array' colocarlo en la posición 0
      j = 0;
    }

    arrayDesplazadoDerecha[i] = array[j];
  }

  return arrayDesplazadoDerecha;
}



// Función que toma como argumento un número y un array y devuelve un array con los números desplazados a la izquierda tantos lugares como se especifique 
public static int[] desplazaIzquierdaArrayInt(int n, int[] array) {

  // Crear nuevo array donde almacenar los valores del array original desplazados a la derecha
  int[] arrayDesplazadoIzquierda = new int[array.length];

  for(int i = 0, j = 0; i < array.length; i++, j++) {
    if(j + n > array.length - 1) { // Si se pasa resetear 'j'
      j = -n; // j + n = 0 (Indice '0')
    }

    arrayDesplazadoIzquierda[i] = array[j + n];
  }

  return arrayDesplazadoIzquierda;
}


}
