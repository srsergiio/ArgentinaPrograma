package GUIA2;
import java.util.Scanner;

public class Ejercicio16 {

	public static void dispositivoRS232() {
	    Scanner sc = new Scanner(System.in);
	    int correctas = 0, incorrectas = 0;
	    String entrada;

	    do {
	        System.out.print("Ingrese una cadena: ");
	        entrada = sc.nextLine();

	        if (entrada.equals("&&&&&")) {
	            break;
	        } else if (entrada.length() == 5 && entrada.charAt(0) == 'X' && entrada.charAt(4) == 'O') {
	            correctas++;
	        } else {
	            incorrectas++;
	        }
	    } while (true);

	    System.out.println("Se recibieron " + correctas + " cadenas correctas y " + incorrectas + " cadenas incorrectas.");
	}


}
