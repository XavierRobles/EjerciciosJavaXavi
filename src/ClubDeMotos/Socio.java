package ClubDeMotos;

import java.util.Scanner;

public class Socio {
	
	private String nombre;
	int antiguedad;
	
	
	public Socio(Scanner sc) {
		System.out.println("Ingrese el nombre");
		nombre = sc.nextLine();
		System.out.println("Ingrese la antiguedad");
		antiguedad = Integer.parseInt(sc.nextLine());
	
		
	}
	
	public String ReturnNombre() {
		return nombre;
		
	}
	public int RetornarAntigu() {
		return antiguedad;
	}

}
