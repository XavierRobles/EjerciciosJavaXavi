package Arrais;

import java.util.Scanner;

public class ElementosVectores {
	Scanner sc = new Scanner(System.in);
	private int[] Elemntos;
	private int Total, Suma, Suma2;

	private void CargarElemntos() {
		Elemntos = new int[8];

		for (int i = 0; i < Elemntos.length; i++) {
			System.out.println("Ingrese elemento");
			Elemntos[i] = sc.nextInt();

		}

	}

	private void CalcularValorMax() {

		for (int i = 0; i < Elemntos.length; i++) {
			Total+= Elemntos[i];
			
		}
		System.out.println("El valor acumulado de los elementos es " + Total);
	}

	private void CalcularMayores() {
		for (int i = 0; i < Elemntos.length; i++) {
			if (Elemntos[i] >= 36 && Elemntos[i]<=50) {
				Suma += Elemntos[i];
			}

			if (Elemntos[i] >= 50) {
				Suma2 += Elemntos[i];
			}

		}
		System.out.println("Valor acumulado de los elementos de tamaño mayor a 36 es " + Suma);
		System.out.println("********************************************");
		System.out.println("Valor acumulado de los elementos de tamaño mayor a 50 es " + Suma2);
		
	}
	public static void main(String[] args) {
		ElementosVectores dd = new ElementosVectores();
		dd.CargarElemntos();
		dd.CalcularValorMax();
		dd.CalcularMayores();
	}
}
