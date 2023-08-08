package GUIA2;

public class Extra03 {
//	Elaborar un método en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso
//	contrario mostrar un mensaje.
	
	public static void esVocal() {
		char Str = main.txtTeclado().toLowerCase().charAt(0);
		String msj1="es vocal";
		String msjString = Str == 'a'? msj1:Str == 'e'?msj1:Str == 'i'?msj1: Str== 'o'?msj1:Str == 'u'?msj1:"no es vocal";
		System.out.print(msjString);
	}
	public static void main(String[] args) {
		
		esVocal();	
	}

}
