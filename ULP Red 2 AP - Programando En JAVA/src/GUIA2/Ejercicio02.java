package GUIA2;
import java.util.Scanner;
public class Ejercicio02 {
//	Escribir un método que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
	public static void Nombre() {
		Scanner scanner = new Scanner(System.in);
	    // Pedir el nombre del usuario y guardarlo en una variable
	    System.out.print("Por favor, introduce tu nombre: ");
	    String nombre = scanner.nextLine();
	    System.out.println("Hola, " + nombre + "! Tu nombre ha sido guardado.");
	}

}
