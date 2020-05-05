package Empresa;

import java.util.Scanner;

public class Empleado extends Persona {
	private static final int S = 0;
	protected int Sueldo;
	

	public void CargarSueldo(){
		System.out.println("Ingrese el sueldo del empleado");
		
		Sueldo = Integer.parseInt(sc.nextLine());
		
	}
	
	public void ImprimirSueldo() {	
		System.out.println("El sueldo es "+ Sueldo);
	}

	public static void main(String[] args) {
		
		Empleado Emple1 = new Empleado();
		Persona persona1 = new Persona();
		persona1.caragDatos();
		persona1.ImprimirDatosEmpleado();
		Emple1.CargarSueldo();
		Emple1.ImprimirSueldo();
		
	}
}
