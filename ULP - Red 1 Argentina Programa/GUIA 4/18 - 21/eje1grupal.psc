Algoritmo ejercio1grupal
	
	Definir vector Como entero
	Dimension vector[5]
	cargarvecto(vector)
	mostrarvector(vector)
	
FinAlgoritmo
SubProceso cargarvecto(vector Por Referencia)
	Definir i Como Entero
	Para i<-0 Hasta 5-1 Con Paso 1 Hacer
		vector[i]=azar(100)
	Fin Para
	
FinSubProceso

SubProceso mostrarvector(vector Por Referencia )
	Definir i Como Entero
	Para i=0 Hasta 5-1 Con Paso 1 Hacer
		Escribir  "vector ",i," = ",vector[i]
	Fin Para
FinSubProceso
	