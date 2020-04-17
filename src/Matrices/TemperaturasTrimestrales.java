package Matrices;

import java.util.Scanner;

import javax.swing.JPanel;

public class TemperaturasTrimestrales {
	Scanner sc = new Scanner(System.in);
	private String[] Paises;
	private float[][] TemperaturasMensuales;
	private float[] totalTemperaturas;
	private int cantidades, mesesCantidad;
	private float suma, mayor;
	private String nombre;

	public void CargarDatos() {
		System.out.println("*********************************************");
		System.out.println("Ingrese Cantidad de Paises");
		System.out.println("*********************************************");
		cantidades = Integer.parseInt(sc.nextLine());
		Paises = new String[cantidades];
		System.out.println("*********************************************");
		System.out.println("ingrese de cuantos meses se hara el calculo");
		System.out.println("*********************************************");
		mesesCantidad = Integer.parseInt(sc.nextLine());
		TemperaturasMensuales = new float[cantidades][mesesCantidad];

		for (int i = 0; i < Paises.length; i++) {
			System.out.println("----------------------------------");
			System.out.println("Ingrese el Pais " + (i + 1));
	
			Paises[i] = sc.nextLine();
			
			System.out.println("----------------------------------");
			for (int j = 0; j < TemperaturasMensuales[i].length; j++) {
				System.out.println("Ingrese la Temperatura del mes " + (j + 1));
				TemperaturasMensuales[i][j] = Float.parseFloat(sc.nextLine());
				
			}

		}
	}

	private void ImprimirTemperaturas() {
		System.out.println("*********************************************");
		for (int i = 0; i < Paises.length; i++) {

			for (int j = 0; j < TemperaturasMensuales[i].length; j++) {
				System.out.println(Paises[i] + " mes " + (1 + j) + " ---- " + TemperaturasMensuales[i][j] + " Grados");
				
			}
			System.out.println("---------------------------------------");
		}

	}

	private void CalcularMedia() {
		System.out.println("*********************************************");
		totalTemperaturas = new float[cantidades];

		for (int i = 0; i < TemperaturasMensuales.length; i++) {
			suma = 0;
			for (int j = 0; j < TemperaturasMensuales[i].length; j++) {

				suma += TemperaturasMensuales[i][j];
			}

			totalTemperaturas[i] = suma/mesesCantidad;
		}

	}

	private void Imprimir() {
		System.out.println("Media Trimestral");

		for (int i = 0; i < totalTemperaturas.length; i++) {

			System.out.println(Paises[i] + " ------ " + totalTemperaturas[i] + " Grados");

		}
	}

	private void SacarMayor() {
		System.out.println("*********************************************");
		System.out.print("El mayor es:");
		for (int i = 0; i < totalTemperaturas.length; i++) {
			if (mayor < totalTemperaturas[i]) {
				mayor = totalTemperaturas[i];
				nombre = Paises[i];

			}
		}
		System.out.println(nombre + " ---- " + mayor);
		System.out.println("*********************************************");
	}

	public static void main(String[] args) {
		TemperaturasTrimestrales ss = new TemperaturasTrimestrales();
		ss.CargarDatos();
		ss.ImprimirTemperaturas();
		ss.CalcularMedia();
		ss.Imprimir();
		ss.SacarMayor();
	}
}
