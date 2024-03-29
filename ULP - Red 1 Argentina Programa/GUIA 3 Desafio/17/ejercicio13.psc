Algoritmo practica17
	
	menu()
	
FinAlgoritmo

SubProceso menu()
	definir opMenu como entero
	Hacer
		Escribir "--------------------------------------------------------------"
		Escribir "Ingrese una opcion del menu (1-9)"
		Escribir "1 - Calcular muro de ladrillo"
		Escribir "2 - Calcular viga de hormig�n"
		Escribir "3 - Calcular columnas de hormig�n"
		Escribir "4 - Calcular contrapisos"
		Escribir "5 - Calcular techo"
		Escribir "6 - Calcular pisos"
		Escribir "7 - Calcular pintura"
		Escribir "8 - Calcular iluminaci�n"
		Escribir "9 - Salir"
		leer opMenu
		Escribir "--------------------------------------------------------------"
		segun opMenu 
			
			1:
				calcularMuro()//sergio
			2:
				calcularViga() //natalia
			3:
				calcularColumna() //lucino
			4:
				calcularContrapisos() //yamil
			5:
				calcularTecho()  //agusto
			6:
				calcularPisos()//augusto
			7:
				calcularPintura() //sergio
			8:
				calcularIluminacion() //diego
			9:
				escribir "**Saliendo**"
				
		FinSegun
		
	Mientras Que opMenu<>9
	
FinSubProceso
//---------------------------------------------
Funcion retorno = calcularVolumen(a,b,c)
	definir retorno como real
	retorno = a*b*c
FinFuncion

Funcion  retorno<-calcularSuperficie(largo,alto)
	Definir  retorno Como Real
	retorno = largo*alto
FinFuncion
//---------------------------------------------
SubProceso calcularMuro()
	Definir espesor,largo,alto Como Entero
	
	Escribir "confirme el espesosor 20 o 30 :" 
	leer espesor
	Escribir ""
	Escribir "medidas del LARGO del muro : " 
	Leer largo
	Escribir ""
	Escribir "medidas del ALTO del muro : " 
	Leer alto
	
	
	//si eligio 30cm 
	Si espesor==30 Entonces
		Escribir ""
		Escribir "cemento : ",calcularSuperficie(largo,alto)*15.2 
		Escribir "arena : ",calcularSuperficie(largo,alto)*0.115
		Escribir "ladrillos : ",calcularSuperficie(largo,alto)*120 
		Escribir ""
	sino
		//si eligio 20cm 
		Si espesor==20 Entonces
			Escribir ""
			Escribir "cemento : ",calcularSuperficie(largo,alto)*10.9 
			Escribir " arena : ",calcularSuperficie(largo,alto)*0.09
			Escribir "ladrillos : ",calcularSuperficie(largo,alto)*90 
			Escribir ""
		FinSi
	Fin Si
	
FinSubProceso



SubProceso calcularViga()
	Definir largodeviga ,cementoviga, arenaviga, piedraparaviga, hierrodel8paraviga, hierrodel4paraviga Como real
	Escribir "ingrese largo de viga (en metros):" 
	leer largodeviga
	
	cementoviga=largodeviga*9
	arenaviga=largodeviga*0.02
	piedraparaviga=largodeviga*0.02
	hierrodel8paraviga=largodeviga*4
	hierrodel4paraviga=largodeviga*3
	
	escribir "lista de materiales para la viga:"
	escribir "-cemento: " cementoviga " Kg. "
	escribir "-arena: " arenaviga "m3."
	escribir "-piedra: " piedraparaviga " m3. "
	escribir "-hierrodel8: " hierrodel8paraviga "m."
	escribir "-hierrodel4: " hierrodel8paraviga "m."

