Algoritmo ejercicio2
//	Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//	m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya
//	pidiendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//	programa pedir� el n�mero de d�as que se van a introducir.
	Definir dias,i Como Entero 
	Definir prom como real
	prom<-0
	Escribir "ingrese cantidad de dias"
	leer dias
	Para i<-1 Hasta dias Con Paso 1 Hacer
		tempmedia(prom)
		Escribir  "temperatura promedio : ", prom
	Fin Para
	
	
	
	
FinAlgoritmo
SubProceso tempmedia(prom Por Referencia)
	Definir tempmax,tempmin Como Real
	Escribir "temp max y luego la minima"
	leer tempmax
	leer tempmin
	prom<-(tempmax+tempmin)/2
FinSubProceso
