package MatricesIregulares;

import java.util.Scanner;

public class Irregular1 {

	Scanner sc = new Scanner(System.in);
	private int Matrix[][];
	private int cantidadF,cantidadC;
	
	private void MeterDatos() {

		System.out.println("Ingrese Filas");
		cantidadF = Integer.parseInt(sc.nextLine());

		Matrix = new int [cantidadF][];
		
		for (int i = 0; i < Matrix.length; i++) {
			System.out.println("Fila "+(i+1)+ " Ingrese Columnas de esta fila");
			cantidadC = Integer.parseInt(sc.nextLine());
			
			
			Matrix[i]= new int[cantidadC];
			
			for (int j = 0; j < Matrix[i].length; j++) {
				System.out.println("Ingrese valor de campo");	
				Matrix[i][j]=Integer.parseInt(sc.nextLine());
			}
	
		}
		
	}
	
	
	private void Imprimir() {
		
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Irregular1 dd = new Irregular1();
		dd.MeterDatos();
		dd.Imprimir();
	}	
}
