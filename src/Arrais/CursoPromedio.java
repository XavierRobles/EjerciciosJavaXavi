package Arrais;

import java.util.Scanner;

import MesaMesaWhiles.Fores;

public class CursoPromedio {
	Scanner sc = new Scanner(System.in);

	private int[] CursoA, CursoB;
	private int suma1,suma2;
	private void CargarNotas() {
		CursoA = new int[5];
		CursoB = new int[5];
		for (int i = 0; i < CursoA.length; i++) {
			System.out.println("Ingrese Notas Curso A ");
			CursoA[i] = sc.nextInt();

		}
		System.out.println("***********************************************");
		for (int i = 0; i < CursoB.length; i++) {
			System.out.println("Ingrese Notas Curso B ");
			CursoB[i] = sc.nextInt();

		}
	}
	
	private void CalculaPromedio() {
		for (int i = 0; i < CursoA.length; i++) {
			suma1+= CursoA[i]/5;
		}
		for (int i = 0; i < CursoB.length; i++) {
			suma2+= CursoB[i]/5;
		}
		if (suma1>suma2) {
			System.out.println("El mayor Promedio de los Cursos A y B es el: A. Con un Promdeio de: " +suma1);
			
		}else
			System.out.println("El mayor Promedio de los Cursos A y B es el: B. Con un Promdeio de: " +suma2);
		
	}
	public static void main(String[] args) {
		CursoPromedio ss = new CursoPromedio();
		ss.CargarNotas();
		ss.CalculaPromedio();
	}
}
