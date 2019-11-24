package U3.Tarea4;

import java.util.Arrays;
import java.util.Scanner;

public class CarlosPuyana_ej10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num;

		System.out.println("Introduzca el tamaño de la tabla: ");
		num = teclado.nextInt();
				
		rellenaPares(num);
		teclado.close();
		}
		
	static void rellenaPares(int n) {
		Scanner teclado = new Scanner (System.in);
		int t[] = new int[n];
		int cont = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Introduzca numeros en la posicion " + i + " de la tabla.");
			t[i] = teclado.nextInt();

			if (t[i]%2 != 0) {
				i--;
				cont++;
			}
			}
		System.out.println("El contenido de la tabla es " + Arrays.toString(t));
		System.out.println("El numero de impares desechados es " + cont);
		}
	}


