Algoritmo ejercicio_seis
	
	Definir letra , frase , vector , letraNueva Como Caracter
	Definir i , j Como Entero
	Escribir "Ingresar frase:"
	Leer frase
	Dimension  vector(20)
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		letra = subcadena(frase,i,i)
		vector(i) = letra
		Escribir vector(i) Sin Saltar
	FinPara
	Escribir ""
	Escribir "Ingrese un caracter y la posición a reemplazar:"
	Leer letraNueva , j
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		Si vector(i) == " " y j == i Entonces
			vector(i) = letraNueva
		FinSi
		Escribir vector(i) Sin Saltar
	FinPara
	Escribir ""
FinAlgoritmo
	