Algoritmo ejercicio1
	//realizar un programa que rellene 2 vectores con 5 valores aleatorios y los muestrre por pantalla
	Definir n,v Como Real
	n=5
	v=crearVector(n)
	print(v,n)
FinAlgoritmo


Funcion vector<-crearVector(n)
	Definir vector,i Como Real
	Dimension  vector[n]
	Para i=0 Hasta n-1 Hacer
		vector[i]=Aleatorio(0,n)
		Escribir  vector[i]
	Fin Para
	vector=vector[]

FinFuncion


Funcion print(vector  ,n)
	Definir i Como Real
	Escribir vector[0]
	
FinFuncion
	