package GUIA2;

public class Ejercicio17 {

	public static void dibujarCuadrado(int n) {
		int ejeY = 0;
	
	    while ( ejeY < n ) {
	    	int ejeX = 0;
	        while ( ejeX < n ) {
	            if (ejeY == 0 || ejeY == n - 1) {
	                System.out.print("* ");
	            } else {
	                if (ejeX == 0 || ejeX == n - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            ejeX++;}
	        System.out.println();
	        ejeY++; }
	}

public static void main(String[]main) {
	dibujarCuadrado(6);
}
}
