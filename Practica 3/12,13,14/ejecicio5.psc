Algoritmo ejecicio5
//	Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//	primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
	//	3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
	Definir num Como Entero
	Leer num
	Escribir esPrimo(num)
FinAlgoritmo

Funcion return<-esPrimo(num)
	Definir return como logico
	Definir i Como Entero
	i=2
	return=Verdadero
	Mientras i<num-1 Hacer
		Si num mod i==0 Entonces
			return=Falso
		Fin Si
		i=i+1
	Fin Mientras
	return=return
FinFuncion
