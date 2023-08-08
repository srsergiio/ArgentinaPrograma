Algoritmo ejecicio8
//	Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
//	devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd".
//	Además, la función calculara el número de intentos que se ha usado para loguearse,
	Definir  log Como Logico
	Definir  cont Como entero
	Definir  usuario1,asdasd Como Caracter
	Cont =0
	Mientras log == Falso   Hacer
		Escribir "escriba nombre de usuario : "
		Leer usuario1
		Escribir "escriba contraña : "
		Leer asdasd
		log= login(usuario1,asdasd,Cont)
		escribir cont
	Fin Mientras
	
	
	
FinAlgoritmo

Funcion return<- login(user, pass , cont Por Referencia)
	Definir return Como Logico
	cont=cont+1
	return = user=="usuario1" y pass=="asdasd"
FinFuncion
	