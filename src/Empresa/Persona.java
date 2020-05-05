package Empresa;

import java.util.Scanner;

public class Persona {
	protected Scanner sc;
	protected String Nombre;
	protected int Edad;

	public Persona() {
		 sc = new Scanner(System.in);
	
	}
	
	public void caragDatos() {

		System.out.println("Ingrese le nombre del Empledao");
		Nombre = sc.nextLine();
		System.out.println("Ingrese la Edad del empleado");
		Edad = Integer.parseInt(sc.nextLine());
	}
	
	public void ImprimirDatosEmpleado() {
		
		System.out.println("El nombre del empleado es: "+Nombre+" y tiene una edad de: "+Edad);
		
	}
	public void  returnNombre() {
		 System.out.println(Nombre);
	}

}
