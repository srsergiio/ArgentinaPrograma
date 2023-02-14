Algoritmo ejercicio7
//	Crear un programa que dibuje una escalera de números, donde cada línea de números
//	comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario
//al comenzar. Ejemplo: si se ingresa el número 3:
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
