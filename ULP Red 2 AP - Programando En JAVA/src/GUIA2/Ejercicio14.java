package GUIA2;
import java.util.Scanner;
public class Ejercicio14 {

	public static int obtenerNumero(Scanner sc, String mensaje) {
        int numero;
        do {
            System.out.print(mensaje);
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("El número debe ser positivo");
            }
        } while (numero < 0);
        return numero;
    }
	public static void main1() {
	
	Scanner sc = new Scanner(System.in);
    int opcion;
    int num1, num2;
    boolean salir = false;

    while (!salir) {
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Elija opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                num1 = obtenerNumero(sc, "Ingrese el primer número: ");
                num2 = obtenerNumero(sc, "Ingrese el segundo número: ");
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2:
                num1 = obtenerNumero(sc, "Ingrese el primer número: ");
                num2 = obtenerNumero(sc, "Ingrese el segundo número: ");
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case 3:
                num1 = obtenerNumero(sc, "Ingrese el primer número: ");
                num2 = obtenerNumero(sc, "Ingrese el segundo número: ");
                System.out.println("El producto es: " + (num1 * num2));
                break;
            case 4:
                num1 = obtenerNumero(sc, "Ingrese el primer número: ");
                num2 = obtenerNumero(sc, "Ingrese el segundo número: ");
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    System.out.println("La división es: " + ((double) num1 / num2));
                }
                break;
            case 5:
                System.out.print("¿Está seguro que desea salir (S/N)? ");
                sc.nextLine(); // Consumir el salto de línea después de la opción numérica
                String respuesta = sc.nextLine().toUpperCase();
                if (respuesta.equals("S")) {
                    salir = true;
                }
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        System.out.println(); // Imprimir línea en blanco para separar los menús
    }
    System.out.println("¡Hasta luego!");}

}
