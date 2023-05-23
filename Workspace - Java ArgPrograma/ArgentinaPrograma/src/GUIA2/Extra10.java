package GUIA2;

public class Extra10 {
//	Realice un método para que el usuario adivine el resultado de una multiplicación entre dos
//	números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta
//	es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su
//	respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función
//	Math.random() de Java.
	
	public static void adivinaNum() {
		int random;
		int num;
		while(true) {
			 random = (int) (Math.random()*10)+1;
			 num = main.numTeclado();
			 System.out.println("numero alazar : "+random+"\nNumero elegido : "+num+"\n");
			 if(random==num) break;
		}
		System.out.println("Ganaste");
	}
	public static void main(String[]main) {
		adivinaNum();
	}
}
