Algoritmo Ejercicio96
	
	
	Dimension bloque1[10, 2]
	
	Para x<-1 hasta 10 hacer
		Escribir "Escribe 10 numeros"
		Leer bloque1[x,1]
	FinPara
	
	maximo<-0
	
	Para x<-1 hasta 10 hacer
		Si maximo < bloque1[x, 1] Entonces
			maximo=bloque1[x, 1]
		FinSi
	FinPara
	
	maximo2<-0
	
	Para x<-1 hasta 10 hacer
		Escribir "Escribe 10 numeros"
		Leer bloque1[x,2]
	FinPara
	Para x<-1 hasta 10 hacer
		Si maximo < bloque1[x, 2] Entonces
			maximo=bloque1[x, 2]
		FinSi
	FinPara
	
	Si maximo<maximo2 Entonces
		Escribir "El mayor numero es " , maximo2
	SiNo
		Si maximo2<maximo Entonces
			Escribir "El mayor numero es ", maximo
		
		FinSi
	FinSi
	
FinAlgoritmo
