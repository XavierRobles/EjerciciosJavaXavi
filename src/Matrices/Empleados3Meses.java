package Matrices;

import java.util.Scanner;

public class Empleados3Meses {
	Scanner sc = new Scanner(System.in);
	private String[] Nombres;
	private int[][] SueldosMeses;
	private int[] TotaSueldos;
	private int cantidad, Sueldo, suma, mayor;
	private String nombre;

	private void NombresEmpleados() {
		System.out.println("ingrese la cantidad de Empleados");
		cantidad = Integer.parseInt(sc.nextLine());
		Nombres = new String[cantidad];
		SueldosMeses = new int[cantidad][3];
		for (int i = 0; i < Nombres.length; i++) {
			System.out.println("Ingrese el nombre " + (i + 1));
			Nombres[i] = sc.nextLine();
			for (int j = 0; j < SueldosMeses[i].length; j++) {
				System.out.println("Ingrese el Sueldo de mes " + (j + 1));
				SueldosMeses[i][j] = Integer.parseInt(sc.nextLine());

			}

		}

	}

	private void CalcularSumaSueldos() {
		TotaSueldos = new int[cantidad];
		for (int i = 0; i < SueldosMeses.length; i++) {
			suma = 0;
			for (int j = 0; j < SueldosMeses[i].length; j++) {

				suma += SueldosMeses[i][j];

			}

			TotaSueldos[i] = suma;

		}

	}

	private void CalcularSueldoMayor() {
		System.out.println("Salario total Por Trimestre");
		for (int i = 0; i < TotaSueldos.length; i++) {
			System.out.println(Nombres[i] + " --- " + TotaSueldos[i]);
		}

	}

	private void elMayor() {
		for (int i = 0; i < TotaSueldos.length; i++) {
			if (TotaSueldos[i] > mayor) {
				mayor = TotaSueldos[i];
				nombre = Nombres[i];

			}

		}

		System.out.println("El empledado que mas ha cobrado es: " + nombre + " Con un Sueldo de: "+mayor);
	}

	public static void main(String[] args) {
		Empleados3Meses dd = new Empleados3Meses();
		dd.NombresEmpleados();
		dd.CalcularSumaSueldos();
		dd.CalcularSueldoMayor();
		dd.elMayor();
	}
}
