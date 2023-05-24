Algoritmo ejercicio4
//	Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro 
//	subproceso para imprimir la matriz
	main()
FinAlgoritmo

Funcion main()
	Definir matriz,n Como Real
	n=5
	Dimension  matriz[n,n]
	generar_Matriz(n,matriz)
	prit_matriz(n,matriz)
FinFuncion

SubProceso   generar_Matriz(n,matriz Por Referencia)
	Definir cont Como Entero
	cont=0
	Definir eje_x,eje_y Como Real
	Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			
				Si cont== eje_y y cont== eje_x Entonces
					matriz[eje_y,eje_x]=0
					cont= cont+1
				SiNo
					matriz[eje_y,eje_x]= Aleatorio(1,100)
				Fin Si
			
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


	