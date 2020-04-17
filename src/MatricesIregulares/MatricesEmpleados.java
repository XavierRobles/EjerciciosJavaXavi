package MatricesIregulares;

import java.util.Scanner;

public class MatricesEmpleados {
	Scanner sc = new Scanner(System.in);
	private String[] Nombres;
	private int [][] Dias;
	private String nom;
	private int empleados,faltan,cantidad;
	
	public void CargarDatos() {
		
		System.out.println("Ingrese Cantidad de empleados que va a inspecioanar");
		
		cantidad= Integer.parseInt(sc.nextLine());
		Nombres = new String [cantidad];
		for (int i = 0; i < Nombres.length; i++) {
			System.out.println("Ingrese el nombre "+(i+1));
			Nombres[i] = sc.nextLine();
			
		}
		
	}
	public static void main(String[] args) {
		MatricesEmpleados ss = new MatricesEmpleados();
		ss.CargarDatos();
	}
}


