package GUIA1;

public class Encuentro1_3 {

	public static void main(String[] args) {
		Producto Cocacola = new Producto();
		Cocacola.setProducto(231, "gaceosa", 700, 999);
		Cocacola.getallProducto();
		      
		System.out.println("\n\n////////////////////////////////////////////////////////////////\n\n");
		
		
		Computadora pcgamer = new Computadora();
		pcgamer.setPlacadeVideo("RTX4090");
		System.out.print(pcgamer.getPlacadeVideo());
		
		System.out.println("\n\n////////////////////////////////////////////////////////////////\n\n");
		
		
		Jugador jugador1 = new Jugador("Juan",140,"Argentina",29);
		System.out.print("nombre : "+jugador1.getNombre()+" Puntos : "+jugador1.puntaje+" Nacionalidad : "+jugador1.nacionalidad+" EDAD : "+jugador1.edad);
		
		
		System.out.println("\n\n////////////////////////////////////////////////////////////////\n\n");
		
		
		Perro perroUNO = new Perro();
		perroUNO.Perro("Olivia","Buldog Francés", 1.2 , 1);
		System.out.println(perroUNO.edad);
		perroUNO.setEdad(3);
		System.out.println(perroUNO.edad);
		
		
		System.out.println("\n\n////////////////////////////////////////////////////////////////\n\n");
		
		Piesa fichaUNO = new Piesa("alfil","a1","blanco");
		System.out.print(fichaUNO.getNombre());
		
	}

}
class Producto {
	  /*
   * En un nuevo proyecto crear una clase de nombre Producto con los atributos
   * código de tipo
   * entero, descripción un String, precio de tipo double y stock de tipo entero;
   * un constructor
   * que permita inicializar todos sus atributos y los métodos get y set. Desde el
   * método main
   * de clase principal del proyecto instanciar un Producto y luego mostrar por
   * consola el estado
   * de todos sus atributos.
   */

  int codigo;
  String descripción;
  double precio;
  int stock;
  
  public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


  public Producto() {
      codigo = 0;
      descripción = "";
      precio = 0;
      stock = 0;
  }

  public void setProducto(int Codigo, String Descripción, double Precio, int Stock) {
      codigo = Codigo;
      descripción = Descripción;
      precio = Precio;
      stock = Stock;

  }

  public void getallProducto() {
      System.out.println(codigo + " " + descripción + " " + precio + " " + stock);
  }


}
class Computadora {
	
	public String getProcesador() {
		return Procesador;
	}
	public void setProcesador(String procesador) {
		Procesador = procesador;
	}
	public String getPlacaBace() {
		return PlacaBace;
	}
	public void setPlacaBace(String placaBace) {
		PlacaBace = placaBace;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	public String getPlacadeVideo() {
		return PlacadeVideo;
	}
	public void setPlacadeVideo(String placadeVideo) {
		PlacadeVideo = placadeVideo;
	}
	public String getFuente() {
		return fuente;
	}
	public void setFuente(String fuente) {
		this.fuente = fuente;
	}
	public String getGabinete() {
		return Gabinete;
	}
	public void setGabinete(String gabinete) {
		Gabinete = gabinete;
	}
	public String getPerifericos() {
		return Perifericos;
	}
	public void setPerifericos(String perifericos) {
		Perifericos = perifericos;
	}
	public String getMonitor() {
		return Monitor;
	}
	public void setMonitor(String monitor) {
		Monitor = monitor;
	}

	private String Procesador;
	private String PlacaBace;
	private String Ram;
	private String PlacadeVideo;
	private String fuente;
	private String Gabinete;
	
	private String Perifericos;
	private String Monitor;
	
	public Computadora() {
		Procesador="";
		PlacaBace="";
		Ram="";
		PlacadeVideo="";
		fuente="";
		Gabinete="";
		Perifericos="";
		Monitor="";
	}
	
	public Computadora(String pro ,String pb,String r,String pv,String f,String g,String p,String m) {
		Procesador=pro;
		PlacaBace=pb;
		Ram=r;
		PlacadeVideo=pv;
		fuente=f;
		Gabinete=g;
		Perifericos=p;
		Monitor=m;
	}
	


}
class Jugador {
	
	
	/*En un nuevo proyecto crear una clase de nombre Jugador con los atributos: nombre,
	puntaje, nacionalidad y edad. Luego un constructor vació y un constructor que inicialice
	todos sus atributos; agregue además los respectivos métodos getter y setter. Desde el
	método main de la clase principal del proyecto crear un Jugador utilizando el constructor
	vacío; luego, a dicho jugador darle de nombre “Juan”, con 140 puntos, de nacionalidad
	“Argentino” y una edad de 29 años; por último mostrar por consola el estado de cada uno
	de sus atributos.*/
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	String nombre;
	int puntaje;
	String nacionalidad;
	int edad;
	

	public Jugador(String nombre,int puntaje,String nacionalidad,int edad) { //contru inicializador
		 this.nombre=nombre;
		 this.puntaje=puntaje;
		 this.nacionalidad=nacionalidad;
		 this.edad=edad;
		
	}
	
}
class Perro {

	
	/*En nuevo proyecto crear una clase de nombre Perro, cuyos atributos son: nombre, raza,
	peso y edad. La clase tendrás un constructor que permita inicializar todos sus atributos y
	los métodos getter y setter. Además agregaremos un método adicional de nombre
	mostrarInfo que visualizará por consola todos los datos de este animal. Por último, desde
	el método main de la clase principal del proyecto usted creará un Perro de nombre “Olivia”
	de raza “Buldog Francés” que pese 1.2Kg con 1 año de edad; en la línea siguiente invocará
	el método mostrarInfo de la instancia creada anteriormente.*/
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	String nombre;
	String raza;
	double peso;
	int edad;
	
	public void Perro() {
	}
	
	public void Perro(String n,String r, double p, int e) {
		nombre=n;
		raza=r;
		peso=p;
		edad=e;
		
	}
	
}


class Piesa {

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getString() {
		return posicion;
	}
	public void setposicion(String string) {
		posicion = string;
	}

	private String nombre;
	private String posicion;
	private String color;
	public  Piesa() {

	}
	public  Piesa(String n,String p,String c) {
		 nombre = n;
		 posicion = p;
		 color=c;
		
	}
}
