package Ejercicio2;
import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		String[] opcionesInicio = {
			"1. Anda con la bicicleta"
			,"2. Haz el caballito con la biclicleta"
			,"3. Anda con el coche"
			,"4. Quema rueda con el coche"
			,"5. Ver Kilometraje de la bicicleta"
			,"6. Ver Kilometraje del coche"
			,"7. Ver Kilometraje del total"
			,"8. Salir"
			,"\nElige una opción (1-8): "
		};

		String menuInicio = Do.color( true, "green", "", menu("Vehiculos", opcionesInicio) );

		// Coche de 1500 cm cúbicos
		Coche cochePrueba = new Coche(1500);
		// Bicicleta con 10 piñones
		Bicicleta bicicletaPrueba = new Bicicleta(10);


		// Variable de la opción a elegir del usuario
		char seleccion = 0;

		// Hasta que no seleccione la opción 8 para salir, se sigue mostrando el menu en cada selección
		while(seleccion != 8) {

			// Dibujar menu
			Do.print(menuInicio);

			// Entrada de datos para la elección de una de las opciones
			seleccion = s.nextLine().charAt(0);

			Do.println();

			switch(seleccion) {

				case 1:
					Do.println("¿Cuántos km quiere recorrer con la bicicleta?");
					bicicletaPrueba.recorre( Do.inputInt() );
					break;

				case 2:
					bicicletaPrueba.hazCaballito();
					break;

				case 3:
				Do.println("¿Cuántos km quiere recorrer con el coche?");
				cochePrueba.recorre( Do.inputInt() );
				break;

				case 4:
					cochePrueba.quemaRueda();
					break;

				case 5:
					Do.println("La bicicleta ha reccorido " + bicicletaPrueba.getKilometrosRecorridos() + "km" );
					break;

				case 6:
					Do.println( "El coche ha recorrido " + cochePrueba.getKilometrosRecorridos() + "km" );
					break;

				case 7:
					Do.println( "El kilometraje total es: " + Vehiculo.getKilometrosTotales() + "km" );
					break;

			} // Fin switch(seleccion)

	  } // Fin while(seleccion != 8)
		
			
	} // Fin main(String[] args)

	// Función que toma como argumento un 'titulo' y un 'array de opciones'
	// de tipo String y devuelve el 'menu' que se puede almacenar en una variable
	public static String menu(String titulo, String[] opciones) {

		String menu;

		menu = titulo.toUpperCase() + "\n";

		// Subrayado del titulo
		for(int i = 1; i <= titulo.length(); i++) {
			menu = menu + "=";
		}
		menu = menu + "\n";

		menu = menu + "\n";

		// Dibujar las opciones contenidas en el array
		for(int i = 0; i < opciones.length; i++) {
			menu = menu + opciones[i] + (i != opciones.length - 1 ? "\n" : ""); // La última opción no recibe salto de linea
		}

		return menu;

	}

}
