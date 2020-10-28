/**
* Por Santos López Lozano
*/
public class Ejercicio10 {
  public static void main(String[] args) {
    
    String horoscopo = "";
    String mes;

    System.out.print("su mes de nacimiento: ");
    mes = (System.console().readLine().toLowerCase());
    
    System.out.print("su día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
      case "enero":
        if (dia < 21) {
          horoscopo = "capricornio";
        } else {
          horoscopo = "acuario";
        }
        break;
      case "febrero":
        if (dia < 20) {
          horoscopo = "acuario";
        } else {
          horoscopo = "piscis";
        }
        break;
      case "marzo":
        if (dia < 21) {
          horoscopo = "piscis";
        } else {
          horoscopo = "aries";
        }
        break;
      case "abril":
        if (dia < 21) {
          horoscopo = "aries";
        } else {
          horoscopo = "tauro";
        }
        break;
      case "mayo":
        if (dia < 20) {
          horoscopo = "tauro";
        } else {
          horoscopo = "geminis";
        }
        break;
        case "junio":
        if (dia < 22) {
          horoscopo = "geminis";
        } else {
          horoscopo = "cancer";
        }
        break;
        case "julio":
        if (dia < 22) {
          horoscopo = "cancer";
        } else {
          horoscopo = "leo";
        }
        break;
        case "agosto":
        if (dia < 24) {
          horoscopo = "leo";
        } else {
          horoscopo = "virgo";
        }
        break;
        case "septiembre":
        if (dia < 23) {
          horoscopo = "virgo";
        } else {
          horoscopo = "libra";
        }
        break;
        case "octubre":
        if (dia < 23) {
          horoscopo = "libra";
        } else {
          horoscopo = "escorpio";
        }
        break;
        case "noviembre":
        if (dia < 23) {
          horoscopo = "escorpio";
        } else {
          horoscopo = "sagitario";
        }
        break;
        case "diciembre":
        if (dia < 21) {
          horoscopo = "sagitario";
        } else {
          horoscopo = "capricornio";
        }
        break;
      default:
    }

    System.out.print("Su horóscopo es " + horoscopo);

  }
}

