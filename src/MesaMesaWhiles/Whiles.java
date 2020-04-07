package MesaMesaWhiles;

import java.util.Scanner;

public class Whiles {
	Scanner sc = new Scanner(System.in);
	private int num1 = 0;

	public void Cien() {

		while (num1 < 100) {
			num1++;
			System.out.print(num1 + "-");

		}
		System.out.println();
	}

	public void DiezaValores() {

		System.out.println("Cuantos numeros va introducir?");
		int cantidad = sc.nextInt();
		int numero = 0;
		int suma;
		int coun=1;
		int aux = 0;
		while (coun <= cantidad) {
			System.out.println("Introduzaca numero:");
			numero = sc.nextInt();
			aux += numero;
			coun++;
		}
		int promedio = aux / cantidad;
		System.out.println("La suma es "+aux);
		System.out.println("El promedio es "+promedio);

	}

	public static void main(String[] args) {

		Whiles op = new Whiles();
		op.Cien();
		op.DiezaValores();
	}

}
