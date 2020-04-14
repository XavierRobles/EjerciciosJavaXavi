package Matrices;

import java.util.Scanner;

public class MatricesIngresarDatos {
	Scanner sc = new Scanner(System.in);
	private int[][] Matrix;
	private int Filas, Columnas;

	private void PedirDatos() {
		System.out.println("ingrese Cantidad de filas");
		Filas = sc.nextInt();
		System.out.println("Ingrese cantidad de columnas");
		Columnas = sc.nextInt();
		Matrix = new int[Filas][Columnas];

		
		for (int i = 0; i < Columnas; i++) {
			for (int j = 0; j < Filas; j++) {
				System.out.println("Introduzca valor");
				Matrix[j][i]=sc.nextInt();
				
			}
			
			
		}
	}
	
	private void Imprimir() {

		for (int i = 0; i < Filas; i++) {
			for (int j = 0; j < Columnas; j++) {
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		MatricesIngresarDatos dd = new MatricesIngresarDatos();
		
		dd.PedirDatos();
		dd.Imprimir();
	}
}
