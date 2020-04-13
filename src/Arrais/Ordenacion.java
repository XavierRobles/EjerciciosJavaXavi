package Arrais;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacion {
	Scanner sc = new Scanner(System.in);
	private int[] Vector;
	private int aux;

	private void Pedirdatos() {
		Vector = new int[5];
		for (int i = 0; i < Vector.length; i++) {
			System.out.println("Ingrese elementos");
			Vector[i] = sc.nextInt();

		}

	}

	private void Ordenar() {

	
		for (int i = 0; i < Vector.length-1; i++) {
			
			for (int j = 0; j < Vector.length - i - 1; j++) {

				if (Vector[j] > Vector[j+1]) {
					aux = Vector[j + 1];
					Vector[j + 1] = Vector[j];
					Vector[j] = aux;

				}
			}

			
		}
		for (int i = 0; i < Vector.length; i++) {
			System.out.print(Vector[i]);
		}
		System.out.println("**********************************************************");
		System.out.println(Arrays.toString(Vector));


	}

	public static void main(String[] args) {
		Ordenacion dd = new Ordenacion();
		dd.Pedirdatos();
		dd.Ordenar();
	}

}
