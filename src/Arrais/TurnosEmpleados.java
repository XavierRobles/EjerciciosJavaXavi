package Arrais;

import java.util.Scanner;

public class TurnosEmpleados {
	Scanner sc = new Scanner(System.in);
	private int[] Mañana, Tarde;
	private int SumaM,SumaT;
	

	private void IngresarSueldosMañana() {
		Mañana = new int [4];
		Tarde = new int [4];
		for (int i = 0; i < Mañana.length; i++) {
			System.out.println("ingrese sueldo de los empleados de la mañana");
			Mañana[i]=sc.nextInt();	
			SumaM+=Mañana[i];
		}
		for (int i = 0; i < Tarde.length; i++) {
			System.out.println("ingrese sueldo de los empleados de la Tarde");
			Tarde[i]=sc.nextInt();
			SumaT+=Tarde[i];
		}
		System.out.println("Gasto total en sueldos de la mañanas "+SumaM+"€");
		System.out.println("********************************************");
		System.out.println("Gasto total en sueldos de la tardes "+SumaT+"€");
		System.out.println("********************************************");
	}
	
	public static void main(String[] args) {
		TurnosEmpleados dd = new TurnosEmpleados();
		dd.IngresarSueldosMañana();
	}
}
