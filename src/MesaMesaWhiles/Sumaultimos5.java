package MesaMesaWhiles;

import java.util.Scanner;

public class Sumaultimos5 {
	Scanner sc = new Scanner(System.in);
	private int valores, suma, total,x,multiplica;

	public void CalcularSuma() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese valor");

			valores = sc.nextInt();

			if (i >= 5) {
				suma += valores;

			}

		}
		System.out.println("La suma de los ultimos 5 es "+ suma);
	}

	
	public void TablaMultiplicar() {
		System.out.println("Ingrese la tabla de multiplicar");
		x = sc.nextInt();
		for (int i = 0; i <= 10; i++) {
			
			multiplica = x * i;
			
			System.out.println(x+" "+"x"+" "+i+" = "+multiplica);
		}
		
	}
	
	
	public void TablaMultiplicar2() {
		System.out.println("Ingrese multiplo");
		x = sc.nextInt();
		for (int i = 0; i < 6; i++) {
			
			multiplica += x * 2;
			
			System.out.println(multiplica);
		}
		
	}
	
	
	public static void main(String[] args) {
		Sumaultimos5 dd = new Sumaultimos5();
//		dd.CalcularSuma();
//		dd.TablaMultiplicar();
		dd.TablaMultiplicar2();
	}

}
