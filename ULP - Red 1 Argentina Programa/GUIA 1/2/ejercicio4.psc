Algoritmo ejercicio4
//	Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil. El 
//	usuario ingresar� una cantidad de litros de combustible cargados en la estaci�n y una 
//	cantidad de kil�metros recorridos, sabiendo que por cada 100km el autom�vil consume 10 
//	litros de combustible, despu�s, el programa calcular� el consumo (km/lt) y se lo mostrar� 
	//	al usuario.
	
	Definir litros,kilometros Como Real
	Escribir "Ingrese cantidad de litros de combustibles : "
	leer litros
	Escribir "Ingrese cantidad de kilometros recorridos : "
	leer kilometros
	//100km=10l => 10=1 => 1km=0.10
	Escribir " usted a tenido un gasto " (kilometros*10/100) " litros y le quedan :" litros - (kilometros*10/100)
FinAlgoritmo
