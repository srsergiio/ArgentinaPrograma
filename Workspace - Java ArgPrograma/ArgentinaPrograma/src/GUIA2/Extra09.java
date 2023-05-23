package GUIA2;

public class Extra09 {
//	Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
//	realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el
//	dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
//	y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
//	50 – 13 = 37 una resta realizada
//	37 – 13 = 24 dos restas realizadas
//	24 – 13 = 11 tres restas realizadas
//	Crear un método con el algoritmo necesario para dar solución a lo propuesto.
	 
	public static void simulacionDivicion(int divisor, int dividendo) {
		
		while (true) {
			if(divisor<dividendo) {
				break;
			}
			divisor=divisor-dividendo;
		}
	System.out.println("resultado : "+divisor );
	}
	
	public static void main(String []main) {
		simulacionDivicion(50, 13);
		
	}
}
