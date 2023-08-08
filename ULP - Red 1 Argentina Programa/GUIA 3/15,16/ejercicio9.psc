Algoritmo ejercicio9
//	Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
//	repetidas. Al final el procedimiento mostrará la frase final.
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//	Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? quedan
	//		al no estar repetidas.
	Definir frase Como Caracter
	Escribir "escriba una frase "
	Leer frase
	vocalesrepetidas(frase)
	Escribir frase
FinAlgoritmo
SubProceso vocalesrepetidas(frase Por Referencia)
	Definir cont_a,cont_e,cont_i,cont_o,cont_u,i Como Entero
	Definir auxfrase Como caracter
	auxfrase=""
	cont_a=0
	cont_e=0
	cont_i=0
	cont_o=0
	cont_u=0
	Para i=0 Hasta Longitud(frase) Con Paso 1 Hacer
		Segun SubCadena(frase,i,i) Hacer
			"a":
				cont_a=	cont_a+1
				Si cont_a>=2 Entonces
					auxfrase=auxfrase
				SiNo
					auxfrase=Concatenar(auxfrase,SubCadena(frase,i,i))
				Fin Si
			"e":
				cont_e=	cont_e+1
				Si cont_e>=2 Entonces
					auxfrase=auxfrase
				SiNo
					auxfrase=Concatenar(auxfrase,SubCadena(frase,i,i))
				Fin Si
			"i":
				cont_i=	cont_i+1
				Si cont_i>=2 Entonces
					auxfrase=auxfrase
				SiNo
					auxfrase=Concatenar(auxfrase,SubCadena(frase,i,i))
				Fin Si
			"o":
				cont_o=	cont_o+1
				Si cont_o>=2 Entonces
					auxfrase=auxfrase
				SiNo
					auxfrase=Concatenar(auxfrase,SubCadena(frase,i,i))
				Fin Si
			"u":
				cont_u=	cont_u+1
				Si cont_u>=2 Entonces
					auxfrase=auxfrase
				SiNo
					auxfrase=Concatenar(auxfrase,SubCadena(frase,i,i))
				Fin Si
			De Otro Modo:
				auxfrase=Concatenar(auxfrase,SubCadena(frase,i,i))
		Fin Segun
	Fin Para
	frase=auxfrase
	
FinSubProceso
	