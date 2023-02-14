Algoritmo cade_espacio
//	Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
//espacio entre cada letra. La frase se mostrará así: H o l a. Nota: recordar el
//		funcionamiento de la función Subcadena().
	definir cade,cade2 como Cadena
	definir i como Entero
	cade2=""
	
	escribir "Ingrese una cadena: "
	leer cade
	para i=0 hasta longitud(cade) Con Paso 1 Hacer
		cade2=cade2+ subcadena(cade, i, i)+" "
	finpara
	escribir cade2
FinAlgoritmo
