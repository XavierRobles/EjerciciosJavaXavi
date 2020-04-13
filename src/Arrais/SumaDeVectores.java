package Arrais;

import java.util.Scanner;

public class SumaDeVectores {
	Scanner sc = new Scanner(System.in);
	private int[] Vector1, Vector2, Vector3;
	private int Suma;

	private void MeterDatos() {
		Vector1 = new int[4];
		Vector2 = new int[4];
		Vector3 = new int[4];
		System.out.println("*******************Vector 1 ******************");
		System.out.println("Ingrese Valores");

		for (int i = 0; i < Vector1.length; i++) {

			Vector1[i] = sc.nextInt();
		}
		System.out.println("*******************Vector 2 ******************");
		for (int i = 0; i < Vector2.length; i++) {

			Vector2[i] = sc.nextInt();
		}
		System.out.println("*******************Vector 3 ******************");
	}

	private void SumarVectores() {

		for (int i = 0; i < Vector3.length; i++) {
			Vector3[i] = Vector1[i] + Vector2[i];
			System.out.println(Vector3[i]);
			
		}

		System.out.println("*******************Fin**********************");
	}

	public static void main(String[] args) {
		SumaDeVectores dd = new SumaDeVectores();
		dd.MeterDatos();
		dd.SumarVectores();
	}
}
