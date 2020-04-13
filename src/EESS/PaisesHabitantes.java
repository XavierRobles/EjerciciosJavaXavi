package EESS;

import java.util.Scanner;

public class PaisesHabitantes {
	Scanner sc = new Scanner(System.in);
	private String[] Paises;
	private int[] Habitantes;
	private String AuxPaises;
	private int AuxHabitantes, cantidad,ex=0;;

	private void PedirDatos() {
		do {
			
		
		try {
			ex=0;
			System.out.println("Ingrese El numero de Paises que quiere Ordenar\n");
			cantidad = Integer.parseInt(sc.nextLine());
			
			
		} catch (Exception e) {
			System.err.println("Error introduzca un numero positivo\n");
			ex++;
		}
		} while (ex!=0);
		Paises = new String[cantidad];
		Habitantes = new int[cantidad];
		for (int i = 0; i < Paises.length; i++) {
			System.out.println("Ingrese el Pais");
			Paises[i] = sc.nextLine();
			System.out.println("Ingrese los Habitantes");
			Habitantes[i] = Integer.parseInt(sc.nextLine());

		}

	}

	private void OrdenacionPais() {
		for (int i = 0; i < Paises.length - 1; i++) {
			for (int j = 0; j < Habitantes.length - 1 - i; j++) {
				if (Paises[j].compareTo(Paises[j + 1]) > 0) {
					AuxPaises = Paises[j];
					Paises[j] = Paises[j + 1];
					Paises[j + 1] = AuxPaises;

					AuxHabitantes = Habitantes[j];
					Habitantes[j] = Habitantes[j + 1];
					Habitantes[j + 1] = AuxHabitantes;
				}
			}
		}
	}

	private void OrdenacionHabitantes() {
		for (int i = 0; i < Habitantes.length - 1; i++) {
			for (int j = 0; j < Habitantes.length - 1 - i; j++) {
				if (Habitantes[j] > Habitantes[j + 1]) {
					AuxHabitantes = Habitantes[j];
					Habitantes[j] = Habitantes[j + 1];
					Habitantes[j + 1] = AuxHabitantes;

					AuxPaises = Paises[j];
					Paises[j] = Paises[j + 1];
					Paises[j + 1] = AuxPaises;

				}

			}
		}

	}

	private void ImprimirHabitantes() {
		System.out.println("Ordenado por Habitantes de menor a mayor");
		for (int i = 0; i < Habitantes.length; i++) {

			System.out.print(Paises[i] + " ");
			System.out.print(Habitantes[i] + " ");

		}
		System.out.println();
	}

	private void ImprimirPaise() {
		System.out.println("Ordenado por Paises Alfabeticamente");
		for (int i = 0; i < Paises.length; i++) {

			System.out.print(Paises[i] + " ");
			System.out.print(Habitantes[i] + " ");

		}
		System.out.println();
	}

	public static void main(String[] args) {
		PaisesHabitantes operador = new PaisesHabitantes();
		operador.PedirDatos();
		operador.OrdenacionPais();
		operador.ImprimirPaise();
		operador.OrdenacionHabitantes();
		operador.ImprimirHabitantes();

	}
}
