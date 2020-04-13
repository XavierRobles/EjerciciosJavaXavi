package Arrais;

import java.util.Scanner;

public class ArraysOperarios {
	Scanner sc = new Scanner(System.in);
	private String[] Nombres;
	private int[] Sueldos;
	private int mayor, cantidad,posicion;

	public void PedirDatos() {

		System.out.println("Ingrese La cantidad de Operarios a calcular");
		cantidad = Integer.parseInt(sc.nextLine());
		Nombres = new String[cantidad];
		Sueldos = new int[cantidad];
		for (int i = 0; i < Nombres.length; i++) {
			System.out.println("Ingrese Nombre");
			Nombres[i] = sc.nextLine();
			System.out.println("Ingrese el Sueldo del " + Nombres[i]);
			Sueldos[i] = Integer.parseInt(sc.nextLine());
		}
		
		mayor = Sueldos[0]; 
		posicion=0;
		for (int i = 0; i < Nombres.length; i++) {
			if (mayor<Sueldos[i]) {
				mayor = Sueldos[i];
				posicion=i;
				
			}
		}
		System.out.println("El empleado con mayor sueldo es "+Nombres[posicion] +" con un sueldo de "+mayor);
	}

	public static void main(String[] args) {
		ArraysOperarios ss = new ArraysOperarios();
		ss.PedirDatos();
	}
}
