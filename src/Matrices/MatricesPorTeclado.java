package Matrices;

import java.util.Scanner;

public class MatricesPorTeclado {
	Scanner sc = new Scanner(System.in);
	private int[][] Matrix;
	private int filas, col;

	private void PedirDatos() {

		System.out.println("Ingrese cuantas filas");
		filas = sc.nextInt();
		System.out.println("Ingrese numero de columnas");
		col = sc.nextInt();
		Matrix = new int[filas][col];
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				System.out.println("Ingrese valor");
				Matrix[i][j] = sc.nextInt();

			}
		}
	}

	
	private void imprimirMatriz() {
		System.out.println("Matriz completa");
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				System.out.print(Matrix[i][j]+" ");
				
			}
			System.out.println(" ");
		}
	}
	
	private void ImprimirLaultimaFila() {
		System.out.println("************************************");
		System.out.println("Ultima fila");
			for (int j = 0; j < Matrix[Matrix.length-1].length; j++) {
				
				System.out.print(Matrix[Matrix.length-1][j]+" ");
			
			
		}
	}
	
	public static void main(String[] args) {
		MatricesPorTeclado dd = new MatricesPorTeclado();
		dd.PedirDatos();
		dd.imprimirMatriz();
		dd.ImprimirLaultimaFila();
	}	
}
