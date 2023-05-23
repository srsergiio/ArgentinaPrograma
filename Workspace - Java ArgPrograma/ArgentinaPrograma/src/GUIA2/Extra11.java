package GUIA2;

public class Extra11 {
//	Escribir un método que lea un número entero y devuelva el número de dígitos que componen
//	ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
//	Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar
//	que las variables de tipo entero truncan los números o resultados.

	
	public static void longitudNumero(int n) {
		int cont=1;
		while(true){
			if(n<10) break;
			n=n/10;
			cont++;
		}
		System.out.print(cont);
	}
		
	public static void main(String[] main) {
		longitudNumero(1);
	}

}
