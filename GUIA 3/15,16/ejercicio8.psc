Algoritmo ejercicio8
//	Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//		Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha
//			representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede
//			asumir que dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para
	//				los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.
	Definir  dia,mes,anio Como Entero
	dia=5
	mes=10
	anio=2012
	Escribir "fecha Actual : ", dia,"/",mes,"/",anio
	diaAnterior(dia,mes,anio)
	dia=1
	mes=3
	anio=2004
	Escribir "fecha Actual : ", dia,"/",mes,"/",anio
	diaAnterior(dia,mes,anio)
	dia=1
	mes=1
	anio=2004
	Escribir "fecha Actual : ", dia,"/",mes,"/",anio
	diaAnterior(dia,mes,anio)
FinAlgoritmo
SubProceso diaAnterior(dia Por Referencia, mes Por Referencia, anio Por Referencia)
	Definir esCambioMes,esCambioanio Como Logico
	esCambioanio=Falso
	//anio modifica si es mes=1 y dia=1
	//vemos el mes
	//mes modifica dia =1
	//dia tiene que estar entre 1 y 31 para modificarse
	esCambioMes=Falso
	Si dia==1 Entonces
		dia=31
		esCambioMes = Verdadero
	SiNo
		dia=dia-1
	Fin Si
	
	//caso mes 
	Si  esCambioMes== Verdadero Entonces
		Si mes ==1 Entonces
			mes =12
			esCambioanio =Verdadero
		SiNo
			mes=mes-1
		Fin Si
	Fin Si
	//caso anio
	
	Si  esCambioanio ==Verdadero Entonces
		anio = anio-1
	Fin Si
	
	
	
	Escribir "fecha anterior : ", dia,"/",mes,"/",anio
FinSubProceso
	