package EESS;
import java.util.Scanner;

public class SumaRestaProducto {
	Scanner sc = new Scanner(System.in);
	private int num1, num2, num3, num4;
	private int articulos, precio;

	public void CargarDatos() {
		System.out.println("Ingrese el primer valor");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo valor");
		num2 = sc.nextInt();
		System.out.println("Ingrese el tercer valor");
		num3 = sc.nextInt();
		System.out.println("Ingrese le cuarto valor");
		num4 = sc.nextInt();
	}

	public void SumaDosPrimeros() {
		int Suma = num1 + num2;
		System.out.println("La suma de los dos primeros numeros es: " + Suma);
	}

	public void ProductoNumeros() {
		int Producto = +num3 * num4;
		System.out.println("El producto del numero 3 y 4 es:" + Producto);
	}

	public void SumaPromedio() {
		int Suma = +(num1 + num2 + num3 + num4);
		System.out.println("La suma de los cuatro valores es: " + Suma);
		System.out.println();
		int promedio = +Suma / 4;
		System.out.println("El promedio de los cuatro valores es: " + promedio);
	}

	public void CargarCompra() {
		System.out.println("Ingrese la cantidad de articulos que lleva");
		articulos = +sc.nextInt();
		System.out.println("Ingrese el precio del  producto");
		precio = +sc.nextInt();
	}

	public void ResultadoCompra() {
		int Total = +articulos * precio;
		System.out.println("Total por abonar: " + Total + "€");
	}

	public static void main(String[] args) {

		SumaRestaProducto operador = new SumaRestaProducto();
		operador.CargarDatos();
		System.out.println("-------------------------------------");
		operador.SumaDosPrimeros();
		System.out.println("-------------------------------------");
		operador.ProductoNumeros();
		System.out.println("-------------------------------------");
		operador.SumaPromedio();
		System.out.println("-------------------------------------");
		operador.CargarCompra();
		System.out.println("-------------------------------------");
		operador.ResultadoCompra();
	}

}
