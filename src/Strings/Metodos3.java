package Strings;

import java.util.Scanner;

public class Metodos3 {
	Scanner sc = new Scanner(System.in);
	private String[] Nombres, Mail;
	private int cantidad, positivo, count1;
	private String nom, nom2, mail;

	public void IngresarDatos() {
		System.out.println("Ingrese cantidad de personas");
		cantidad = Integer.parseInt(sc.nextLine());
		Nombres = new String[cantidad];
		Mail = new String[cantidad];

		for (int i = 0; i < Nombres.length; i++) {
			System.out.println("Ingrese el nombre " + (i + 1));
			Nombres[i] = sc.nextLine();
			System.out.println("Ingrese Email");
			Mail[i] = sc.nextLine();

		}

	}

	public void MostrarDatosIntroduciodos() {
		for (int i = 0; i < Nombres.length; i++) {
			System.out.print(Nombres[i] + " ---> " + Mail[i] + "\n");
		}

	}

	public void ComprobarEmail() {
		System.out.println("Ingrese el nombre a buscar");
		nom = sc.nextLine();
		boolean exite = false;

		for (int i = 0; i < Nombres.length - 1; i++) {

			positivo = Nombres[i].indexOf(nom);

			if (positivo >= 0) {
				count1++;
				nom2 = Nombres[i];
				mail = Mail[i];
			}
		}

		if (count1 == 1) {
			exite = true;

		} else
			exite = false;

		if (exite == true) {
			System.out.println("El usuario esta Registrado");

		} else
			System.out.println("El usuario no Existe en la base de datos");

		System.out.println("Usuario: " + nom2 + ". Email ---> " + mail);

	}

	public static void main(String[] args) {
		Metodos3 ss = new Metodos3();
		ss.IngresarDatos();
		ss.MostrarDatosIntroduciodos();
		ss.ComprobarEmail();
	}
}