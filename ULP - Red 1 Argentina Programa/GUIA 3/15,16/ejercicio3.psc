Algoritmo ejercicio4
//	Realizar un procedimiento que permita realizar la división entre dos números y muestre el
//	cociente y el resto utilizando el método de restas sucesivas.
//	El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//	obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 ? 13 = 37 una resta realizada
//		37 ? 13 = 24 dos restas realizadas
//		24 ? 13 = 11 tres restas realizadas
	//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
	Definir resultado, cont Como real
	cont=0
	Resultado=0
	restasucesivas(resultado ,cont)
	Escribir "resultado : ",resultado
	Escribir "cont : ",cont

FinAlgoritmo

SubProceso restasucesivas(resultado Por Referencia,cont Por Referencia)
	Definir num1,num2  como real
	Escribir "escribir 2 numero para restarlos"
	Leer num1
	Leer num2
	//50 - 13 >13
	Mientras num1-num2>=num2 Hacer
		cont=cont+1
		num1=num1-num2
		resultado = num1-num2
		
	Fin Mientras
	
FinSubProceso
