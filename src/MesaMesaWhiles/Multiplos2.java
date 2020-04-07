package MesaMesaWhiles;

import java.util.Scanner;

public class Multiplos2 {
	Scanner sc = new Scanner(System.in);
	private int multi3, multi5, num;

	public void CalcularMultiplos() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un numero");

			num = sc.nextInt();
			if (num % 3 == 0) {
				multi3++;

			} else if (num % 5 == 0) {
				multi5++;

			}

		}
		System.out.println("Cantida de multiplos de 3: " + multi3 + " Cantida de multiplos de 5: " + multi5);
	}

	public static void main(String[] args) {
		Multiplos2 ss = new Multiplos2();
		ss.CalcularMultiplos();
	}
}