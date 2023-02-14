Algoritmo ejecicio6
//	Realizar una función que calcule y retorne la suma de todos los divisores del número n
//	distintos de n. El valor de n debe ser ingresado por el usuario.
	Definir num Como Entero
	Escribir "ingrese un numero para calcular la suma de todos sus divisores :"
	leer num
	Escribir sumaDivisores(num)
FinAlgoritmo

Funcion return<- sumaDivisores(num)
	Definir return,i,cont Como Entero
	cont=0
	Para i<-1 Hasta num-1 Con Paso 1 Hacer
		Si num%i==0 Entonces
			Escribir num,"%",i,"=",num%i, " entonces ",cont,"+",i,"=",cont+i
			 
			cont=cont+i
		Fin Si
	Fin Para
	return=cont
	FinFuncion
	