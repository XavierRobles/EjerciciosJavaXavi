package EESS;

import java.util.Scanner;

public class Matrices {
	Scanner sc = new Scanner(System.in);
	private int[][] Matrix;

	private void CargarDato() {
		Matrix = new int[3][5];
			
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Ingresa datos de la matriz");
				Matrix[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(Matrix[i][j]+"-");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Matrices dd = new Matrices();
		dd.CargarDato();
	}
}
