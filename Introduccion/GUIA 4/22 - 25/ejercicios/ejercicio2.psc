Algoritmo ejercicio2
//	Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//	usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las 
//	coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En 
//	caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
	//main()
	main2()
	

FinAlgoritmo

SubProceso   generar_Matriz(n,matriz Por Referencia)
	Definir eje_x,eje_y Como Real
	Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			matriz[eje_y,eje_x]= Aleatorio(1,100)
		Fin Para
	Fin Para
FinSubProceso

Funcion prit_matriz(n,matriz)
	Escribir "-------------------------------------------"
	Definir eje_x,eje_y Como Real
	Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir ""
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			Escribir matriz[eje_y,eje_x] " " Sin Saltar
		Fin Para
	Fin Para
	Escribir ""
FinFuncion

Funcion  buscar_num(n,matriz,num)
	Definir eje_x,eje_y Como Real
	Definir boolean Como Logico
	boolean = Falso
	Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir ""
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			Si num == matriz[eje_y,eje_x]  Entonces
				Escribir "el numero  " num " se a encontrado en la fila " eje_x " y en la colucna " eje_y
				eje_x=n-1
				eje_y=n-1
				boolean =Verdadero
			Fin Si
		Fin Para
	Fin Para
	Si boolean ==Falso Entonces
		Escribir "valor no encontrado"
	Fin Si
	Escribir ""
FinFuncion

Funcion main2()
	Definir matriz,n,num Como Real
	n=5
	Dimension  matriz[n,n]
	generar_Matriz(n,matriz)
	prit_matriz(n,matriz)
	Escribir "que numero deseas ubucar : "
	leer num
	num=num
	buscar_num(n,matriz,num)
FinFuncion









































SubProceso   generar_Matrix(n,matrix Por Referencia)
	Definir i,j Como Real
	//	Definir  matrix Como Real
	//	Dimension  matrix[n*n]
	Definir num Como Real
	Para i=0 Hasta (n*n)-1 Con Paso n Hacer
//		Escribir i
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			matrix[i+j]= Aleatorio(1,100)
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
	n=5
	Definir matrix Como Real
	Dimension matrix[n*n]
	generar_Matrix(n,matrix)
	print_matrix(matrix,n)
FinFuncion
	