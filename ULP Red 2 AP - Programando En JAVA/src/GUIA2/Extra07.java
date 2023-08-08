package GUIA2;

public class Extra07 {
//	Realice un método que calcule y visualice el valor máximo, el valor mínimo y el promedio de
//	n números (n>0). El valor de n se solicitará al principio del programa y los números serán
//	introducidos por el usuario. Realice dos versiones del método, una usando el bucle “while” y otra
//	con el bucle “do - while”.
	public static void promedioWhile(int n) {
		int max = 0;
		int min = 0;
		int sum=0;
		int aux=n;
		while(n>0) {
			int num =main.numTeclado();
			max = max>num?max:num;
			//variable = (pregunta)?opc1 :opc2;
			min = min<num?min:num;
			sum+=num;
			n--;
		}
		System.out.println("Numero Maximo es : "+max+"\nNumero Minimo es : "+min+"\nPromedio es : "+sum/aux);
	}
	
	public static void promedioDoWhile(int n) {
		int max = 0;
		int min = 0;
		int sum=0;
		int aux=n;
		do {
			int num =main.numTeclado();
			max = max>num?max:num;
			//variable = (pregunta)?opc1 :opc2;
			min = min<num?min:num;
			sum+=num;
			n--;
		} while (n>0);
		System.out.println("Numero Maximo es : "+max+"\nNumero Minimo es : "+min+"\nPromedio es : "+sum/aux);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		promedioWhile(10) ;
//		 promedioDoWhile(5);
	}

}
