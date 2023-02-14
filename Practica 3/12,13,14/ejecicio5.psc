Algoritmo ejecicio5
//	Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//	primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
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
