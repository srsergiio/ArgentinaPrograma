Algoritmo ejercicio1
	print(  generar_vector() ,5 )
	
FinAlgoritmo


Funcion return <- generar_vector()
	
	Definir  return,i Como entero
	Dimension   return[5]
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		return[i]=33
	Fin Para
	print(return ,5 )
FinFuncion


SubProceso  print(lista,largo)
	Definir i Como Entero
	Para i=0 Hasta largo-1 Con Paso 1 Hacer
		Escribir 'vector : ',i,' = ',lista[i]
	Fin Para
	
finsubProceso 
	