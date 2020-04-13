package EESS;

import java.util.Scanner;

public class MatrcesDiagonales {
	Scanner sc = new Scanner(System.in);

	private String[][] Matrix;

	private void IntroducirDatos() {

		Matrix = new String[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Matrix[i][j] = sc.nextLine();
			}

		}

	}

	private void Imprimir() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(Matrix[i][j]+" ");

			}
			System.out.println("");
		}
		
	}
	private void ImprimirLaDiagonal() {
System.out.println("---------------");
		for (int i = 0; i < 4; i++) {
			System.err.print(Matrix[i][i]+ " ");
		}
	}
	public static void main(String[] args) {
	MatrcesDiagonales dd = new MatrcesDiagonales();
	dd.IntroducirDatos();
	dd.Imprimir();
	dd.ImprimirLaDiagonal();
	}
}
