Algoritmo ejercicio6
	Definir  frase Como Caracter
	Definir vector20 Como Caracter
	Dimension vector20[20]
	Escribir "escreiba una frase"
	leer frase
	vector20<- llenarvector(frase)
	
FinAlgoritmo

Funcion vectorlleno<-llenarvector(frase)
	Definir i Como Real
	Definir vectorlleno Como Caracter
	Dimension vectorlleno[20]
	
	Para i<-0 Hasta 20-1 Con Paso 1 Hacer
		Si i> Longitud(frase) Entonces
			vectorlleno[i]=" "
		SiNo
			vectorlleno[i]= frase[i]
		Fin Si
		
	Fin Para
	
FinFuncion
	