Algoritmo ejercicio1
	
//	main()
 main2()	

	
FinAlgoritmo

SubProceso   generar_Matriz(n,matriz Por Referencia)
	Definir eje_x,eje_y Como Real
	Definir num Como Real
	Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			Escribir "escribir un numero"
			leer num
			matriz[eje_y,eje_x]= num
		Fin Para
	Fin Para
FinSubProceso

Funcion prit_matriz(n,matriz)
	Escribir "-------------------------------------------"
	Definir eje_x,eje_y Como Real
	Definir num Como Real
	Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir ""
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			Escribir matriz[eje_y,eje_x] " " Sin Saltar
		Fin Para
	Fin Para
	Escribir ""
FinFuncion


Funcion main2()
	Definir matriz,n Como Real
	n=3
	Dimension  matriz[n,n]
	generar_Matriz(n,matriz)
	prit_matriz(n,matriz)
FinFuncion






























SubProceso   generar_Matrix(n,matrix Por Referencia)
	Definir i,j Como Real
	//	Definir  matrix Como Real
	//	Dimension  matrix[n*n]
	Definir num Como Real
	Para i=0 Hasta (n*n)-1 Con Paso n Hacer
//		Escribir i
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Escribir " ingrese num : " (i+j)
			leer num
			matrix[i+j]= num
		FinPara
	Fin Para
FinSubProceso


Funcion print_matrix(matrix,n)
	Escribir "-------------------------------------------------------------------"
	Definir i,j Como Real
	Definir num Como Real
	Para i=0 Hasta (n*n)-1 Con Paso n Hacer
		Escribir ""
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Escribir Sin Saltar matrix[i+j] " "
		FinPara
	Fin Para
	Escribir ""
	Escribir ""
FinFuncion

Funcion main()
	Definir n Como Entero
	n=3
	Definir matrix Como Real
	Dimension matrix[n*n]
	generar_Matrix(n,matrix)
	print_matrix(matrix,n)
	
FinFuncion
	