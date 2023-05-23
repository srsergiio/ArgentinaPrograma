package GUIA1;

public class Encuentro4_10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Numero*/
		Numero num = new Numero(2);
		System.out.println("numero 2  es multiplo de 2 : "+num.esMultiploDe(2));
		System.out.println("numero 2  es multiplo de 8 : "+num.esMultiploDe(7));
		System.out.println("\n\n//////////////////////////////////Cuadrilatero//////////////////////////////\n\n");
		Cuadrilatero cuaUno= new Cuadrilatero(70,50);
		System.out.println("\n a) largo : "+cuaUno.getLargo() +" Alto :" +cuaUno.getAlto() 
				+" \n b) su perimetro : "+cuaUno.calcularPerimetro()
				+" \n c) su superficie :"+cuaUno.calcularArea()+" \n d) si es un cuadrado o no : "+cuaUno.esUnCuadrado());
		cuaUno.setAlto(70);
		System.out.println("\n e) largo : "+cuaUno.getLargo() +" Alto :" +cuaUno.getAlto()  
				+"\n es un cuadrado :"+cuaUno.esUnCuadrado() );
		/*circuloUno*/		
		Circulo circuloUno = new Circulo(5.75);
		System.out.println("Area de un ciruculo : de radio "+circuloUno.getRadio()+" es igual "+circuloUno.calcularArea());
		System.out.println("Perimetro de un ciruculo : de radio "+circuloUno.getRadio()+" es igual "+circuloUno.calcularPerímetro());
		System.out.println("\n\n/////////////////////////////ClASS CONVERSOR///////////////////////////////////\n\n");
			 System.out.println("500 USD a PESOS = "+Conversor.convertirAPesos(500));
			 System.out.println("25700 PESOS a USD = "+Conversor.convertirADolar(25700));
		System.out.println("\n\n////////////////////////////////////////////////////////////////\n\n");
		/*
		 * Utilizando los métodos estáticos de Utilitario: 
		 * a) Dibujar un cuadrado de 5 elementos. 
		 * b) Mostrar el mayor entre (20,75 y 40) 
		 * c) Mostrar el nombre del día 5.
		 */
		Utilitario.dibujaCuadrado(5);
		System.out.println(Utilitario.elMayorEs(20, 75, 40) );
		Utilitario.elDiaEs(5);
		
		System.out.println("\n\n////////////////////////////////////////////////////////////////\n\n");
		/*
		 * a) Crear un objeto Triángulo válido. Luego utilizando sus métodos: 
		 * b) Mostrar por consola que tipo de triángulo es. 
		 * c) Crear un objeto Triángulo inválido.Luego utilizando sus métodos: 
		 * d) Mostrar por consola que tipo de triangulo es.
		 */
		Triangulo t1 = new Triangulo(2,2,2);
		System.out.println(t1.tipoTriangulo());
		Triangulo t2 = new Triangulo(0,2,2);
		System.out.println(t2.tipoTriangulo());
		
		System.out.println("\n\nRobot////////////////////////////////////////////////////////////////\n\n");
		/*
		 * Luego desde la clase principal del proyecto (la que contiene el método main)
		 * se pide: a) Crear un objeto Robot de nombre “Tito” Luego utilizando sus
		 * métodos: b) Hacerlo avanzar de a un paso hasta que se quede sin batería.
		 */
		Robot RBOT = new Robot("Tito");
		while(!RBOT.bateriaVacia()) {
			RBOT.avanzar(1);
		}
			
		System.out.println("\n\nFecha/////////////////////////////////////////////////////////\n\n");
		
		Fecha f1 = new Fecha(21,03,1995);
		Fecha f2 = new Fecha(21,03,2023);
		System.out.println(f1.esBisiesto());
		System.out.println(f1.calcularAños(f2));
		System.out.println(f2.calcularAños(f1));
		
		System.out.println("\n\n////////////////////////////////////////////////////////////////\n\n");
		 	Pensador pensador = new Pensador(3915);
		    System.out.println("Invertido: " + pensador.invertir());
		    System.out.println("Par anterior: " + pensador.parAntes());
		    System.out.println("Par posterior: " + pensador.parPosterior());
		    System.out.println("Primer dígito: " + pensador.primerDigito());
		    System.out.println("Último dígito: " + pensador.ultimoDigito());
		
		
		
	}
}
class Numero {
	private int numero ;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Numero() {
		
	}
	
