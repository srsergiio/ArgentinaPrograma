Algoritmo ejercicio5
//	Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//	una cadena con un espacio adicional tras cada letra.
//	Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
	//	dicho procedimiento.
	Definir txt Como Caracter
	convertirEspaciado(txt)
	Escribir txt
	
FinAlgoritmo

SubProceso convertirEspaciado(txt Por Referencia)
	Definir auxtxt Como Caracter
	Definir i Como Entero
	Escribir "escribe un texto"
	Leer txt
	auxtxt=""
	Para i<-0 Hasta Longitud(txt) Con Paso 1 Hacer
		Si SubCadena(txt,i,i)<>" " Entonces
			auxtxt=Concatenar(auxtxt,SubCadena(txt,i,i)+" ")
		SiNo
			Si SubCadena(txt,i,i)==" " Entonces
				// no hacer nada
				auxtxt=auxtxt
			SiNo
				auxtxt=Concatenar(auxtxt,SubCadena(txt,i,i))
			Fin Si
			
		Fin Si
		
	Fin Para
	txt=auxtxt
FinSubProceso
