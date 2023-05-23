package GUIA2;
import java.util.Scanner;

public class Ejercicio13 {
	public static void sumarHastaLimite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor límite positivo: ");
        int limite = scanner.nextInt();
        int suma = 0;
        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            suma += num;
        }
        System.out.println("La suma de los números ingresados superó el límite inicial.");
        scanner.close();
    }
}
