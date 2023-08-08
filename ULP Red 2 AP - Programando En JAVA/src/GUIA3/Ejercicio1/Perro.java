package GUIA3.Ejercicio1;

public class Perro {
	
	private String Nombre, Raza;
	private int Edad , Tamanio;
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public int getTamanio() {
		return Tamanio;
	}

	public void setTamanio(int tamanio) {
		Tamanio = tamanio;
	}

	public Perro() {
		
	}
	
	public Perro(String Nombre, String Raza,int Edad , int Tamanio) {
		this.Nombre=Nombre;
		this.Raza=Raza;
		this.Edad=Edad;
		this.Tamanio=Tamanio;
	}

}
