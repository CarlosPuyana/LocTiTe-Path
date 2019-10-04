Algoritmo ej1
	Definir numHoras Como Entero
	Definir restoHoras Como Entero
	
	Escribir Sin Saltar "Introduzca el número de horas trabajadas durante la semana: "
	Leer numHoras
	
	Si numHoras<41 Entonces
		Escribir "El sueldo semanal que le corresponde es de ", numHoras*10
	SiNo
		Si numHoras>40 Entonces
			restoHoras=numHoras-40
			Escribir "El sueldo semanal que le corresponde es de ", 400+(restoHoras*15)
		FinSi
	FinSi
	
FinAlgoritmo
