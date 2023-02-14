Algoritmo ejecicio4
//	Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//	función Subcadena().
	Definir letra,frase Como Caracter
	letra="o"
	frase="hola, mundo"
	Escribir letraEnFrase(letra,frase)
	
FinAlgoritmo


Funcion return <- letraEnFrase(letra,frase)
	Definir return ,i,cont Como Entero
	letra = Minusculas(letra)
	frase = Minusculas(frase)
	cont=0
	Para i<-0 Hasta Longitud(frase) Con Paso 1 Hacer
		Si SubCadena(frase,i,i)==letra Entonces
			cont=cont+1
		Fin Si
	Fin Para
	return = cont
		FinFuncion
	