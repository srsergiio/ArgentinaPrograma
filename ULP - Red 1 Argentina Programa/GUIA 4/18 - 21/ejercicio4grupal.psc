Algoritmo ejercicio4grupal
	//Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer hasta
	//que ingrese la opci�n Salir:
	//	A. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera aleatoria
	//		usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
	//	B. Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera aleatoria.
	//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
	//		a elemento. Ejemplo: C = A + B
	//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
	//		elemento. Ejemplo: C = B - A
	//	E. Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar: Vector
	//	A, B, o C.
	//	F. Salir.
	//		NOTA: El rango de los n�meros aleatorios para los Vectores ser� de [-100 a 100]. La longitud
	//				para todos los vectores debe ser la misma, por lo tanto, esa informaci�n s�lo se solicitar� una vez.
	Definir opc Como Entero
	opc=0
	Mientras opc<>6 Hacer
		opc=menu()
		si opc == 1 Entonces
			Escribir "---> op1 "
			Definir vector_a,n Como Real
			vector_a = vectorA(n)
		FinSi
		si opc == 2 Entonces
			Escribir "---> op2 "
		FinSi
		si opc == 3 Entonces
			Escribir "---> op3 "
		FinSi
		si opc == 4 Entonces
			Escribir "---> op4 "
		FinSi
		si opc == 5 Entonces
			Escribir "---> op5 "
			mostrarVector(vector_a,n)
		FinSi
	Fin Mientras
FinAlgoritmo

Funcion retorno = menu()
	Definir retorno Como Entero
	Definir op Como entero
	Imprimir "------------------------------------"
	Imprimir "*** Menu de Opciones ***"
	Imprimir "1 - Llenar Vector A de tama�o N"
	Imprimir "2 - Llenar Vector B de tama�o N"
	Imprimir "3 - Llenar Vector C de tama�o A+B"
	Imprimir "4 - Llenar Vector D de tama�o A-B"
	Imprimir "5 - Mostrar Vector"
	Imprimir "6 - Salir"
	Imprimir "------------------------------------"
	Imprimir "Ingrese la opcion"
	Leer op
	retorno = op	
FinFuncion


Funcion retorno <-vectorA(n Por Referencia)
	definir vector ,i, retorno como real
	Escribir "escribe el tama�o del vecto"
	leer n
	Dimension vector[n]
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		vector[i]=Aleatorio(1, 100)
	Fin Para
	Escribir "Vector cargado "
	retorno =vector[]
FinFuncion

SubProceso mostrarVector(vector,n)
	Definir  i Como Real
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir " Vector : ",i, " = ",vector[i]
	Fin Para

FinSubProceso

SubProceso LlenarVectorB()
	
FinSubProceso
	