Algoritmo ejercicio2 
//	Realizar un programa que lea 10 n�meros reales por teclado, los almacene en un arreglo y
//	muestre por pantalla la suma, resta y multiplicaci�n de todos los n�meros ingresados al
//	arreglo.
	Definir lista , i ,num Como Real
	Dimension lista[10]
	
	Para i<-0 Hasta 10-1 Con Paso 1 Hacer
		Escribir "escribe un numero"
		Leer num
		lista[i]=num
	Fin Para
	
	Para i =0 Hasta 10-1 Con Paso 1 Hacer
		Escribir "vector : ",i," = ",lista[i]
	Fin Para
FinAlgoritmo
