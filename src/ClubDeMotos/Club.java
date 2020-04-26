package ClubDeMotos;

import java.util.Scanner;

public class Club {
	private Socio Motorista1, Motorista2, Motorista3;
	Scanner sc = new Scanner(System.in);

	public Club() {
		Motorista1 = new Socio(sc);
		Motorista2 = new Socio(sc);
		Motorista3 = new Socio(sc);
	}

	public void Veterano() {

		if (Motorista1.RetornarAntigu() > Motorista2.RetornarAntigu()
				&& Motorista1.RetornarAntigu() > Motorista3.RetornarAntigu()) {
			System.out.println("El Motorista mas veterenao es " + Motorista1.ReturnNombre()+" con una antiguedad de " + Motorista1.RetornarAntigu()+" años");
		} else if (Motorista2.RetornarAntigu() > Motorista1.RetornarAntigu()
				&& Motorista2.RetornarAntigu() > Motorista3.RetornarAntigu()) {
			System.out.println("El Motorista mas veterenao es " + Motorista2.ReturnNombre()+" con una antiguedad de " + Motorista2.RetornarAntigu()+" años");
		} else
			System.out.println("El Motorista mas veterenao es " + Motorista3.ReturnNombre()+" con una antiguedad de " + Motorista3.RetornarAntigu()+" años");
	}

	public static void main(String[] args) {
		Club Moto = new Club();

		Moto.Veterano();
	}
}
