package Arrais;

import java.util.Scanner;

public class TurnosEmpleados {
	Scanner sc = new Scanner(System.in);
	private int[] Ma�ana, Tarde;
	private int SumaM,SumaT;
	

	private void IngresarSueldosMa�ana() {
		Ma�ana = new int [4];
		Tarde = new int [4];
		for (int i = 0; i < Ma�ana.length; i++) {
			System.out.println("ingrese sueldo de los empleados de la ma�ana");
			Ma�ana[i]=sc.nextInt();	
			SumaM+=Ma�ana[i];
		}
		for (int i = 0; i < Tarde.length; i++) {
			System.out.println("ingrese sueldo de los empleados de la Tarde");
			Tarde[i]=sc.nextInt();
			SumaT+=Tarde[i];
		}
		System.out.println("Gasto total en sueldos de la ma�anas "+SumaM+"�");
		System.out.println("********************************************");
		System.out.println("Gasto total en sueldos de la tardes "+SumaT+"�");
		System.out.println("********************************************");
	}
	
	public static void main(String[] args) {
		TurnosEmpleados dd = new TurnosEmpleados();
		dd.IngresarSueldosMa�ana();
	}
}
