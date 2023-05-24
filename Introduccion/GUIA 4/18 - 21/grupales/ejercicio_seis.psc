Algoritmo ejercicio_seis
	
	Definir letra , frase , vector , letraNueva Como Caracter
	Definir i , j Como Entero
	Dimension  vector(20)
	
	Escribir "Ingresar frase:"
	Leer frase
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		letra = subcadena(frase,i,i)
		vector(i) = letra
		Escribir vector(i) Sin Saltar
	FinPara
	
	
	Escribir ""
	Escribir "Ingrese un caracter y la posición a reemplazar:"
	Leer letraNueva , j
	vector(j) = letraNueva
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		Escribir vector(i) Sin Saltar
	FinPara
	Escribir ""
	
	
FinAlgoritmo
	