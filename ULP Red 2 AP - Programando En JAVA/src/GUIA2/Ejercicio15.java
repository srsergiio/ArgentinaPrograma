package GUIA2;
import java.util.Scanner;

public class Ejercicio15 {
	 public static void sumarNumeros() {
	        Scanner sc = new Scanner(System.in);
	        int contador = 0;
	        int suma = 0;
	        int numero;
	        
	        while (contador < 20) {
	            System.out.print("Ingrese un número: ");
	            numero = sc.nextInt();
	            
	            if (numero == 0) {
	                System.out.println("Se capturó el número cero");
	                break;
	            } else if (numero > 0) {
	                suma += numero;
	            }
	            
	            contador++;
	        }
	        
	        System.out.println("La suma de los números positivos ingresados es: " + suma);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumarNumeros();
	}

}

