///Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta que ingrese la opción Salir:
///A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria usando la función Aleatorio(valorMin, valorMax) de PseInt.
///B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
///C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento a elemento. Ejemplo: C = A + B
///D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a elemento. Ejemplo: C = B - A
///E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector A, B, o C.
///F. Salir.
///NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
///para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una vez.

Algoritmo sin_titulo
	definir vectorA, vectorB, vectorC, n, i Como Entero
	
	escribir "ingrese dimensión vectorA y vectorB"
	leer n
	dimension vectorA(n), vectorB(n), vectorC(n)
	definir letra como caracter
	
	Repetir
		Escribir "Menu de opciones"
		Escribir "A. Llenar Vector A."
		Escribir "B. Llenar Vector B."
		Escribir "C. Llenar Vector C."
		Escribir "D. Llenar Vector D."
		Escribir "E. Mostrar."
		escribir "F. Salir."
		escribir "ingrese una Opción"
	
	
	leer letra
	Segun letra hacer
		"A": 
			Para i=0 Hasta n-1 Con Paso 1 Hacer
				vectorA(i)=aleatorio(-100,100)
			Fin Para
			
		"B":
			Para i=0 Hasta n-1 Con Paso 1 Hacer
				vectorB(i)=aleatorio(-100,100)
			Fin Para
		"C":
			Para i=0 Hasta n-1 Con Paso 1 Hacer
				vectorC(i)=vectorA(i)+vectorB(i)
			Fin Para
		"D":Para i=0 Hasta n-1 Con Paso 1 Hacer
			vectorC(i)=vectorB(i)-vectorA(i)
		Fin Para
		"E": Para i=0 Hasta n-1 Con Paso 1 Hacer
				escribir "vectorA posicion: ", i,"", vectorA(i)
			Fin Para
			Para i=0 Hasta n-1 Con Paso 1 Hacer
				escribir "vectorB posicion: ", i,"", vectorB(i)
			fin para
			Para i=0 Hasta n-1 Con Paso 1 Hacer
					escribir "vectorC posicion: ", i,"", vectorC(i)
			FinPara
		"F":
		
	FinSegun
Mientras Que letra<>"F"

	
FinAlgoritmo
