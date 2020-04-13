package Cadenas;

import java.util.Scanner;

public class ParametrosReturn {
	
	Scanner sc = new Scanner(System.in);
	private int valor1,valor2,valor3,mayor,menor,num;
	private String Grande ="Es Mayor",Pequeño = "Es el menos";
	private void InsertadoDeDatos() {

		System.out.println("Ingrese un valor");
		valor1 = sc.nextInt();
		System.out.println("Ingrese un valor");
		valor2 = sc.nextInt();
		System.out.println("Ingrese un valor");
		valor3 = sc.nextInt();
		mayor=CaluculoMayor(valor1,valor2,valor3);
		menor=CaluculoNenor(valor1,valor2,valor3);
		System.out.println("El mayor es "+ mayor);
		System.out.println("El menor es "+ menor);
	}
	private int CaluculoMayor(int valor1, int valor2, int valor3) {
		if (valor1>valor2 && valor1>valor3) {
			num = valor1;
		}else if (valor2>valor3) {
			num =valor2;
			
		}else
			num =valor3;
		
		
		return num;
	}
	private int CaluculoNenor(int valor1, int valor2, int valor3) {
		if (valor1<valor2 && valor1<valor3) {
			num = valor1;
		}else if (valor2<valor3) {
			num =valor2;
			
		}else
			num =valor3;
		
		
		return num;
	}
	
	

	public static void main(String[] args) {
		ParametrosReturn dd = new ParametrosReturn();
		dd.InsertadoDeDatos();
	}

}
