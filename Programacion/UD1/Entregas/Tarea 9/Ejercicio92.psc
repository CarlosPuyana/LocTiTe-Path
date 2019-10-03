Algoritmo Ejercicio92
	
	Dimension numeritos[5];
	definir numeritos, suma como entero;
	definir media como real;
	suma <- 0;
	definir i como entero;
	
	Para i <- 1 hasta 5 con paso 1 hacer
		Escribir "Escriba un número: ";
		leer numeritos[i];
	FinPara
	
	Para i <- 1 hasta 5 con paso 1 Hacer
		suma <- suma + numeritos[i];
	FinPara
	
	Escribir "La suma de los numeros es: ", suma;
	media <- suma/5;
	Escribir "El promedio es: ", media;
	
	
	
FinAlgoritmo
