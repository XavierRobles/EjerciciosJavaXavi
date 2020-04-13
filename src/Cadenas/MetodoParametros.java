package Cadenas;

import java.util.Scanner;

public class MetodoParametros {
	Scanner sc = new Scanner(System.in);

	private int num1;

	private void CargarDatos() {

		do {
			System.out.println("Ingrese un valor");
			num1 = sc.nextInt();
			if (num1 != -1) {
				Calcular(num1);

			}

		} while (num1 != -1);
	}

	private void Calcular(int n) {
		int count = 0;
for (int i = n; i <= n * 10; i = i + n) {

			count++;
			System.out.println(n + "X" + count+"="+i);
			
		}
	}

	public static void main(String[] args) {
		MetodoParametros ss = new MetodoParametros();
		ss.CargarDatos();
//		ss.Calcular(0);
	}
}
