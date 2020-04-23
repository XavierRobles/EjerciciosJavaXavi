package MesaMesaWhiles;

import java.util.Scanner;

public class listasWhile {
	Scanner sc = new Scanner(System.in);
	private int lista1, lista2,suma1,suma2,x,b,valores1,valores2;

	
	
	public void LISTA1() {
		while (x==0) {
		System.out.println("---");	
		}
		System.out.println("Introduzca los valores de la primera lista");
		
		while (x<5) {
			valores1 = sc.nextInt();
			suma1 += valores1;
			x++;
			
		}
		lista1 += suma1;
		System.out.println("La lista 1 suma un total de " + lista1);
		System.out.println("-------------------------------------------------------------");
		
	}
	public void LISTA2() {
		System.out.println("Introduzca los valores de la segunda lista");
		
		while (b<5) {
			valores2 = sc.nextInt();
			suma2 += valores2;
			b++;
			
		}
		lista2 += suma2;
		System.out.println("La lista 2 sumaun total de " + lista2);
		System.out.println("-------------------------------------------------------------");
		
	}
	
	public void Comparar() {
		if (lista1>lista2) {
			
			System.out.println("La mayor lista es la 1");
		}else
			System.out.println("La lista mayor es la 2");
	}
	
	public static void main(String[] args) {
		listasWhile tt = new listasWhile();
		tt.LISTA1();
		tt.LISTA2();
		tt.Comparar();
	}
	
}
