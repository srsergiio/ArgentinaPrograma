package GUIA3;

public class Persona {
	String Nombre, Apellido; 
	int Edad, Documento ;
	Perro perro;      
	
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		this.Edad = edad;
	}
	public int getDocumento() {
		return Documento;
	}
	public void setDocumento(int documento) {
		this.Documento = documento;
	}

	
	public Persona(String nombre, String apellido, int edad, int documento ) {
		this.Nombre=nombre;
		this.Apellido=apellido;
		this.Edad=edad;
		this.Documento=documento;
		this.perro= new Perro();
	}
	
	public void adoptarPerro(String nombre, String raza ,int edad,int  tamanio){
		 this.perro.setNombre(nombre);
		 this.perro.setRaza(raza);
		 this.perro.setEdad(edad);
		 this.perro.setTamanio(tamanio);
	}
	
	public void  perroMasGrande(Persona p2){
		String mensajeString = this.perro.getEdad()>p2.perro.getEdad()?"El perro 1 es mas grande":"El perro 2 es mas grande";
		System.out.println(mensajeString);
	}

}
