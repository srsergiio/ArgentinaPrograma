package GUIA2;
import java.util.Scanner;

public class Ejercicio05 {
 public static void DobleTripleCuadrada() {
	 Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduce un número entero: ");
	    int numero = scanner.nextInt();

	    // Mostramos el doble, el triple y la raíz cuadrada del número
	    System.out.println("El doble de " + numero + " es " + (numero * 2));
	    System.out.println("El triple de " + numero + " es " + (numero * 3));
	    System.out.println("La raíz cuadrada de " + numero + " es " + Math.sqrt(numero));
	  }
 }

