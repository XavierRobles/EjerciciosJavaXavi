package Mesa;

import java.util.*;

public class Encuesta {
	Scanner sc = new Scanner(System.in);
	private int preguntas, correctas, Total;

	public void CargarDatos() {
		System.out.println("Introduzca cantidad de preguntas");
		preguntas = sc.nextInt();
		System.out.println("Introduzaca cantidas de aciertos");
		correctas = sc.nextInt();
	}

	public void CalcularPorcentaje() {

		Total = (correctas * 100) / preguntas;

	}

	public void Informe() {
		String porcentaje = "";

		if (Total >= 90) {
			porcentaje += "Nivel Maximo ";
		} else if (Total >= 75) {
			porcentaje += "Nivel Medio ";
		} else if (Total >= 50) {
			porcentaje += "Nivel Regular ";
		} else if (Total < 50) {
			porcentaje = "Fuera de nivel ";
		}

		System.out.println(porcentaje+Total+"%");
	}

	public static void main(String[] args) {
		Encuesta Calcular = new Encuesta();
		Calcular.CargarDatos();
		Calcular.CalcularPorcentaje();
		Calcular.Informe();
	}

}
