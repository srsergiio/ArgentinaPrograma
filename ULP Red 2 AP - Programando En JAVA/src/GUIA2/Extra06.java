package GUIA2;


public class Extra06 {
//	Crear un método dentro del cual permita la entrada desde teclado de la altura de N personas y
//	determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de
//	estaturas en general.
	
	public static void contEnanos(int nPersonas) {
		int contEnanos=0;
		int AlturasEnanos=0;
		int AlturasGeneral=0;
		for (int i=0;i< nPersonas;i++) {
			int altuPersona = main.numTeclado();//altura
			contEnanos=altuPersona<=160?contEnanos+1:contEnanos;
			AlturasEnanos=altuPersona<=160?AlturasEnanos+altuPersona:AlturasEnanos;
			AlturasGeneral+=altuPersona;
			
			
		}
		System.out.print("Promedio de Enano :"+AlturasEnanos/contEnanos+
				"\nPromedio de General :"+AlturasGeneral/nPersonas);		
	}
	
	public static void main(String[] args) {
		contEnanos(main.numTeclado());
		
	}

}
