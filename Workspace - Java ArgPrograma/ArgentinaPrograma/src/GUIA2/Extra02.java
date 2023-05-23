package GUIA2;

public class Extra02 {
//	Crear un método dentro del cual tendrá cuatro variables de tipo entero A, B, C y D y asignarle
//	un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B
//	tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
//	los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
	
	
	public static void Intercambio() {
		int a = main.numTeclado();
		int b = main.numTeclado();
		int c = main.numTeclado();
		int d = main.numTeclado();
		int aux = b;
		b=c ;c=a; a=d; d=aux;
		System.out.print("A : "+a+ "\nB : "+b+"\nC : "+c+"\nD : "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intercambio();
	}

}
