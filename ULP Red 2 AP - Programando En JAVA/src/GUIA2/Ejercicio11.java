package GUIA2;

public class Ejercicio11 {
	public static void tipoDeBomba(int tipoMotor) {
	  

	    switch(tipoMotor) {
	        case 1:
	            System.out.println("La bomba es una bomba de agua");
	            break;
	        case 2:
	            System.out.println("La bomba es una bomba de gasolina");
	            break;
	        case 3:
	            System.out.println("La bomba es una bomba de hormigón");
	            break;
	        case 4:
	            System.out.println("La bomba es una bomba de pasta alimenticia");
	            break;
	        default:
	            System.out.println("No existe un valor válido para tipo de bomba");
	            break;
	    }
	}

}
