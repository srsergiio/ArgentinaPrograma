algoritmo sin_titulo
	
Definir  frase Como Caracter
Definir i Como Entero
	
	Escribir("Ingrese una frase: ")
	Leer frase
	Para i <- 1 Hasta Longitud(frase) Hacer
		Escribir sin saltar Subcadena(frase, i, 1), " "
	FinPara
	
FinAlgoritmo

