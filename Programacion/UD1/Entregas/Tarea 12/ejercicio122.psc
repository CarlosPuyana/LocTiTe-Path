Algoritmo Ejercicio122
	Escribir "Dime un nombre"
	Leer nombre
	nombre_minmay=""
	long1=longitud(nombre)
	
	Para i<-0 Hasta long1 Con Paso 1 Hacer
		Si i%2 =0 Entonces
			nombre_minmay<-Concatenar(nombre_minmay, Mayusculas(Subcadena(nombre,i,i)))
		SiNo
			nombre_minmay<-Concatenar(nombre_minmay, Minusculas(Subcadena(nombre,i,i)))
		FinSi
	Fin Para
	Escribir nombre_minmay
	
	
FinAlgoritmo
