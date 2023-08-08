Algoritmo ejercicio4
//	Escribir un programa que calcule cuántos litros de combustible consumió un automóvil. El 
//	usuario ingresará una cantidad de litros de combustible cargados en la estación y una 
//	cantidad de kilómetros recorridos, sabiendo que por cada 100km el automóvil consume 10 
//	litros de combustible, después, el programa calculará el consumo (km/lt) y se lo mostrará 
	//	al usuario.
	
	Definir litros,kilometros Como Real
	Escribir "Ingrese cantidad de litros de combustibles : "
	leer litros
	Escribir "Ingrese cantidad de kilometros recorridos : "
	leer kilometros
	//100km=10l => 10=1 => 1km=0.10
	Escribir " usted a tenido un gasto " (kilometros*10/100) " litros y le quedan :" litros - (kilometros*10/100)
FinAlgoritmo
