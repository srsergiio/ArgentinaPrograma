Algoritmo ejecicio10
//	Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
	//		resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.
	Escribir sumaDigitos(31)
	
FinAlgoritmo

Funcion return <- sumaDigitos(num)
	Definir primerD,segunD,return Como Entero
	primerD = (num mod 10)
	segunD =  trunc(num/100*10)
	return =primerD+segunD
	
FinFuncion
	