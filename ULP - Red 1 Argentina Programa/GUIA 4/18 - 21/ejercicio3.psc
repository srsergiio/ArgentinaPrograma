Algoritmo ejercicio3grupal
//	Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//	usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
//	también debe ser ingresado por el usuario). El programa debe indicar la posición donde se
//	encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben
//	imprimir todas las posiciones donde se encuentra ese valor.
//	Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un
//mensaje.
	Definir vector,n Como real
	Escribir "ingrese el tamaño del arreglo : "
	leer n
	Dimension vector[n]
	cargarvecto(vector  , n  )
	buscarN(vector  , n  )
	
	
FinAlgoritmo

SubProceso cargarvecto(vector Por Referencia, n Por Referencia)
	Definir i Como Entero
	definir num Como Real
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir "escribe un numero : "
		leer num
		vector[i]=num
	Fin Para
	
FinSubProceso

SubProceso buscarN(vector Por referencia, n Por Referencia)
	Definir num ,i Como Real
	Definir  esta Como Logico
	Escribir "ingrese numero a buscar : "
	leer num
	esta=falso
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Si vector[i]==num Entonces
			Escribir "el numero : ",num," esta en posicion : ",i
			esta = Verdadero
		Fin Si
	Fin Para
	Si esta==falso Entonces
		Escribir "el numero : ",num," no esta en el vector"
	Fin Si
FinSubProceso
