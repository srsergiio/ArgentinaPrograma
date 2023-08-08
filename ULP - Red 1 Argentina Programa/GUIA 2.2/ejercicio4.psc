Algoritmo ejercicio4
//	Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
//	comprendidos entre 1 y 100.
	Definir cont,i , num Como Entero
	cont=0
	Escribir "ingrese num 2 o 3"
	Leer num
	para i=0 hasta 100 Con Paso 1 Hacer
		
		si i%3==0 & num==3 Entonces
			cont=cont+1
		FinSi
		si i%2==0& num==2 Entonces
			cont=cont+1
		FinSi	
		
	finpara
	Escribir " la cantidad de números que son múltiplos de 2 o de 3 son : ",cont
FinAlgoritmo
