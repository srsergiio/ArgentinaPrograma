package GUIA2;

public class Extra12 {
//	Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0
//	al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
//	0-0-0
//	0-0-1
//	0-0-2
//	0-0-E
//	0-0-4
//	0-1-2
//	0-1-E
//	Crear un método que dé solución a lo propuesto en el enunciado.
	
	public static void contador3Digitos() {
		int cont=0;
		String aux = "";
		while (cont<1000) {
			imprimir(cont+"");
			cont++;
		}
		}

	public static void imprimir(String n) {
		
		if (n.length()<2) {
			System.out.println(buscar_3("0-0-"+n.charAt(0)));
		}else if (n.length()<3) {
			System.out.println(buscar_3("0-"+n.charAt(0)+"-"+n.charAt(1)));
		}else if (n.length()<4) {
			System.out.println(buscar_3(n.charAt(0)+"-"+n.charAt(1)+"-"+n.charAt(2)));
		}
	}
	
	public static String buscar_3(String n) {				
		String aux ="";
		for (int i=0 ;i< n.length();i++) {
			if(n.charAt(i)=='3') {
				aux+='E';
			}else {
				aux+=n.charAt(i);
			}
		}
		return aux;
	}
		
	
	
	public static void main(String [] main) {
		contador3Digitos();
	}
}
