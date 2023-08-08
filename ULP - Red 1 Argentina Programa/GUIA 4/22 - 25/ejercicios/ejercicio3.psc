Algoritmo ejercicio3
//	Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//	un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro 
//	subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//	los resultados por pantalla
	
	main()
FinAlgoritmo

Funcion main()
	definir matriz,n,m Como Real
	Escribir "escribir un numero n :"
	leer n
	n=n
	Escribir "escribir un numero m :"
	leer m
	m=m
	Dimension  matriz[n,m]
	llenar_Matriz(matriz,n,m)
	print_Matriz(matriz,n,m)
	sumar_matriz(matriz,n,m)
FinFuncion

SubProceso llenar_Matriz(matriz Por Referencia,n,m)
	Definir eje_y,eje_x Como Real
	Para eje_y=0 Hasta n-1 Con Paso 1 Hacer
		Para eje_x=0 Hasta m-1 Con Paso 1 Hacer
			matriz[eje_y,eje_x]=Aleatorio(1,100)
		Fin Para
	Fin Para
FinSubProceso

Funcion print_Matriz(matriz,n,m)
	Escribir "----------------------------------------"
	Definir eje_y,eje_x Como Real
	Para eje_y=0 Hasta n-1 Con Paso 1 Hacer
		Escribir ""
		Para eje_x=0 Hasta m-1 Con Paso 1 Hacer
			Escribir matriz[eje_y,eje_x] " " Sin Saltar
		Fin Para
	Fin Para

Escribir ""
FinFuncion

Funcion sumar_matriz(matriz,n,m)
	Definir eje_y,eje_x,cont Como Real
	cont=0
	Para eje_y=0 Hasta n-1 Con Paso 1 Hacer
		Para eje_x=0 Hasta m-1 Con Paso 1 Hacer
			cont = cont+ matriz[eje_y,eje_x]
		Fin Para
	Fin Para
	Escribir ""
	Escribir "la suma de todos los num es : " cont
	Escribir ""
FinFuncion
	