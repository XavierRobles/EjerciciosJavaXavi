import java.util.Scanner;

public class Ifss {
	Scanner sc = new Scanner(System.in);
	private float sueldo;
	private float num1, num2;

	public void CargarDatos() {
		System.out.println("Ingrese el sueldo del empleado");
		sueldo = +sc.nextFloat();
		System.out.println("Introduca el primer valor");
		num1 = +sc.nextFloat();
		System.out.println("Introduzca el segundo valor");
		num2 = +sc.nextFloat();

	}

	public void CalcularSueldo() {
		if (sueldo >= 3000) {
			System.out.println("A pagar impuestos");

		} else
			System.out.println("no paga impuestos");
	}

	public void MayorMenor() {
		if (num1 > num2) {
			System.out.println("El valor mas alto es: " + num1);

		} else
			System.out.println("El valor mas alto es: " + num2);

	}

	public void SumaDiferencia() {

		if (num1 > num2) {
			float diferencia = num1 - num2;
			float suma = num1 + num2;
			System.out.println("La suma de los numeros es: " + suma + " y la diferencia entre ellos es " + diferencia);
		} else {
			float multiplicacion = num1 * num2;
			float division = num1 / num2;
			System.out.println("La multiplicacion es: " + multiplicacion + " y la division es: " + division);

		}
	}

	public static void main(String[] args) {

		Ifss Controlador = new Ifss();
		Controlador.CargarDatos();
		Controlador.CalcularSueldo();
		Controlador.MayorMenor();
		Controlador.SumaDiferencia();
	}

}
