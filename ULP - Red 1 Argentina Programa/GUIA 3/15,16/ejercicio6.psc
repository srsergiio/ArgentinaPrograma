Algoritmo ejercicio6
//	Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//			letras "M" y "T". Recordar que Pseint le da un valor num�rico a cada letra a trav�s del C�digo
	//			Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.
	Definir  letra Como Caracter
	estaEntreMT(letra)
FinAlgoritmo

SubProceso estaEntreMT(letra Por Referencia)
	Escribir " escribir letra "
	leer letra
	Si "m"<letra y  "t">letra Entonces
		Escribir " SI, esta entre la M y T"
	SiNo
		Escribir " NO, esta entre la M y T"
	Fin Si
FinSubProceso

