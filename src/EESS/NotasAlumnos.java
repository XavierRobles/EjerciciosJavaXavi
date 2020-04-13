package EESS;

import java.util.Scanner;


public class NotasAlumnos {

	Scanner sc = new Scanner(System.in);

	private String[] Nombres;
	private int[] Notas;
	private String nom, auxNombre;
	private int cantidades, Not, auxNota;

	private void PedirDatos() {
		System.out.println("Ingrese el numero de alumnos para evaluar ");
		cantidades = Integer.parseInt(sc.nextLine());
		Nombres = new String[cantidades];
		Notas = new int[cantidades];

		for (int i = 0; i < Nombres.length; i++) {
			System.out.println("Ingrese Nombres " + (i + 1));
			Nombres[i] = sc.nextLine();
			System.out.println("Ingrese Nota " + (i + 1));
			Notas[i] = Integer.parseInt(sc.nextLine());

		}

	}

	private void Ordenar() {

		for (int i = 0; i < Notas.length-1; i++) {

			for (int j = 0; j < Notas.length-1-i; j++) {
				if (Notas[j] < Notas[j + 1]) {
					auxNota = Notas[j];
					Notas[j] = Notas[j + 1];
					Notas[j+1] = auxNota;
					
					auxNombre = Nombres[j];
					Nombres[j] = Nombres[j+1];
					Nombres[j+1] = auxNombre;
				}
			}
		}
		for (int i = 0; i < Nombres.length; i++) {
			System.out.println(Nombres[i]+" tiene una nota de "+Notas[i]);
		}

	}
	
	

	public static void main(String[] args) {
		NotasAlumnos Controlador = new NotasAlumnos();
		Controlador.PedirDatos();
		Controlador.Ordenar();
		
	}
}
