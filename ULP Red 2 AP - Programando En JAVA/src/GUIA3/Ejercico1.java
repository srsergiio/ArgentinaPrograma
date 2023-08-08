package GUIA3;

import GUIA3.Ejercicio1.*;

public class Ejercico1 {
//	Realizar un programa para que una Persona pueda adoptar hasta tres Perros. Vamos a contar de
//	dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño, un constructor que
//	permita inicializar todos sus atributos y los respectivos métodos getter y setter de sus atributos; y
//	la clase Persona con atributos: nombre, apellido, edad, documento y tres atributos de tipo Perro,
//	un constructor que sólo permita inicializar los atributos: nombre, apellido, edad y documento. La
//	Persona cuenta además con los siguientes métodos:
//	adoptarPerro() Este método recibe por parámetro un Perro y lo asigna en alguna de las variables
//	vacías; si todas las variables atributos Perro están ocupadas, mostrará un mensaje “Ya no puedo
//	adoptar”.
//	perroMasGrande() Este método retornará el Perro de mayor edad.
//
//	Ahora deberemos en el main crear una Persona y 4(cuatro) Perros. Después, vamos a hacer que
//	persona adopte cada uno de esos Perros (luego al ejecutar veremos que pasa), por último pediremos
//	a la Persona que nos diga cual es el Perro más viejo.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona Persona = new Persona("Juan", "Gomez", 23, 332233123);
                Perro p1 = new Perro("gordo","???",5,1);
                Perro p2 = new Perro("flaco","???",8,1);
                Perro p3 = new Perro("lici","???",7,1);
                Perro p4 = new Perro("???","???",22,1);
                Persona.adoptarPerro(p1);
                Persona.adoptarPerro(p2);
                Persona.adoptarPerro(p3);
                Persona.adoptarPerro(p4);
                Persona.perroMasGrande();

                
		
		
               
	}

	

}
