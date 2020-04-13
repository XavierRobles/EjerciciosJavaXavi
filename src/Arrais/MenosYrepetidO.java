package Arrais;

import java.util.Arrays;
import java.util.Scanner;

public class MenosYrepetidO {
	Scanner sc = new Scanner(System.in);
	private int[] Elementos;
	private int cantidad, cant;

	public void PedirDatos() {
		System.out.println("Ingrese cantidad de elenentos");
		cantidad = Integer.parseInt(sc.nextLine());
		Elementos = new int[cantidad];

		for (int i = 0; i < Elementos.length; i++) {
			System.out.println("Imgrese el Elemento " + (i + 1));
			Elementos[i] = Integer.parseInt(sc.nextLine());

		}
		System.out.println(Arrays.toString(Elementos));
	}

	public void Ejecucion() {
		int aux = 0;

		for (int i2 = 0; i2 < Elementos.length - 1; i2++) {
			for (int j = 0; j < Elementos.length - i2 - 1; j++) {
				if (Elementos[j] > Elementos[j + 1]) {
					aux = Elementos[j];
					Elementos[j] = Elementos[j + 1];
					Elementos[j + 1] = aux;

				}

			}

		}

		System.out.println(Arrays.toString(Elementos));

	}

	public void Comparacion() {
		int menor = Elementos[0];
		for (int i = 0; i < Elementos.length; i++) {
			if (Elementos[i] < menor) {
				menor = Elementos[i];

			}

		}
		for (int j = 0; j < Elementos.length; j++) {
			if (Elementos[j] == menor) {
				cant++;

			}

		}
		if (cant > 1) {

			System.out.println("El  elento menor es " + menor + " y se repite: " + " veces que aparece " + cant);
		} else
			System.out.println("El  elento menor es " + menor + " y no se repite: " + " veces que aparece " + cant);
	}

	public static void main(String[] args) {
		MenosYrepetidO ss = new MenosYrepetidO();
		ss.PedirDatos();
		ss.Ejecucion();
		ss.Comparacion();
	}
}
