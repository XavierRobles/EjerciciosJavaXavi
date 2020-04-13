package Arrais;

import java.util.Scanner;

public class AlturasVector {
	Scanner sc = new Scanner(System.in);
	private float[] Alturas;
	private float Promedio;

	private void Cargaralturas() {

		Alturas = new float[5];
		for (int i = 0; i < Alturas.length; i++) {
			System.out.println("Ingresa las alturas");
			Alturas[i] = sc.nextFloat();
		}
		
	}

	private void PromedioYcontar() {
		float suma = 0;
		for (int i = 0; i < Alturas.length; i++) {
			suma += Alturas[i];
		}
		Promedio =suma/5;
		System.out.println("Promedio :"+Promedio);
		
	}
	private void ContarAltas() {
		int count1 = 0,count2 = 0;
		for (int i = 0; i < Alturas.length; i++) {
			if (Alturas[i]>Promedio) {
				count1++;
				
			}else
				count2++;
			
		}
		System.out.println("Personas mas altas del promedio son: "+count1+ " y menores del promedio "+count2);
	}
	
	public static void main(String[] args) {
		AlturasVector dd = new AlturasVector();
		dd.Cargaralturas();
		dd.PromedioYcontar();
		dd.ContarAltas();
	}
	
}
