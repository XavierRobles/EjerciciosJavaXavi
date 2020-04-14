package Matrices;

import java.util.Scanner;

public class MatrizElementoMayor {
	Scanner sc = new Scanner(System.in);

	private int[][] Matrix;
	private int FilaM, ColM, fila, col;

	private void Datos() {
		System.out.println("Ingrese Filas");
		fila = sc.nextInt();
		System.out.println("Ingrese Columnas");
		col = sc.nextInt();
		Matrix = new int[fila][col];
		

	}
	
	private void MeterDatos() {
		System.out.println("Ingrese valores");
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				
				Matrix[i][j]=sc.nextInt();
			}
			
		}
	}
	
	private void ImprimirMatriz() {
		System.out.println("Matriz Completa");
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	private void LocalizarMayor() {
		int mayor = Matrix[0][0];
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				if (Matrix[i][j]>mayor) {
					mayor = Matrix[i][j];
					FilaM = i;
					ColM = j;
					
					
				}
				
			}
			
		}
		System.out.println(" el mayor elemento es: "+mayor+" y esta en la fila "+FilaM+" de la columna: "+ColM );
	}

	public static void main(String[] args) {
		MatrizElementoMayor dd = new MatrizElementoMayor();
		dd.Datos();
		dd.MeterDatos();
		dd.LocalizarMayor();
		dd.ImprimirMatriz();
	}
}
