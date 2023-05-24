Algoritmo ejercicio5
	Definir lista,n Como Real
	
	Escribir "asigne el largo del Vector/lista"
	Leer n
	Dimension lista[n]
	vector( lista , n)
	n=BuscarelMayor(lista,n)

FinAlgoritmo

Funcion  vector(lista Por Referencia, n Por Referencia)
	Definir  i,num,return Como real
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir "asigene el un numero al vector ",i+1
		Leer num
		lista[i]=num
	Fin Para
FinFuncion

Funcion  return <- BuscarelMayor(lista ,n)
	Definir Mayor,i,return Como Real

	Mayor =lista[0]

	Para i<-1 Hasta n-1 Con Paso 1 Hacer
		Si lista[i]>mayor Entonces
			Mayor=lista[i]
		Fin Si
	Fin Para
	Escribir "El numero mayor es : ", Mayor
	return = Mayor

FinFuncion

