Algoritmo ejecicio7
//	Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con
//decimales ni letras. Ejemplo: ingresando "100"(car�cter) debe convertirse en 100(entero).
	
	
	Escribir devuelva_como_numero("100") + 20
	
FinAlgoritmo

Funcion  return <- devuelva_como_numero(caden)
	Definir  return Como Entero
	Si Longitud(caden)<4 Entonces
		return =ConvertirANumero(caden)
	SiNo
		return = 0
	Fin Si
FinFuncion
