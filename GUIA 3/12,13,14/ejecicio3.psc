Algoritmo ejecicio3
//	Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//	que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
//	m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.
	
	Escribir EsMultiplo(33,11)
	Escribir EsMultiplo(30,10)
	Escribir EsMultiplo(20,2)
	
FinAlgoritmo


funcion  return <- EsMultiplo(numA Por Valor,numB Por Valor)
	Definir return Como logico
	return = numA %numB == 0
FinFuncion