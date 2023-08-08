Algoritmo eje2grupal
	//	Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
	//	muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
	//	arreglo.
	Definir vector,vector_ope Como reales
	Dimension vector[10]
	Dimension vector_ope[3]
	cargarvecto(vector)
	imprimi(vector   ,  vector_ope )
	
	
	
	
FinAlgoritmo
SubProceso cargarvecto(vector Por Referencia)
	Definir num Como Real
	Definir i Como Entero
	Para i<-0 Hasta 10-1 Con Paso 1 Hacer
		Escribir "ingrese el ", i," numero real : "
		leer num
		vector[i]=num
	Fin Para
FinSubProceso

SubProceso imprimi(vector Por Referencia ,  vector_ope Por Referencia)
	Definir i,suma,resta,mult Como real
	suma=0
	resta=0
	mult=1
	Para i<-0 Hasta 10-1 Con Paso 1 Hacer
		suma=suma+vector[i]
		resta=resta-vector[i]
		mult=mult*vector[i]
	Fin Para
	vector_ope[0]=suma
	vector_ope[1]=resta
	vector_ope[2]=mult
	Escribir "total de suma : ",vector_ope[0]
	Escribir "total de resta : ",vector_ope[1]
	Escribir "total de multip : ",vector_ope[2]
FinSubProceso
