///Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
///usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el valor
///más grande del vector.

Algoritmo sin_titulo
	definir vector, n, i, max Como Entero
	escribir "ingrese al dimensión del vector"
	leer n
	dimension vector(n)
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Escribir "ingrese vector", i
		leer vector(i)
	Fin Para
	max=vector(0)
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		
		si vector(i)>max Entonces
			max=vector(i)
		FinSi
	Fin Para
	escribir "el número máximo de los vectores es: "  max
FinAlgoritmo
