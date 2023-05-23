package GUIA2;

import java.util.Scanner;

public class Extra13 {
//	Crear un método que dibuje una escalera de números, donde cada línea de números comience
//	en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.
//	Ejemplo: si se ingresa el número 3:
//	1
//	12
//	123
	
	public static void escalera() {
		System.out.print(" Ingrese un Numero mayor a 0 : ");
		Scanner numeroScanner = new Scanner(System.in);
		int numero = numeroScanner.nextInt();
		for(int i =0;i<=numero;i++) {
			for(int j =0;j<i;j++) {
				System.out.print(j+1 +" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escalera();
	}

}
