package U3.Tarea4;

import java.util.Scanner;

public class CarlosPuyana_ej9 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int apuesta[] = new int[6];
	int ganador[] = { 01, 23, 29, 31, 35, 42 };
	int aciertos = 0;
	
	for (int i = 0; i < 6; i++){
		System.out.println("Introduzca numero de la posicion " + (i+1));
		apuesta[i] = teclado.nextInt();
		if (apuesta[i]==ganador[i]){
			aciertos++;
		}
	}

	System.out.println("Has acertado:  " + aciertos + " numeros");
	}

}
