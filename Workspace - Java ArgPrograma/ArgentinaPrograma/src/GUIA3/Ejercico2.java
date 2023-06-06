package GUIA3;

import GUIA3.Ejercicio2.Kiosco;
import GUIA3.Ejercicio2.Empleado;
import java.time.LocalDate;

public class Ejercico2 {
//	Un Kiosco tiene 3 Empleados. Vamos a contar de dos clases. Kiosco, que tendrá los atributos:
//	dirección, nombre, cuit y 3 atributos de tipo Empleado; y la clase Empleado posee los atributos:
//	nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en
//	la clase Kiosoco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el
//	Empleado con mayor antigüedad.
//
//	Ahora en el método main de la clase principal usted creará un Kiosco y 3 Empleados, luego
//	incorporará al Kisoco esos Empleados y le solicitará al Kiosco que muestre los datos del Empleado
//	de mayor antigüedad.
	
	public static void main(String []main){
	
	Kiosco k1 = new Kiosco("Argentina, Buenos Aires, Palermo,Calle falsa 1234","todo por $2 pesos",99999999);
        Empleado p1 = new Empleado("uno","a",LocalDate.of(2000, 1, 15),00000000);
        Empleado p2 = new Empleado("dos","b",LocalDate.of(890, 1, 15),00000001);
        Empleado p3 = new Empleado("tres","c",LocalDate.of(1999, 1, 15),00000002);
        
        k1.incorporar(p1);
        k1.incorporar(p2);
        k1.incorporar(p3);
        
        k1.mayorAntiguedad();
        
        }
}
