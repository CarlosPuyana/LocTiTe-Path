Algoritmo Ejercicio123
	Escribir "Introduzca una frase"
	leer frase
	num_palabras<-1
	long1<- Longitud(frase)-1
	para i<-0 hasta long1 Hacer
		Si subcadena(frase,i,i)= " " Entonces
			num_palabras<-num_palabras+1
		FinSi
	FinPara
	Escribir "En esta frase hay ",num_palabras " palabras"
	
	
FinAlgoritmo
