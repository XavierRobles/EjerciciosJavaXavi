package Strings;

import java.util.Scanner;

public class CadenaDos {
	Scanner sc = new Scanner(System.in);
	private String cadena1, cadena2,cadena3;
	private char caracter;
	private int Largo,positivo;

	public void PedirCadenas() {
		System.out.println("ingrese Un texto");
		cadena1 = sc.nextLine();
		System.out.println("ingrese Un texto");
		cadena2 = sc.nextLine();
		MetodosComunesString();
	}

	public void MetodosComunesString() {
		if (cadena1.equals(cadena2)) {
			System.out.println("Son Iguales");

		} else
			System.out.println("No son iguales");

		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Son iguales sin tener en cuenta las mayusculas");

		} else
			System.out.println("No son iguales sin tener en cuenta las mayusculas");
		if (cadena1.compareTo(cadena2) == 0) {
			System.out.println("Es exactamente Igual de tamaña alfabetico(Metodo .Compare)");

		} else if (cadena1.compareTo(cadena2) > 0) {
			System.out.println(cadena1 + " es mayor q otra alfabeticamente que " + cadena2);
		}

		caracter = cadena1.charAt(0);
		System.err.println("El primer caracter de " + cadena1 + " es " + caracter);
		System.out.println("*****************************************");
		Largo = cadena1.length();
		System.out.println("El largo de la cadena "+cadena1+" es "+Largo);
		
		cadena3=cadena1.substring(0,3);
		System.out.println("los 3 primero carateres de "+cadena1+" son "+cadena3);
		 positivo=cadena1.indexOf(cadena2);
		 if (positivo==-1) {
			 System.out.println(cadena2+" No esta contenido en " + cadena1);
			
		}else
			System.out.println(cadena2+" Esta contenido en "+cadena1+" Apartir de la posicion "+positivo);
	}

	public static void main(String[] args) {
		CadenaDos dd = new CadenaDos();
		dd.PedirCadenas();
	}
}