	public Numero(int num) {
		this.numero=num;
	}
	
	public boolean esPar(int Numero) {
		return Numero%2==0;
	}
	
	public boolean esPositivo(int Numero) {
		return Numero>0;
	}
	
	public boolean esMultiploDe(int Numero) {
	boolean  resultado =false;
		if (this.getNumero()<=Numero) {
			for (int i=1 ;i<Numero;i++) {
				resultado= this.getNumero()*i==Numero;
				if (resultado==true)break;
				
			}
		}
		
		return resultado;
	}

}


class Cuadrilatero {
	private double largo ,alto ;
	
	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public Cuadrilatero() {
		
	}
	
	public Cuadrilatero(double largo ,double alto) {
		this.largo = largo;
		this.alto = alto;
		
	}
	
	public double	calcularPerimetro(){
		return this.getLargo() *this.getLargo()*2;
	}
	
	public double calcularArea() {
		return this.getLargo() *this.getLargo();
	}
	
	public Boolean esUnCuadrado() {
		return this.getLargo() ==this.getAlto();
	}
	
}

 class Circulo{
	
	private double pi= Math.PI;
	private double radio;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo() {
		
	}
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	public  double calcularArea() {
		return this.pi*Math.pow(this.getRadio(), 2);
	}
	
	public double  calcularPerímetro(){
		return 2*this.pi *this.getRadio();
	}
	
}
 
 class Conversor{
	 
		/*
		 * 4) En un nuevo proyecto, crear una clase de nombre Conversor con los
		 * siguientes métodos estáticos:  convertirAPesos(): recibe un valor en dólares
		 * y retorna convertido a pesos argentinos.  convertirADolar(): recibe un valor
		 * en pesos argentinos y retorna convertido a dólar. Luego desde la clase
		 * principal del proyecto (la que contiene el método main) se pide: Utilizando
		 * los métodos estáticos de la clase Conversor. a) Convertir 500 dólares a pesos
		 * y mostrar por consola lo convertido. b) Convertir 25700 pesos a dólares y
		 * mostrar por consola lo convertido.
		 */
	 
	 public static  double convertirAPesos( double dolar) {
		 return dolar*390;
	 }
	 
	 public static  double convertirADolar( double Pesos) {
		 return Pesos/390;
	 }
 }
 
 class Utilitario{
	 
		/*
		 * En un nuevo proyecto, crear una clase de nombre Utilitario con una serie de
		 * métodos estáticos:  dibujaCuadrado(): Este método recibe un número entero N,
		 * y dibujará un cuadrado de N elementos por lado utilizando el carácter “*”.
		 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
		 * siguiente:
		 * 
		 * * * * * * * * *
		 * 
		 *  elMayorEs(): Este método recibe 3 números enteros y mostrará por consola
		 * cual es el mayor. En caso de ser iguales lo deberá informar.  elDiaEs(): Se
		 * espera que este método reciba un numero entero entre 1 y 7 que corresponderá
		 * a un día de la semana, retornando el nombre que le corresponda, por ejemplo:
		 * 1 Lunes, 2Martes, 3Miércoles, 4Jueves, 5Viernes, 6Sábado, 7 Domingo.
		 * Si recibe un valor distinto retornará “No existe ese día!!!”. Luego desde la
		 * clase principal del proyecto (la que contiene el método main) se pide:
		 * 
		 * Utilizando los métodos estáticos de Utilitario: a) Dibujar un cuadrado de 5
		 * elementos. b) Mostrar el mayor entre (20,75 y 40) c) Mostrar el nombre del
		 * día 5.
		 */
	 
	 public static void dibujaCuadrado(int tamano){
		 for (int y=0;y<tamano;y++) {
			 for (int x=0;x<tamano;x++) {
				 if(!((y<tamano-1 && y>0) && (x<tamano-1 && x>0)))  
					 System.out.print("*") ;
				 else {
					 System.out.print(" ") ;
					 } 
			 }
			 System.out.println(" ");
			 
		 }
			 
	}
	 
	 public static int elMayorEs(int numeroUno,int numeroDos,int numeroTres) {
		  int NumeroMayor = (numeroUno>=numeroDos && numeroUno>=numeroTres)? numeroUno:(numeroDos>=numeroUno && numeroDos>=numeroTres)? numeroDos:numeroTres ;
		  return NumeroMayor;
		 }
	 
	 
	 public static void elDiaEs(int dia) {

		 System.out.println((dia==1)? "Lunes":(dia==2)? "Martes":(dia==3)? "Miercoles":(dia==4)? "Jueves":(dia==5)? "Viernes":(dia==6)? "Sabado":"Domingo");
	 }
	 
		
 }
 
 class Triangulo{
	 
		/*
		 * 6) En un nuevo proyecto, crear una clase de nombre Triangulo con los
		 * atributos: lado1, lado2, lado3; un constructor que permita inicializar sus
		 * atributos; los métodos getter y setter; y los siguientes métodos adicionales:
		 * 
		 *  esUnTriangulo(): Sabiendo que la regla principal que da origen al triángulo
		 * tiene que ver con la longitud de sus lados. Esta plantea que la suma de dos
		 * de sus lados debe ser mayor a la longitud del tercer lado. Por lo tanto si
		 * los valores de los lados de este triángulo cumplen con la regla este método
		 * retornará true caso contrario false. 
		 *  tipoTriangulo(): Si es un triángulo y tiene sus tres lados iguales, este método retornará equilátero; 
		 * si sus tres
		 * lados son distintos, retornará “escaleno”; 
		 * caso contrario, es decir, si sólo
		 * dos de sus lados son iguales, retornará “isósceles”; 
		 * en el caso de que no sea
		 * un triángulo, retornará “Con sus lados no se puede representar un
		 * triángulo!!!” Luego desde la clase principal del proyecto (la que contiene el
		 * método main) se pide: 
		 * 
		 * a) Crear un objeto Triángulo válido. Luego utilizando sus métodos:
		 * b) Mostrar por consola que tipo de triángulo es. 
		 * c) Crear un objeto Triángulo inválido.Luego utilizando sus métodos:
		 * d) Mostrar por consola que tipo de triangulo es.
		 */
	 private int lado1,lado2,lado3;
	 
	public Triangulo(int lado1 ,int lado2,int lado3) {
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	 
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	public int getLado3() {
		return lado3;
	}
	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}
	 
	public boolean esUnTriangulo(){
		boolean esUnTriangulo=false;
		if ( this.getLado1()>=this.getLado2() && this.getLado1()>=this.getLado3()) {
			esUnTriangulo= this.getLado1()>this.getLado2()+this.getLado3();
		}
		if ( this.getLado2()>=this.getLado1() && this.getLado2()>=this.getLado3()) {
			esUnTriangulo= this.getLado2()>this.getLado1()+this.getLado3();
		}
		if ( this.getLado3()>=this.getLado1() && this.getLado3()>=this.getLado2()) {
			esUnTriangulo= this.getLado3()>this.getLado1()+this.getLado2();
		}
		return esUnTriangulo;
	}
	public String tipoTriangulo(){
		String tipoTriangulo="";
		if (this.getLado1()==0 || this.getLado2()==0 || this.getLado3()==0) {
			tipoTriangulo="NO ES TRIANGULO";
		}else {
		
		if(this.getLado1()==this.getLado2() && this.getLado1()==this.getLado3()  ) {
			tipoTriangulo="equilatero";
		}
		if(this.getLado1()!=this.getLado2() && this.getLado1()!=this.getLado3() && this.getLado2()!=this.getLado3()  ) {
			tipoTriangulo="escaleno";
		}
		if((this.getLado1()==this.getLado2() && this.getLado1()!=this.getLado3()) || (this.getLado1()==this.getLado3() && this.getLado1()!=this.getLado2()) || (this.getLado2()==this.getLado3() && this.getLado2()!=this.getLado1()) ) {
			tipoTriangulo="isósceles";
		}}
		return tipoTriangulo;
		
	}
 }
 
 class Robot{
	 
		/*
		 * 7) En un nuevo proyecto, crear una clase de nombre Robot con los atributos:
		 * batería inicializado en 500 unidades de energía 
		 *  y nombre; 
		 *  un constructor que permita inicializar únicamente a su atributo nombre; los métodos getter y
		 * setter para sus atributos y los siguientes métodos adicionales:
		 * 
		 *  avanzar(): Este método recibirá la cantidad de pasos que deberá dar el
		 * robot, sabiendo que por cada 100 pasos consume 10 unidades de energía y que
		 * sólo avanzará si hay batería suficiente.  bateriaVacia(): Este método
		 * retornará true, sólo cuando la batería quede con un valor menor o igual a
		 * cero. 
		 */
	 private double bateria = 500;
	 public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}

	private String Nombre ;
	 
	 public Robot(String Nombre) {
		 this.Nombre=Nombre;
		 
	 }
	 public void avanzar(int pasos) {
			 this.setBateria(this.getBateria()-(100/10*pasos)); 
	 }
	 
	 public boolean bateriaVacia() {
		 return this.getBateria()<=0;
	 }
 }
 
 class Calculo{
	/*
	 * En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes
	 * métodos estáticos:  
	 * esPrimo(): Este método recibe un número entero y retorna
	 * true si el número recibido es primo, caso contrario retornará false. 
	 * valorAbsoluto(): Este método recibe un número entero y retorna su valor
	 * absoluto.  
	 * calcularRices(): Este método recibe los coeficientes a, b y c de
	 * una ecuación de segundo grado y mostrará por consola sus raíces y si no las
	 * tiene también lo informará. Luego desde la clase principal del proyecto (la
	 * que contiene el método main) se pide:
	 * 
	 * Utilizando los métodos estáticos de la clase Calculo: a) Informar por consola
	 * si un número escogido por usted es primo o no. b) Mostrar por consola el
	 * valor absoluto del valor -90; c) Mostrar las raíces de la ecuación de segundo
	 * grado con los coeficientes: 1, 0 y 9.
	 */
	 
	 public boolean esPrimo(int numero) {
		 boolean esPrimo = false;
		 for (int i=2; i<numero;i++) {
			 esPrimo = numero%i==0;	 
		 }
		 return esPrimo;
	 }
	 
	 public int valorAbsoluto(int numero){
		 return Math.abs(numero);
	 }
	 
	 public void calcularRaices(double a, double b, double c) {
		    double discriminante = b * b - 4 * a * c;
		    if (discriminante < 0) {
		        System.out.println("La ecuación no tiene raíces reales.");
		    } else if (discriminante == 0) {
		        double raiz = -b / (2 * a);
		        System.out.println("La ecuación tiene una raíz real: " + raiz);
		    } else {
		        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
		        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
		        System.out.println("La ecuación tiene dos raíces reales: " + raiz1 + " y " + raiz2);
		    }
		}
 }
 
 
 class Fecha{
	/*
	 * 9) En un nuevo proyecto, crear una clase de nombre Fecha con los siguientes
	 * atributos: dia, mes, año; un constructor que permita inicializar a todos sus
	 * atributos; los métodos getter y setter para sus atributos y los siguientes
	 * métodos adicionales:  
	 * esBisiesto(): Este método retornará true si el año de esta Fecha es bisiesto; caso contrario retornará false.
	 * calcularAños(): Este método recibirá un objeto del tipo Fecha y retornará un entero que será
	 * la cantidad de años transcurridos entre esta Fecha y la que recibe por
	 * parámetro.
	 * 
	 *  Luego desde la clase principal del proyecto (la que contiene el
	 * método main) se pide: 
	 * 
	 * a) Crear dos objetos de tipo fecha. Utilizando sus
	 * métodos: 
	 * b) Mostrar por consola si la primera fecha y la segunda corresponden
	 * a años bisiestos. 
	 * c) Mostrar por consola, la cantidad de años transcurridos
	 * entre la primera fecha y la segunda.
	 */
	 
	 private int dia;
	 public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	private int mes;
	 private int anio;
	 
	 public Fecha(int dia,int mes,int anio) {
		 this.dia=dia;
		 this.mes=mes;
		 this.anio=anio;
	 }
	 public boolean esBisiesto(){
		   if (this.getAnio() % 4 != 0) {
		        return false;
		    } else if (this.getAnio() % 100 != 0) {
		        return true;
		    } else if (this.getAnio() % 400 != 0) {
		        return false;
		    } else {
		        return true;
		    }
	 }
	 
	public int calcularAños(Fecha fecha) {
		int fecha1 = this.getDia()+(this.getMes()*30)+(this.getAnio()*365);
		int fecha2 = fecha.getDia()+(fecha.getMes()*30)+(fecha.getAnio()*365);
		return fecha1 >fecha2? (fecha1-fecha2)/365:(fecha2-fecha1)/365;
	}
 }
 
 class Pensador{
	/*
	 * 10) En un nuevo proyecto, crear una clase de nombre Pensador con un atributo
	 * que almacenará un valor entero; un constructor que permita inicializar dicho
	 * atributo; los métodos get y set para dicho atributo y los siguientes métodos
	 * adicionales:
	 * 
	 *  invertir(): Este método retornará el valor guardado en el atributo con sus
	 * cifras invertidas. Por ejemplo si el valor guardado es 3915, retornará 5193 
	 * parAntes(): Este método retornará el valor par próximo anterior al valor
	 * guardado.
	 * 
	 *  parPosterior(): Este método retornará el valor par próximo posterior al
	 * valor guardado.  
	 * primerDigito(): Este método retornará el primer dígito del
	 * valor guardado. 
	 *  ultimoDigito(): Este método retornará el último dígito del
	 * valor guardado. Luego desde la clase principal del proyecto (la que contiene
	 * el método main) se pide: a) Crear una instancia de la clase Pensador. b)
	 * Probar todos sus métodos y mostrar por consola los resultados obtenidos.
	 */
	 
	  private int valor;

	    public Pensador(int valor) {
	        this.valor = valor;
	    }

	    public int getValor() {
	        return valor;
	    }

	    public void setValor(int valor) {
	        this.valor = valor;
	    }

	    public int invertir() {
	        int invertido = 0;
	        int resto = valor;
	        while (resto != 0) {
	            int cifra = resto % 10;
	            invertido = invertido * 10 + cifra;
	            resto /= 10;
	        }
	        return invertido;
	    }

	    public int parAntes() {
	        return (valor % 2 == 0) ? valor - 2 : valor - 1;
	    }

	    public int parPosterior() {
	        return (valor % 2 == 0) ? valor + 2 : valor + 1;
	    }

	    public int primerDigito() {
	        int primerDigito = valor;
	        while (primerDigito >= 10) {
	            primerDigito /= 10;
	        }
	        return primerDigito;
	    }

	    public int ultimoDigito() {
	        return valor % 10;
	    }
	
 }