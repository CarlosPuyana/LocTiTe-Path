Algoritmo  Ejercicio131
	Definir text como caracter
	Escribir "Dime una frase para centrar"
	leer frase
	EscribirCentrado(frase)
FinAlgoritmo


SubProceso EscribirCentrado(frase)
	Definir espacios Como Entero
	espacios <-redon(longitud(frase)/2)
	
	Para i <-0 Hasta 40-espacios Hacer
		Escribir Sin Saltar " " 
	FinPara
	Escribir frase
FinSubProceso

