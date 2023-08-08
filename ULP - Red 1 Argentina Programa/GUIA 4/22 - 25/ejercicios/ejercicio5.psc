Algoritmo ejercicio5
//	Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, 
//	encontrando la manera de que la frase se muestre de manera continua en la matriz.
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
//		H A B
//		I L I
//		D A D
//	Nota: recordar el uso de la función Subcadena()
	main()
FinAlgoritmo

Funcion main()
	Definir n Como Real
	Definir palabra,matriz Como Caracter
	n=3
	Dimension matriz[n,n]
	
	Escribir "ingrese una palabra de 9 caracteres"
	Leer palabra
	palabra=palabra
	generar_Matriz(n,matriz,palabra) 
	prit_matriz(n,matriz)
FinFuncion

SubProceso   generar_Matriz(n,matriz Por Referencia,palabra)
	Definir eje_x,eje_y,cont Como Real
	cont=0
	Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			matriz[eje_y,eje_x]=Subcadena(palabra,cont,cont)
			cont=cont+1
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