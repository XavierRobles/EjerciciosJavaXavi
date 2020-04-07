package MesaMesaWhiles;

import java.util.Scanner;

public class ParImpar {

	Scanner sc = new Scanner(System.in);

	private int count1, count2, cantidad, x, num;

	public void Comparador() {
		System.out.println("Introduzca cuanto valores insertara");
		cantidad = sc.nextInt();

		while (x < cantidad) {
			System.out.println("Introduzca valor");
			num = sc.nextInt();
			x++;

			if (num % 2 == 0) {
				count1++;

			} else
				count2++;

		}
		System.out.println(
				"La catidad de numeros pares son " + count1 + " y la cantidad de numeros impares son " + count2);

	}

	public void imprimirconFor() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ParImpar ss = new ParImpar();
		ss.Comparador();
		ss.imprimirconFor();
	}
}
