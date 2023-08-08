Algoritmo sin_titulo
	definir i como Entero
	definir contador como Entero

	contador <- 0
	para i <- 1 hasta 100 hacer
		si (i mod 2 = 0) o (i mod 3 = 0) entonces
			contador <- contador + 1
		finsi
	finpara
	escribir "La cantidad de números múltiplos de 2 o de 3 entre 1 y 100 es: ", contador
FinAlgoritmo
