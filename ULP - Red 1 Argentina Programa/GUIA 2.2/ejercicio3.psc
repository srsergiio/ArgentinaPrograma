Algoritmo ejercicio3
//	Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//	N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//	Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
//de sus estudiantes:
	definir N como Entero
	definir i como Entero
	definir trabajo como Real
	definir exposicion como Real
	definir parcial como Real
	definir notaFinal como Real

	escribir "Ingrese el número de estudiantes:"
	leer N
	para i <- 1 hasta N hacer
		escribir "Ingrese la nota de trabajo del estudiante ", i, ":"
		leer trabajo
		escribir "Ingrese la nota de exposición del estudiante ", i, ":"
		leer exposicion
		escribir "Ingrese la nota del parcial del estudiante ", i, ":"
		leer parcial
		notaFinal <- (trabajo * 0.35) + (exposicion * 0.25) + (parcial * 0.40)
		escribir "La nota final del estudiante ", i, " es ", notaFinal
	finpara
FinAlgoritmo
