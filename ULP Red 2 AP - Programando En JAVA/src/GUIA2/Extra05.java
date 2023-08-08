package GUIA2;



public class Extra05 {
//	Una obra social tiene tres clases de socios:
//		 Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos
//		los tipos de tratamientos.
//		 Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los
//		mismos tratamientos que los socios del tipo A.
//		 Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//		tratamientos.
//		Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
//		el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho
//		socio. Crear un método con el algoritmo para dar solución a lo propuesto.
public static void costoTratamiento() {
	String socio = main.txtTeclado();
	int importe = main.numTeclado();
	importe =  (int) (socio.equals("a")?importe*0.50:socio.equals("b")?importe*0.65:importe);
	System.out.println("Costo del tratamiento es : "+ importe);
}

	public static void main(String []main) {
		costoTratamiento();
	}
}
