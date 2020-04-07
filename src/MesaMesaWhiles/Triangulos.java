package MesaMesaWhiles;

import java.util.Scanner;

public class Triangulos {
	Scanner sc = new Scanner(System.in);
	private int base, altura, cantidad, Triangulo, grande, Equilatero, isosceles, escaleno, lado1, lado2, lado3;

	public void DatosTriangulos() {
		System.out.println("Ingrese la cantidad de trinagulos que desea calcular");
		cantidad = sc.nextInt();

	}

	public void CalcularTriangulos() {

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese la base");
			base = sc.nextInt();
			System.out.println("Ingrese la altura");
			altura = sc.nextInt();

			Triangulo = (base * altura) / 2;

			if (Triangulo >= 12) {

				grande++;
			}

			System.out.println("La Base es " + base + " La altura es " + altura + " La Superficie es " + Triangulo);
			System.out.println("*********************************************************************");
		}
		System.out.println("Hay una cantidad de " + grande + " Triangulos mayores de 12");
	}

	public void CalcularTriangulos2() {

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese la lado 1");
			lado1 = sc.nextInt();
			System.out.println("Ingrese la lado 2");
			lado2 = sc.nextInt();
			System.out.println("Ingrese la lado 3");
			lado3 = sc.nextInt();

			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Es un triangulos Equilatero");
				Equilatero++;

			} else if (lado1 == lado2 || lado1 == lado3) {
				System.out.println("Es un triangulos Isosceles");
				isosceles++;

			} else if (lado1 != lado2 && lado1 != lado3) {
				System.out.println("Es un triangulos Escaleno");
				escaleno++;
			}

			System.out.println("*********************************************************************");

		}
		System.out.println("Tipos de triangulos Equilater " + Equilatero + " | Isosceles " + isosceles + " | Escaleno "
				+ escaleno);
		System.out.println("*****************************************************************************");
		if (Equilatero<isosceles && Equilatero<escaleno) {
			System.out.println("La menor cantidad de triangulos son los Equilatero");
			
		} else if (isosceles<escaleno) {
			System.out.println("La menor cantidad de triangulos son los Isosceles");

		}else {
			System.out.println("La menor cantidad de triangulos son los Escaleno");
		}
	}

	public static void main(String[] args) {
		Triangulos t = new Triangulos();
		t.DatosTriangulos();
		t.CalcularTriangulos();
		t.CalcularTriangulos2();
	}
}
