package Mesa;

import java.util.Scanner;

public class TresNotas3Digitos {

	Scanner sc = new Scanner(System.in);
	private float nota1, nota2, nota3;
	private int num1, num2, num3, mayor;

	public void CargaDatos() {

		System.out.println("Ingrese primera nota del Alumno");
		nota1 = sc.nextFloat();
		System.out.println("Ingrese segunda bota del alumno");
		nota2 = sc.nextFloat();
		System.out.println("Ingrese tercera nota del alumno");
		nota3 = sc.nextFloat();

		System.out.println("Ingrese primer valor");
		num1 = sc.nextInt();
		System.out.println("Ingrese segundo valor");
		num2 = sc.nextInt();
		System.out.println("Ingrese tercero valor");
		num3 = sc.nextInt();

	}

	public void CalcularNota() {

		float promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio >= 7) {
			System.out.println("Promocionado");

		} else if (promedio > 4) {
			System.out.println("Aprobado");
		} else
			System.out.println("suspenso");
	}

	public void CalcularDigitos() {
		
		String Digito;
		if (num1 > num2 && num1 > num3) {
			mayor = num1;

		} else if (num1 < num2 && num2 > num3) {
			mayor = num2;
		} else {
			mayor = num3;
		}
		if (num1 < 10) {

		}
		if (mayor < 10) {
			Digito = "Tiene un Digito";

		} else if (mayor < 100) {
			Digito = "Tiene dos Digitos";
		} else if (mayor < 1000) {
			
			Digito = "Tiene Tres Digitos";

		}else {
			Digito = "Tiene mas de tres digitos"; 
		}
		System.out.println("El numero mayor es: " + mayor + " y " + Digito);
	}
	
	public void PositivoNegativo() {
		String poneul;
		if (mayor<0) {
			poneul = "El numero es Negativo ";
	
		}else if (mayor>0) {
			poneul = "El numero es Postivo ";
		}else {
			poneul = "El numero es nulo ";
		}
		System.out.println(poneul);
	}
	

	public static void main(String[] args) {

		TresNotas3Digitos Alumno = new TresNotas3Digitos();
		Alumno.CargaDatos();
		Alumno.CalcularNota();
		Alumno.CalcularDigitos();
		Alumno.PositivoNegativo();
	}

}
