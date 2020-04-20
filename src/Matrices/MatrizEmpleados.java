package Matrices;

import java.util.Scanner;

public class MatrizEmpleados {
	Scanner sc = new Scanner(System.in);
	private String[] Nombres;
	private int[] count;
	private int[][] Dias;
	private int cantidad, dias, faltas, menor;
	private String nom;

	public void CargarDatos() {
		System.out.println("Ingrese Cantidad de Empleados a valorar");
		cantidad = Integer.parseInt(sc.nextLine());
		Nombres = new String[cantidad];
		Dias = new int[cantidad][];
		count = new int[cantidad];

		for (int i = 0; i < Nombres.length; i++) {
			System.out.println("introduzca Nombre del Empleado");
			Nombres[i] = sc.nextLine();

			System.out.println("Cuantos dias falto el empleado? ");
			faltas = Integer.parseInt(sc.nextLine());
			Dias[i] = new int[faltas];
			System.out.println("Ingrese el numero de dia");
			for (int j = 0; j < Dias[i].length; j++) {
				count[i] = faltas;
				Dias[i][j] = Integer.parseInt(sc.nextLine());

			}

		}

	}

	public void Imprimir() {
		for (int i = 0; i < Dias.length; i++) {
			System.out.print(Nombres[i] + " A faltado el dia ");
			for (int j = 0; j < Dias[i].length; j++) {
				System.out.print(Dias[i][j] + ", ");
			}
			System.out.println("con un total de " + count[i] + " dias");
			System.out.println(" ");
		}
	}

	public void ElqueMenosFalto() {
		for (int i = 0; i < count.length-1; i++) {
			if (count[i] < count[i + 1]) {
				menor = count[i];
				nom = Nombres[i];

			}
		}
		System.out.println("El empleado que menos falto fue "+ nom + " con solo "+menor+" inasistencias");
	}

	public static void main(String[] args) {
		MatrizEmpleados ss = new MatrizEmpleados();
		ss.CargarDatos();
		ss.Imprimir();
		ss.ElqueMenosFalto();
	}
}
