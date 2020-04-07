package MesaMesaWhiles;

import java.util.Scanner;

public class DiezNotas {
	Scanner sc = new Scanner(System.in);
	
	private int  cantidad,nota,mayores,menores,x;

	public void Solicituddenotas() {
		System.out.println("Ingrese las cantidad de notas del alumno que va introducir");
		cantidad = sc.nextInt();
		while (x<cantidad) {
			System.out.println("Ingrese nota");
			nota = sc.nextInt();
			x++;
			if (nota>=7) {
				mayores++;
				
			}else
				menores++;
		}
		
		System.out.println("El numero de notas mayores o iguales a 7 es " + mayores+" y el numero de notas menores es "+menores);
	}
	
	private float CAltura,altura,E, promedio,Suma;

	
	public void Promedio() {
		
		System.out.println("Ingrese las cantidad de personas que va introducir");
		CAltura = sc.nextFloat();
		
		while (E<CAltura) {
			System.out.println("Ingrese altura");
			altura = sc.nextFloat();
			
			Suma += altura;
			E++;
			
		}
		 promedio =  Suma/CAltura;
		System.out.println("Prodeo de alturas es " + promedio );
	}
	
	public static void main(String[] args) {
	
		DiezNotas dd = new DiezNotas();
		dd.Solicituddenotas();
		dd.Promedio();
	}
}
