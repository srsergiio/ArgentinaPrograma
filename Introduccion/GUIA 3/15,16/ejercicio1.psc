Algoritmo ejercicio1
//	Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
	//	La variable A, debe terminar con el valor de la variable B.
	Definir num1,num2 Como Real
	num1=5
	num2=9
	Escribir  "numero 1 : ",num1," numero 2 : ",num2
	intercambiar(num1,num2)
	Escribir  "numero 1 : ",num1," numero 2 : ",num2
FinAlgoritmo

SubProceso  intercambiar(num1 Por Referencia,num2 Por Referencia)
	Definir aux Como Real
	aux = num1
	num1= num2
	num2=aux
FinSubProceso