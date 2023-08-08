package GUIA2;
import GUIA2.*;
import java.util.Scanner;

public class main {
	public static String txtTeclado() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Ingrese una frase: ");
	    String frase = scanner.nextLine();
	    
	    return frase;
	  }
	public static int numTeclado() {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce numero entero: ");
		int num1 = input.nextInt();
		
	    return num1;
	  }
	public static void Guia2() {
		Scanner scanner = new Scanner(System.in);
	    int opcion;
	    do {
	        System.out.println("Seleccione el número del ejercicio que desea ejecutar (1-18), o 0 para salir:");
	        opcion = scanner.nextInt();
	        switch (opcion) {
	            case 0:
	                System.out.println("Ha salido del programa.");
	                break;
	            case 1:
	                Ejercicio01.suma();
	                break;
	            case 2:
	                Ejercicio02.Nombre();
	                break;
	            case 3:
	                Ejercicio03.MayuMinu();
	                break;
	            case 4:
	                Ejercicio04.caseFahrenheit(numTeclado());
	                break;
	            case 5:
	                Ejercicio05.DobleTripleCuadrada();
	                break;
	            case 6:
	                Ejercicio06.determinarMayor(numTeclado(),numTeclado());
	                break;
	            case 7:
	                Ejercicio07.determinarParImpar(numTeclado());
	                break;
	            case 8:
	                Ejercicio08.verificarFrase(txtTeclado());
	                break;
	            case 9:
	                Ejercicio09.verificarPalabra(txtTeclado());
	                break;
	            case 10:
	                Ejercicio10.verificarPrimeraLetra(txtTeclado());
	                break;
	            case 11:
	                Ejercicio11.tipoDeBomba(numTeclado());
	                break;
	            case 12:
	                Ejercicio12.validarNota();
	                break;
	            case 13:
	                Ejercicio13.sumarHastaLimite();
	                break;
	            case 14:
	                Ejercicio14.main1();
	                break;
	            case 15:
	                Ejercicio15.sumarNumeros();
	                break;
	            case 16:
	                Ejercicio16.dispositivoRS232();
	                break;
	            case 17:
	                Ejercicio17.dibujarCuadrado(5);
	                break;
	            case 18:
	                Ejercicio18.imprimirAsteriscos();
	                break;
	            default:
	                System.out.println("Opción inválida.");
	                break;
	        }
	    } while (opcion != 0);
	}
	public static void main(String[] args) {
		
		// Guia2();
	
		//Extra01.calcularMinutos();
		//Extra02.Intercambio();
		//Extra03.esVocal();
		//Extra04.numAromano();
		//Extra05.costoTratamiento();
		//Extra06.contEnanos(main.numTeclado());
		//Extra07.promedioWhile(10);
		//Extra08.contPar_InPar();
		//Extra09.simulacionDivicion(50, 13);
		//Extra10.adivinaNum();
		//Extra11.longitudNumero(12345);
		//Extra12
		//Extra13
		
		char letra = 'a';
		System.out.print(letra+2+"");
		
	}
}
