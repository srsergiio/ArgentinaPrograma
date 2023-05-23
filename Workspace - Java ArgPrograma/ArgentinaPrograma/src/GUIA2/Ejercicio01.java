package GUIA2;

import java.util.Scanner;

public class Ejercicio01 {
//	Escribir un método que pida dos números enteros por teclado y calcule la suma de los dos
//	mostrando por consola la suma de los mismos.
	
	public static void suma() {
	Scanner input = new Scanner(System.in);
	System.out.print("Introduce el primer número entero: ");
	int num1 = input.nextInt();
	System.out.print("Introduce el segundo número entero: ");
	int num2 = input.nextInt();
	int resultado = num1 + num2;
	System.out.println("La suma de los dos números es: " + resultado);
	//input.close();
	}

}
