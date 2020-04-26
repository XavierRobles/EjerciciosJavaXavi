package MatricesIregulares;

import java.util.Scanner;

public class MatricesIrregulares2 {

	Scanner sc = new Scanner(System.in);
	private int[][] Matrix;
	private int filas, columnas, valor;

	public void Datos() {
		System.out.println("Ingrese Cuantas filas va a tener la Matriz");
		filas = Integer.parseInt(sc.nextLine());

		Matrix = new int[filas][];

		for (int i = 0; i < Matrix.length; i++) {
			System.out.println("Introduzca cuantas columnas tendra la fila " + (i + 1));
			columnas = Integer.parseInt(sc.nextLine());

			Matrix[i] = new int[columnas];
			for (int j = 0; j < Matrix[i].length; j++) {
				System.out.println("Introduzca valor del campo " + (j + 1));
				Matrix[i][j] = Integer.parseInt(sc.nextLine());

			}

		}

	}
	
	public void Imprimir() {
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		MatricesIrregulares2 dd = new MatricesIrregulares2();
		dd.Datos();
		dd.Imprimir();
	}
}
