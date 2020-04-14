package Matrices;

import java.util.Scanner;

public class MatricesFilasColumnas {
	Scanner sc = new Scanner(System.in);
	private int [][] Matrix;
	
	
	private void MeterDator() {
		Matrix = new int [3][4];
		System.out.println("Ingrese Datos de la matriz");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				Matrix[i][j] = sc.nextInt();
			}
			
			
		}
		
	}
	
	public void ImprimirPrimeraFila() {

		for (int i = 0; i < 4; i++) {

				System.out.print(Matrix[0][i]+" ");
			
		}
	}
	
	public void ImprimirUltimaFila() {
		for (int i = 0; i < 4; i++) {
			System.out.print(Matrix[2][i]+" ");
			
		}
		
	}
	
	public void ImprimirPrimeraColumna() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Matrix[i][0]);
			
		}
		
	}
	
	public static void main(String[] args) {
		MatricesFilasColumnas dd  = new MatricesFilasColumnas();
		dd.MeterDator();
		dd.ImprimirPrimeraFila();
		System.out.println(" ");
		System.out.println("**************************************");
		dd.ImprimirUltimaFila();
		System.out.println(" ");
		System.out.println("**************************************");
		dd.ImprimirPrimeraColumna();
	}
}
