Algoritmo Ej2
	
	Escribir "Por favor, introduzca un n�mero entero positivo: "
	Leer numEntero
	Escribir "Introduzca la posici�n dentro del n�mero: "
	Leer numPosi
	Escribir "Introduzca el nuevo d�gito: "
	Leer numNuevo
	
	long<-longitud(numEntero)
	
	
	numNew <- Subcadena(numEntero,1,numPosi-1)
	numNew2 <- Subcadena(numEntero,numPosi+1,long)
	numNew3 <- Concatenar(Concatenar(numNew,numNuevo),numNew2)
	Escribir numNew3
	
	
FinAlgoritmo
