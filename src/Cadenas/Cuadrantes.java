package Cadenas;

import java.util.Scanner;

public class Cuadrantes {
	Scanner sc = new Scanner(System.in);
	private int x, y;

	public void DatosCuadrate() {
		System.out.println("ingrese Cordenada x");
		x = sc.nextInt();
		System.out.println("ingrese Cordenada y");
		y = sc.nextInt();
	
		
	}
	
	private void ComprobarCuadrante() {
		if (x>0 && y>0) {
			System.out.println("Cuadrante Uno");
			
		}else if (x<0 && y>0) {
			System.out.println("Cuadrante Dos");
			
			
		}else if (x<0 && y<0) {
			System.out.println("Cuadrante Tres");
			
			
		}else
			System.out.println("Cudrante Cuatro");
	}
	
	public static void main(String[] args) {
		Cuadrantes ss = new Cuadrantes();
		ss.DatosCuadrate();
		ss.ComprobarCuadrante();
	}
	
	
}
