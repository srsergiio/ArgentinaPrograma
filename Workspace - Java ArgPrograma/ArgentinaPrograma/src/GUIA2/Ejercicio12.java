package GUIA2;
import java.util.Scanner;

public class Ejercicio12 {
	 public static void validarNota() {
	        Scanner scanner = new Scanner(System.in);
	        double nota; // Inicializar la nota fuera del rango permitido
	        do {
	            System.out.print("Ingrese una nota entre 0 y 10: ");
	            nota = scanner.nextDouble();
	            if (nota < 0 || nota > 10) {
	                System.out.println("La nota ingresada no es válida. Intente nuevamente.");
	            }
	        }while (nota < 0 || nota > 10);
	        System.out.println("La nota ingresada es: " + nota);
	        scanner.close();
	    }
	 
	 public static void main(String [] main) {
		 validarNota();
	 }
}
