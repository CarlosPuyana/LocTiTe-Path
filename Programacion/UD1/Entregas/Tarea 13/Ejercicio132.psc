Algoritmo Ejercicio132
	Definir numero1,numero2 Como Entero;
	Escribir Sin Saltar "Escribe el primer n�mero 1:";
	Leer numero1;
	Escribir Sin Saltar "Escribe el segundo n�mero 2:";
	Leer numero2;
	Si EsMultiplo(numero1,numero2) Entonces
		Escribir numero1," es m�ltiplo de ",numero2;
	SiNo
		Escribir numero1," no es m�ltiplo de ",numero2;
	FinSi
FinAlgoritmo

Funcion multiplo1 <- EsMultiplo(num1,num2)
	Definir multiplo1 Como Logico;
	Si num1 % num2 = 0 Entonces
		multiplo1 <- Verdadero;
	SiNo
		multiplo1 <- Falso;
	FinSi
FinFuncion