FinSubProceso
SubProceso calcularColumna()
	Definir i, largo_columna Como Entero
	Definir cant_cemento, cant_arena, cant_piedra, metros_hierro_10, metros_hierro_4 Como Real
	cant_cemento = 0
	cant_arena = 0
	cant_piedra = 0
	metros_hierro_10 = 0
	metros_hierro_4 = 0
	
	Escribir "Ingrese la cantidad de metros del largo de la columna"
	Leer largo_columna
	
	para i = 1 Hasta largo_columna Hacer
		cant_cemento = cant_cemento + 7.5
		cant_arena = cant_arena + 0.016
		cant_piedra = cant_piedra + 0.016
		metros_hierro_10 = metros_hierro_10 + 6
		metros_hierro_4 = metros_hierro_4 + 3
	FinPara
	
	Imprimir "------------------------------------------------------------------"
	Imprimir "Largo de la columna: ", largo_columna " metros"
	Imprimir "La cantiadd de cemento que se necesita es :", cant_cemento " KG"
	Imprimir "La cantiadd de arena que se necesita es :", cant_arena " m3"
	Imprimir "La cantiadd de piedra que se necesita es :", cant_piedra " m3"
	Imprimir "Largo de metros de hierro 10 es: ", metros_hierro_10 " metros"
	Imprimir "Largo de metros de hierro 4 es: ", metros_hierro_4 " metros"
	Imprimir "------------------------------------------------------------------"
FinSubProceso
SubProceso calcularContrapisos()
	Definir espesor, largo, ancho Como Entero
	Definir mc, cemento, arena, piedra Como Real
	largo=0
	ancho=0
	espesor=0
	Escribir "Ingrese el espesor del contra piso: "
	leer espesor
	Escribir "Ingrese el ancho del contra piso: " 
	leer ancho
	Escribir "Ingrese el largo del contra piso: " 
	leer largo
	mc=largo*ancho*espesor
	Escribir "La cantidad de metros cubicos es: " mc " m3"
	
	cemento=105*mc
	arena=0.45*mc
	piedra=0.9*mc
	
	Escribir "La cantidad de mater�ales a usar es: " cemento " kg de cemento ", arena " de arena y " piedra " de piedra"
	Escribir  "bolsas de cemento : ",cemento/50
FinSubProceso
SubProceso calcularTecho()
	definir ancho,largo como real
	definir espesor Como real
	
	escribir "ingrese ancho"
	leer ancho
	escribir "ingrese largo"
	leer largo
	escribir "ingrese espesor"
	leer espesor
	
	escribir calcularVolumen(ancho,largo,espesor)*33," Kg de cemento"
	escribir calcularVolumen(ancho,largo,espesor)*0.072," m3 de arena"
	escribir calcularVolumen(ancho,largo,espesor)*0.072," m3 de piedra"
	escribir calcularVolumen(ancho,largo,espesor)*7," M de hierro del 8"
	escribir calcularVolumen(ancho,largo,espesor)*4," M de hierro del 6"
FinSubProceso
SubProceso calcularPisos()
	definir ancho,largo Como Real
	definir total Como Real
	
	escribir "ingrese ancho"
	leer ancho
	escribir "ingrese largo"
	leer largo
	
	total = calcularSuperficie(ancho,largo)
	
	escribir "superficie: ",total
	Escribir "extra: ",total*1/10
	escribir "total: ",total+(total*1/10), "m2"
FinSubProceso

SubProceso calcularPintura()
	Definir largo,alto Como Entero
	Escribir "medidas del LARGO del muro : " 
	Leer largo
	Escribir "medidas del ALTO del muro : " 
	Leer alto
	Escribir ""
	escribir "pintura : " , calcularSuperficie(largo,alto)/6," litro"
FinSubProceso

SubProceso calcularIluminacion()
	definir largo,ancho Como Real
	escribir "Ingrese el largo del area a iluminar"
	leer largo
	escribir "Ingrese el ancho del area a iluminar"
	leer ancho
	
	Escribir "La cantidad minima de iluminacion natural necesaria es de: " calcularSuperficie(largo,ancho)*0.2	
	
FinSubProceso
	