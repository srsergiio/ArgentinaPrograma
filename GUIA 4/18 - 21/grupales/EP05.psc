///Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
///usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
///m�s grande del vector.

Algoritmo sin_titulo
	definir vector, n, i, max Como Entero
	escribir "ingrese al dimensi�n del vector"
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
	escribir "el n�mero m�ximo de los vectores es: "  max
FinAlgoritmo
