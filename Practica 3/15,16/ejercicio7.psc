Algoritmo ejercicio7
//	Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
//	comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario
//al comenzar. Ejemplo: si se ingresa el n�mero 3:
//1
//12
//123
	escaleraN(3)
FinAlgoritmo
SubProceso escaleraN(num)
	Definir i,j Como Entero
	Definir textaux Como Caracter
	Para i=1 Hasta num Con Paso 1 Hacer
		textaux=""
		Para j=1 Hasta i Con Paso 1 Hacer
			textaux=Concatenar(textaux,ConvertirATexto(j)) 
		Fin Para
		Escribir textaux
	Fin Para
FinSubProceso
