package GUIA2;
import java.util.Scanner;

public class Ejercicio18 {

	public static void imprimirAsteriscos() {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[4];
	    int contador = 0;
	    while (contador < numeros.length) {
	        int numero;
	        do {
	            System.out.print("Ingrese un número entre 1 y 20: ");
	            numero = scanner.nextInt();
	        } while (numero < 1 || numero > 20);
	        numeros[contador] = numero;
	        contador++;
	    }
	    int i = 0;
	    while (i < numeros.length) {
	        System.out.print(numeros[i] + " ");
	        int j = 0;
	        while (j < numeros[i]) {
	            System.out.print("*");
	            j++;
	        }
	        System.out.println();
	        i++;
	    }
	}
	public static void main(String [] main) {
		imprimirAsteriscos();
	}


}
