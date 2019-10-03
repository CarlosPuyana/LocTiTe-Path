Algoritmo Ejercicio121
	
	Escribir "Dime un nombre"
	Leer nombre
	nombrealreves=""
	
	long1=longitud(nombre)
	
	
	
	Para i<-long1 Hasta 0 Con Paso -1 Hacer
		nombrealreves<- Concatenar(nombrealreves,subcadena(nombre,i,i))		
	Fin Para
	Escribir nombrealreves
	
FinAlgoritmo
