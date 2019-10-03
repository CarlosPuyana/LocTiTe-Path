Algoritmo sin_titulo
	
	numero1<-AZAR(100)
	
	Escribir "Intenta adivinar el numerito"
	Leer num_adivinado
	
	contador=1
	
	
		
	Mientras num_adivinado!=numero1 Y contador<=7 Hacer
		contador=contador+1
			Si num_adivinado>numero1 Entonces
				Escribir "EL numero es menor, le quedan ", 8-contador " intentos"
				Leer num_adivinado
				
				
			SiNo
				Si num_adivinado<numero1 Entonces
					Escribir "El numero es mayor, le quedan ", 8-contador " intentos"
					Leer num_adivinado
					
				FinSi
			Fin Si
			
			
		Fin Mientras

		
		
		Si contador>7 Entonces
			Escribir "Te quedaste sin intentos"
		FinSi
		
		Si num_adivinado=numero1 Entonces
			Escribir "Adivinaste el numero"
		FinSi
	
	
	
		
		
	
FinAlgoritmo
