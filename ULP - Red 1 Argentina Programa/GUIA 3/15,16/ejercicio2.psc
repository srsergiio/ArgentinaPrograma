Algoritmo ejercicio2
//	Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//	máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//	pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//	programa pedirá el número de días que se van a introducir.
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
