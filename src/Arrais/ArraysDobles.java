package Arrais;

import java.util.Scanner;

public class ArraysDobles {
	Scanner sc = new Scanner(System.in);

	private int[] Edades;
	private String[] Nombres;
	private int Suma, cantidad, Edad, count;

	private void PedirDatos() {

		System.out.println("Ingrese cantidad de personas");

		cantidad = Integer.parseInt(sc.nextLine());
		Nombres = new String[cantidad];
		Edades = new int[cantidad];

	}

	private void MeterDatos() {

		int mayor = Edades[0];
		for (int i = 0; i < Nombres.length; i++) {
			System.out.println("Ingrese Nombres");
			Nombres[i] = sc.nextLine();
			System.out.println("Ingrese Edad");
			Edades[i] = Integer.parseInt(sc.nextLine());

		}
		for (int i = 0; i < Edades.length; i++) {

			if (Edades[i] >= 18) {
				count++;
				
			}
			
		}

		
		System.out.println("perosonas mayores de edad " + count);

		
		for (int i = 0; i < Edades.length; i++) {
			if (mayor< Edades[i]) {
				
			}
		}
	}

	public static void main(String[] args) {
		ArraysDobles ss = new ArraysDobles();
		ss.PedirDatos();
		ss.MeterDatos();
	}

}
