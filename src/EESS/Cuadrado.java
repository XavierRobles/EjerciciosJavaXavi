package EESS;
import java.util.Scanner;

public class Cuadrado {

	private int lado;
	private int perimetro;
	private int Superficie;

	Scanner sc = new Scanner(System.in);

	public void ImprimirSuperficie() {
		System.out.println("Ingrese el valor del lado del cuadrado: ");
		lado = sc.nextInt();
		Superficie = lado * lado;
		System.out.println("La superficie del cuadrado es: " + Superficie);
	}

	public void ImprimePerimetro() {
		perimetro = lado * 4;
		System.out.println("El perimetro es: " + perimetro);

	}
	public static void main(String[] args) {
		Cuadrado Cuadrado;
		Cuadrado = new Cuadrado();
		Cuadrado.ImprimirSuperficie();
		Cuadrado.ImprimePerimetro();

	}

}
