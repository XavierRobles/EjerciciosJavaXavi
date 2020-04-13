package Cadenas;

import java.util.Scanner;

public class SoicitarApenon {
	Scanner sc = new Scanner(System.in);
	private String Nombre1, Nombre2;
	private int Edad1, Edad2;

	public void PedirDatos() {
		System.out.println("Introduzca su nombre y apellido");
		Nombre1 = sc.nextLine();
		System.out.println("ingrese su Edad: ");
		Edad1 = sc.nextInt();

	}

	public void PedirDatos2() {
		System.out.println("Introduzca su nombre y apellido");
		sc.nextLine(); //para evitar el error de un line a int seguido
		Nombre2 = sc.nextLine();
		System.out.println("ingrese su Edad: ");
		Edad2 = sc.nextInt();

	}

	public void MostrarDatos() {
		System.out.println("El nombre ingresado es: " + Nombre1 + " y Tiene une edad de: " + Edad1);
		System.out.println("El nombre ingresado es: " + Nombre2 + " y Tiene une edad de: " + Edad2);
		if (Edad1 >= Edad2) {
			System.out.println("La persona mayor es: " + Nombre1 + " Con un edad de: " + Edad1);

		} else
			System.out.println("La persona mayor es: " + Nombre2 + " Con un edad de: " + Edad2);
	}

	public static void main(String[] args) {
		SoicitarApenon ss = new SoicitarApenon();
		ss.PedirDatos();
		ss.PedirDatos2();
		ss.MostrarDatos();
		
	}
}
