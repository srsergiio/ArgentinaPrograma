Algoritmo ejecicio9
//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//			
//		El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//			de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además,
//			
//			2
//			debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
	//				festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.
	Definir Hdiurnas,Hnocturnas,hora Como Entero
	Definir nombre  ,apellido  , dia,DFestivo Como Caracter
	definir sueldo Como Real
	
	
	Escribir "establesca Precio X/Hora Diurna"
	Leer Hdiurnas
	Escribir "establesca Precio X/Hora Nocturna"
	Leer Hnocturnas
	Escribir  "es dias festivo ?"
	leer DFestivo
	
	nombre=""
	apellido=""
	dia=""
	registro(nombre ,apellido , dia  )
	
	hora=0
	sueldo=0
	Salario(Hdiurnas,Hnocturnas,hora ,sueldo,DFestivo)
	

	Escribir "Nombre Completo : ", nombre ," ",apellido," Dia : ", dia," HorasTrabajadas : ",hora," Salario : $",sueldo
	
FinAlgoritmo
Funcion  registro(nombre Por Referencia,apellido Por Referencia, dia Por Referencia )
	Escribir "Nombre del Trabajador : "
	Leer nombre
	Escribir "Apellido del Trabajador : "
	Leer apellido
	Escribir "Dia de Trabajado : "
	Leer Dia
FinFuncion

Funcion  Salario(Hdiurnas,Hnocturnas,hora Por Referencia,sueldo Por Referencia,DFestivo)
	Definir horaE,horaS,HorasD,HorasN,i,return  Como Entero

	

	Escribir "Hora de Entrada : "
	Leer horaE
	Escribir "Hora de Salida : "
	Leer horaS
	i=horaE
	HorasD=0
	HorasN=0
		Mientras i<>horaS Hacer
			Si i>=1800 y i<=2400 o i>=0000 y i<=0600   Entonces
				HorasN=HorasN+1
				si i==2400 Entonces
					i=0000
				FinSi
			SiNo
				HorasD=HorasD+1
			Fin Si
			i=i+0100
		Fin Mientras
	
	Escribir "Horas Nocturnas : ",HorasN
	Escribir "Horas Diurnas : ",HorasD
	hora = HorasN +HorasD
	Si Minusculas(DFestivo)=="si" Entonces
		sueldo = (HorasN*Hnocturnas)*1.15+(HorasD*Hdiurnas)*1.10
	SiNo
		sueldo = (HorasN*Hnocturnas)+(HorasD*Hdiurnas)
	Fin Si
	sueldo= sueldo
	
FinFuncion

