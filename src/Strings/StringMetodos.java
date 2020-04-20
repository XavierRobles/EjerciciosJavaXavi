package Strings;

import java.util.Scanner;

public class StringMetodos {
	Scanner sc = new Scanner(System.in);
	private String correo, cadena, cadena2, arroba = "@", mitad, mitad2, reverse;
	char caracter;
	private int positivo, count, cant;

	public StringMetodos() {
		do {

			System.out.println("Ingrese una direcion de correo electronico");
			correo = sc.nextLine();
			positivo = correo.indexOf(arroba);
			if (positivo == -1) {
				System.out.println("Introduzca un correo valido");
				count = 0;
			} else
				count++;
		} while (count != 1);
		System.out.println("Su correo es valido");
		System.out.println("La @ esta en la posicion " + (positivo + 1) + " De la direcion de correo");
	}

	private void MetodosdeString() {

		System.out.println("Ingresa uan cadena de texto");
		cadena = sc.nextLine();
		mitad = cadena.substring(0, cadena.length() / 2);
		mitad2 = cadena.substring(cadena.length() / 2, cadena.length());
		System.out.println("La primera mitad de la cadena es " + mitad);
		System.out.println("La segunda mitad de la cadena es " + mitad2);
		caracter = cadena.charAt(cadena.length() - 1);
		System.out.println("El ultimo caracter de la cadena de texto es " + caracter);

		System.out.println("**********REVERSES******************");
		System.out.println("Metodo StringBuldier " + new StringBuilder(cadena).reverse());
		System.out.print("Metodo for ");
		for (int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
		System.out.println();
		for (int i = 0; i < cadena.length() - 1; i++) {
			System.out.print(cadena.charAt(i));

			System.out.print("-");

		}
		System.out.print(cadena.charAt(cadena.length() - 1));
		System.out.println();
		System.out.print("Vocales en la frase ");
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'A' || cadena.charAt(i) == 'a' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'e'
					|| cadena.charAt(i) == 'I' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'O'
					|| cadena.charAt(i) == 'o' || cadena.charAt(i) == 'U' || cadena.charAt(i) == 'u') {
				System.out.print(cadena.charAt(i) + " ");
			}

		}
		System.out.println();

		for (int i = 0; i < cadena.length() / 2; i++) {
			if (cadena.charAt(i) == cadena.charAt(cadena.length() - 1 - i)) {
				cant++;
			}
		}
		if (cant==cadena.length()/2) {
			cant++;
			System.out.println("Es capicua");
		}else
			System.out.println("no es capicua");
	}

	
	

	public static void main(String[] args) {
		StringMetodos ss = new StringMetodos();
		ss.MetodosdeString();

	}

}
