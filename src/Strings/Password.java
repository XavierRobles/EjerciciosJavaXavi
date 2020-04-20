package Strings;

import java.util.Scanner;

public class Password {
	Scanner sc = new Scanner(System.in);
	private String clave,origi="abcd123";

	private void Pedirclave() {
		System.out.println("Ingrese la clave");
		clave=sc.nextLine();
		Comparar();
	}

	private void Comparar() {
		if (clave.equals(origi)) {
			System.out.println("Correcto");
			
		}else
			System.out.println("Error");
	}
public static void main(String[] args) {
	Password ss = new Password();
			ss.Pedirclave();
	
}
}
