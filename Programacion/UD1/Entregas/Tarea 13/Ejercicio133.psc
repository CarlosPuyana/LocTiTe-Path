Algoritmo Ejercicio132
	Escribir "Introduce un numero"
	Leer numero1
	Escribir EsPar(numero1)
FinAlgoritmo

Funcion resultado <- Espar(numero1)
	Definir resultado como logico
	
	Si numero1%2=0 Entonces 
		resultado <- Verdadero
	SiNo
		resultado <- Falso
	FinSi
FinFuncion
