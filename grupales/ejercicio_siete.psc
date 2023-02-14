Algoritmo ejercicio_siete
	
	Definir n , i , j , vector1 , vector2 Como Entero
	Definir iguales Como Logico
	Escribir "Ingresar dimensión de los vectores:"
	Leer n
	Dimension vector1(n) , vector2(n)
	
	iguales = Verdadero
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		vector1(i) = Aleatorio(1,2)
		vector2(i) = Aleatorio(1,2)
		Si vector1(i) <> vector2(i) Entonces
			iguales = Falso
		FinSi
	FinPara
	
	Escribir "Vector 1: " 
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir vector1(i) Sin Saltar
	FinPara
	Escribir ""
	Escribir "Vector 2: " 
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir vector2(i) Sin Saltar
	FinPara
	Escribir ""
	Escribir "Vector 1 igual a vector 2:" , iguales
	
FinAlgoritmo

