package GUIA2;

public class Extra08 {
//	Escriba un método que lea números enteros. Si el número es múltiplo de cinco debe detener la
//	lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de
//	números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
//	Nota: recordar el uso de la sentencia break.
	
	
	
	public static void contPar_InPar() {
		int cont=0;
		int contPar=0;
		int contInPar=0;
		while (true) {
			int num = main.numTeclado();
			if(num%5==0) break;
			cont=num>=0?cont+1:cont;
			contPar=num%2==0?contPar=contPar+1:contPar;
			contInPar=num%2!=0?contInPar=contInPar+1:contInPar;
		}
		System.out.println("Cantidad de numeros : "+cont+"\nNumeros Pares : "+contPar+"\nNumeros Impares : "+contInPar);
	}
			
	public static void main(String []main) {
		contPar_InPar();
	}
}
