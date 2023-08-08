package GUIA2;



public class Extra01 {
//	Crear un método que dado un tiempo en minutos leído desde teclado, calcular su equivalente en
//	días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//	equivalente: 1 día, 2 horas.
	
	public static void calcularMinutos() {
		int numero =main.numTeclado();
		int Dia =numero/(24*60);
		int hora =0 ;
		if(numero>(24*60)) {
			hora = (numero -( Dia*60*24))/60 ;
			System.out.println("la cantidad de minutos ingresados representan \n DIA : "+Dia+"\n Hora : "+hora);
		}else {
			hora = numero /60 ;
		System.out.println("la cantidad de minutos ingresados representan \n Hora : "+hora);}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcularMinutos();
	}

}
