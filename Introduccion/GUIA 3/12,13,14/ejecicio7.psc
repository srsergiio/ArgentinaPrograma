Algoritmo ejecicio7
//	Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//decimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).
	
	
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
