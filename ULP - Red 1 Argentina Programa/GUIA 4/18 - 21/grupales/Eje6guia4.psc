

Algoritmo  ejercicio6
	
	Definir  frase , letra, vector Como Caracter
	Definir  i , var_long, var_pos Como Entero
	
	
	var_long  =  0
	var_pos  =  - 1
	
	Dimension  vector(20)
	
	Mientras  var_long > 20 o var_long = 0
		Escribir  "Ingrese una frase no mayor a 20 caracteres" ; Leer frase
		var_long  =  Longitud (frase) ;
	FinMientras
	
	// Colocamos  la  frase  en  el  vector :
	
	Para  i  =  0  Hasta  19
		str_caracter  =  Subcadena (frase , i , i )
		
		Si  letra  =  ""  // si  es  nulo , reemplazamos  con  un  espacio
			letra  =  " "
		finsi
		vector(i) =  letra
	finpara
	
	// solicitamos el caracter
	
	var_long  =  0  
	Mientras  var_long <> 1
		Escribir  "Ingrese un caracter para colocar:" ; Leer carac
		var_long  =  Longitud (letra) ;
	FinMientras
	
	// solicitamos  la  posici ó n  y  reemplaamos  si  el  vector  es  un  espacio  o  es  nulo
	
	Mientras  var_pos < 0 o var_pos > 19
		Escribir  "[ * ] Ingrese una posicion para colocar:" ; Leer var_pos
		
		Si  var_pos  0 "%" var_pos > 20
			Escribir  "[ ERROR ] Escriba una posición de 0 a 19"
		finsi
		Si  vector(var_pos) = " " o vector(var_pos) = ''
		sino
			Escribir  "[Error] Posicion ocupada, elija otra:"
			pos_var= - 1
		finsi
		vector(var_pos) =  letra
		
		Escribir  "[ ! ] Caracter final:"
		
		Para  i  =  0  Hasta  19
			Escribir  Sin Saltar vector(i)
		finpara
		
	FinMientras
	
		
finalgoritmo
