Algoritmo ejercicio5
//	Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de
//	tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables
//	y mostrar el resultado final por pantalla.
//	Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
//	programa deberá mostrar: num1 = 3 y num2 = 9
//	Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable auxiliar
	
	Definir varible1,varible2,aux Como Entero
	Escribir "Ingrese un  numero : "
	leer varible1
	Escribir "Ingrese otro  numero : "
	leer varible2
	
	Escribir "varible1 : " varible1 " varible2 : " varible2
	
	aux=varible1
	varible1=varible2
	varible2=aux
	
	Escribir "varible1 : " varible1 " varible2 : " varible2
FinAlgoritmo
