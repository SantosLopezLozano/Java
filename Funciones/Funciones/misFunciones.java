package Funciones;
/**
 *
 * @author Santos López Lozano
 */
public class misFunciones {
  
  /**
   * Con ésta formula se quiere voltear un número
   * @param x es el numero que se quiere voltear
   * @return es el numero que ya se ha volteado
   */
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }

    long volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }
  /**
   * Convierte el Long en Int.
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   */
  public static int voltea(int x) {
    return (int)voltea((long)x);
  }
  /**
   * Si el numero introducido es capicuo es verdadero, si no, es falso
   * @param x número para comprobar si es capicuo
   * @return  verdadero es capicuo falso si no
   */
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }

  /**
   * Pasa a Int el Long del acpicuo anterior
   * @param x número para comprobar si es capicuo
   * @return  verdadero es capicuo falso si no
   */
  public static boolean esCapicua(int x) {
    return esCapicua((long)x);
  }
  /**
   * Si el numero es primo netonces true, si no false
   * @param x número para comprobar si es primp
   * @return  verdadero es primo falso si no
   */
  public static Boolean esPrimo(long n) {
    if (n < 2) {
      return false;
    } else {
      for (long i = n / 2; i >= 2; i--) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }
  /**
   * Pasa a Int el Long del primo anterior
   * @param x número para comprobar si es capicuo
   * @return  verdadero es capicuo falso si no
   */
  public static Boolean esPrimo(int n) {
    return esPrimo((long) n);
  }
  /**
   * Devuelve el primo consecutivo al anterior
   *
   * @param x un número entero
   * @return  el menor primo que es mayor al número que se pasa como parámetro
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {};

    return x;
  }
  /**
   * devuelve la potencia.
   *
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return          potencia calculada
   */
  public static double potencia(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }
  /**
   * Cuenta los dígitos de un número.
   *
   * @param x número al que contar los dígitos
   * @return  número de dígitos que tiene el número
   */
  public static int digitos(long x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }
  /**
   * Pasa a Int el Long de digitos.
   *
   * @param x número a contar
   * @return  número ya contado
   */
  public static int digitos(int x) {
    return digitos((long)x);
  }
  
}
