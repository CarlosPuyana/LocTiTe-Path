Algoritmo EJ4
    Definir array, i, respuesta Como Entero
    
    Dimension numAzar[20]
    
    Para i<-1 Hasta 20 Con Paso 1 Hacer
		numAzar[i]<-(azar(401))
        Escribir i+1,"� n�mero: ",numAzar[i]
    FinPara
    
    Escribir Sin Saltar "�Quiere resaltar los m�ltiplos de 5 o los m�ltiplos de 7?"
    Leer resp
    Si resp=5 Entonces
        Para i<-1 hasta 20 con paso 1 hacer
            Si numAzar[i]%5=0 Entonces
                Escribir "[",numAzar[i],"]"
            FinSi
        FinPara
    SiNo
        Si resp=7 Entonces
            Para i<-1 Hasta 20 Con Paso 1 Hacer
                Si numAzar[i]%7=0 Entonces
                    Escribir "[",numAzar[i],"]"
                FinSi
            FinPara
        FinSi
    FinSi
	
FinAlgoritmo
