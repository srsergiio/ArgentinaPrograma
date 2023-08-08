package GUIA2;
import java.util.Scanner;

public class Ejercicio03 {

	public static void MayuMinu() {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		    System.out.print("Introduce una frase: ");
		    String frase = scanner.nextLine();
		    System.out.println("La frase en mayúsculas es: " + frase.toUpperCase());
		    System.out.println("La frase en minúsculas es: " + frase.toLowerCase());
	}

}
