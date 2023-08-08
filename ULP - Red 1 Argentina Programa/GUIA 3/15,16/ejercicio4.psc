Algoritmo ejercicio4
//	Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//	
//	a e i o u
//	@ # $ % *
//	
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//	correspondiente. Utilice la estructura "según" para la transformación.
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//		La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
	//		NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
	Definir frase Como Caracter
	especialcaracteres(frase)
	Escribir frase
	
FinAlgoritmo



SubProceso especialcaracteres(frase por referencia)
	Definir fraseAux Como Caracter
	Definir i Como entero
	fraseAux=""
	Escribir "ingrese una frase con punto final"
	Leer frase
	frase=Minusculas(frase)
	Para i<-0 Hasta Longitud(frase) Con Paso 1 Hacer
		
		Si SubCadena(frase,i,i) =="." Entonces
			i=Longitud(frase)
		SiNo
			Segun SubCadena(frase,i,i) Hacer
				"a":
					fraseAux=Concatenar(fraseAux,"@")
					
				"e":
					fraseAux=Concatenar(fraseAux,"#")
					
				"i":
					fraseAux=Concatenar(fraseAux,"$")
					
				"o":
					fraseAux=Concatenar(fraseAux,"%")
					
				"u":
					fraseAux=Concatenar(fraseAux,"*")
					
				De Otro Modo:
					fraseAux=Concatenar(fraseAux,SubCadena(frase,i,i))
			Fin Segun
		Fin Si
		
	Fin Para
	frase = fraseAux
	
FinSubProceso
	