Algoritmo ejercicio_siete_clase20
	Definir n, vector1 , vector2 Como Entero
	Definir iguales Como Logico
	Escribir "Ingresar dimensión de los vectores:"
	Leer n
	Dimension vector1(n) , vector2(n)
	cargar_2_vec(vector1, vector2, n)
	Escribir "Vector 1"
	mostrar_v(vector1, n)
	Escribir "Vector 2"
	mostrar_v(vector2, n)
	iguales = comparacion(vector1, vector2, n)
	Escribir "Vector 1 igual a vector 2:" , iguales
	
FinAlgoritmo






















SubProceso cargar_2_vec(v1 Por Referencia, v2 Por Referencia, n)
	Definir i Como Entero
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		v1(i) = Aleatorio(1,2)
		v2(i) = Aleatorio(1,2)
	FinPara
FinSubProceso

SubProceso mostrar_v(v Por Referencia, n)
	Definir i Como Entero
	Para i = 0 hasta n-1 Hacer
		Imprimir "valores para el v [", i "] es de: " v[i]
	FinPara
FinSubProceso

Funcion retorno = comparacion(v1, v2, n)
	Definir i Como Entero
	Definir retorno Como Logico
	retorno = Verdadero
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Si v1(i) <> v2(i) Entonces
			retorno = Falso
		FinSi
	FinPara
FinFuncion