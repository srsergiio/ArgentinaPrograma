Algoritmo ejecicio11
//	Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//	tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//			numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//			Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//					realizar el ejercicio.
	
	Escribir  largo(1234)
	
	
FinAlgoritmo

Funcion  return <- largo(num)
	Definir largos Como Entero
	largos=0
	Mientras num/10>10 Hacer
		Escribir num ," / ",10," = ",num/10," = ",num/10>10
		largos=largos+1
		num = num/10
		Escribir largos
	Fin Mientras
	
FinFuncion


funcion return <- moverComa(num,digito)

	definir return Como Real
	return= num mod 10
FinFuncion
	