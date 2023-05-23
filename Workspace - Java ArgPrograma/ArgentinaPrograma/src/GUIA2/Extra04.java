package GUIA2;

public class Extra04 {
//	Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente
//	en romano.
	
	public static void numAromano() {
		int num;
		  do{
			 num=main.numTeclado();
		 }while (num>10 ||num<0 );
		 String NUMROMANO = num ==1?" I ":num ==2?" II ":num ==3?" III ":num ==4?" IV ":num ==5?" V ":num ==6?" VI ":num ==7?" VII ":num ==8?" VIII ":num ==9?" IX ":num ==10?" X ":" NO ES UN NUMERO VALIDO";
		 System.out.print("Numero a Romano : "+ NUMROMANO);
		
		
	}
	
	public static void main(String []main) {
		numAromano();
	}
	
}
