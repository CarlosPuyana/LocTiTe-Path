Algoritmo Ejercicio94
	Definir x,z,i,suma Como Entero
	Dimension x[3]
	Dimension z[3]
	Escribir "Dime los componentes del primer vector (X, Z, Y)"
	
	Para i<-1 hasta 3 hacer
		Leer x[i]
	FinPara
	
	Escribir "Dime los componentes del segundo vector (X, Z, Y)"
	
	Para i<-1 hasta 3 Hacer
		Leer z[i]
	FinPara
	
	Para i<-1 hasta 3 Hacer
		suma=x[i]+z[i]
		Escribir suma
	FinPara
	
	
FinAlgoritmo
