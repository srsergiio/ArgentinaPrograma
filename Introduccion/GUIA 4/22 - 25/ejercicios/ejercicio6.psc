Algoritmo ejercicio6
//	Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que 
//	tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un 
//	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que 
//			sea mágica escribir lasuma. Además, el programa deberá comprobar que los números 
//			introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
	//			matriz que no debe superar orden igual a 10
	
	main()
FinAlgoritmo

funcion main()
	Definir matriz,n Como Entero
	Definir orden Como logico
	orden=Verdadero

	Mientras orden Hacer
		Escribir "Ingrese tamaño de matriz con un ORDEN no superior 10"
		leer n
		Si n<10 Entonces
			orden =falso
		Fin Si
	Fin Mientras
	 n=trunc(raiz(n))
	
	Dimension matriz[n,n]
	generar_Matriz(n,matriz )
	prit_matriz(n,matriz)
	test(n,matriz)
FinFuncion


SubProceso   generar_Matriz(n,matriz Por Referencia)
	Definir eje_x,eje_y,cont,num Como Real
	num=0
	Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			Escribir " ingre un numero a la matris "
			leer num
			matriz[eje_y,eje_x]=num
		Fin Para
	Fin Para
FinSubProceso

Funcion prit_matriz(n,matriz)
	Escribir "-------------------------------------------"
	Definir eje_x,eje_y Como Real
	Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir ""
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			
			Escribir"|" matriz[eje_y,eje_x] "|" Sin Saltar
			
		Fin Para
	Fin Para
	Escribir ""
FinFuncion

Funcion test(n,matriz)
	Definir check Como Logico
	check = Verdadero
	check = check == (n == checkfila(n,matriz))
		Escribir "-----------> checkfila(n,matriz) <-------------"
		Escribir n == checkfila(n,matriz)
	check = check == ( n == checkcoluna(n,matriz))
		Escribir "-----------> checkcoluna(n,matriz) <-------------"
		Escribir n == checkcoluna(n,matriz)
	check = check == (2 == checkOrizontal(n,matriz))
		Escribir "-----------> checkOrizontal(n,matriz) <-------------"
		Escribir check == (2 == checkOrizontal(n,matriz))
	Si check==Verdadero Entonces
		Escribir 'es una matriz magica'
	SiNo
		Escribir 'NO, es una matriz magica'
	Fin Si
FinFuncion

Funcion return<- checkfila(n,matriz)
	Definir  cont,suma,return Como Entero
	cont = 0
	suma = 0
	Definir eje_x,eje_y Como Real
	para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
		Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
			suma = suma + matriz[eje_y,eje_x]
//						Escribir "-----------> recorrido checkfila <-------------"
//						Escribir "----------->" eje_y " "  eje_x "<-------------"
			Si suma==igualar(n,matriz) Entonces
				cont = cont+1
//				Escribir "----------->" cont "<-------------"
				suma = 0
			Fin Si
		FinPara
	FinPara	
	return = cont
FinFuncion


Funcion return<- checkcoluna(n,matriz)
	Definir  cont,suma,return Como Entero
	cont = 0
	suma = 0
	Definir eje_x,eje_y Como Real
	para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
		Para eje_y<-0 Hasta n-1 Con Paso 1 Hacer
//			Escribir "-----------> recorrido checkcoluna <-------------"
//			Escribir "----------->" eje_y " "  eje_x "<-------------"
			suma = suma + matriz[eje_y,eje_x]
			//			Escribir "----------->" suma "<-------------"
			Si suma==igualar(n,matriz) Entonces
				cont = cont+1
				//				Escribir "----------->" cont "<-------------"
				suma = 0
			Fin Si
		FinPara
	FinPara	
	return = cont
FinFuncion

Funcion return <- checkOrizontal(n,matriz)
	Definir  cont,suma,return Como Entero
	Definir eje_x,eje_y,eje_par Como Real
	cont = 0
	suma = 0
	eje_x=0
	eje_y =0
	//filas y colunas iguales 
	para eje_par <-0 Hasta n-1 Con Paso 1 Hacer
		suma =  suma + matriz[eje_par,eje_par]
		Si suma==igualar(n,matriz) Entonces
			cont = cont+1
			suma=0
		Fin Si
	FinPara
	//filas y colunas invertidas 
	eje_x=n-1
	Para eje_y=0 Hasta n-1 Hacer
		suma =  suma + matriz[eje_y,eje_x]
		eje_x=eje_x-1
		Si suma==igualar(n,matriz) Entonces
			cont = cont+1
		Fin Si
	FinPara
	
	return = cont
FinFuncion



Funcion  return <- igualar(n,matriz)
	Definir return,suma Como Entero
	Definir eje_x,eje_y Como Real
	eje_y=0
	suma=0
	Para eje_x<-0 Hasta n-1 Con Paso 1 Hacer
		suma = suma + matriz[eje_y,eje_x]
	FinPara
	//Escribir "----------->" suma "<-------------"
	return = suma 
FinFuncion


	