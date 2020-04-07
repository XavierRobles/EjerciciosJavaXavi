package Mesa;
import java.util.*;

public class AumentoSueldo {

	Scanner sc = new Scanner(System.in);
	private int Sueldo,Años;
	
	
	public void Datos() {
		System.out.println("Ingrese el sueldo del empleado ");
		Sueldo = sc.nextInt();
		System.out.println("Ingrese la antiguedad del empleado.");
		Años = sc.nextInt();
	}

	public void CalcularAumento() {
		
		if (Sueldo<500 && Años>=10) {
			int Aumento= (int) (Sueldo * 0.20f);
			Sueldo = Sueldo + Aumento;
			System.out.println("Por cobrar menos de 500€ y tener una antiguedad de mas de 10 años se le va incrementara el sueldo en un 20% mas siendo un aumento de "+Aumento+"€\nQuedandose su nuevo sueldo es " + Sueldo);
			
		}else if(Sueldo<500) {
			int Aumento= (int) (Sueldo * 0.05f);
			Sueldo = Sueldo + Aumento;
			System.out.println("Por cobrar menos de 500€ se le va incrementara el sueldo en un 5% mas siendo un aumemto de "+Aumento+"€\nQuedandose su nuevo sueldo es " + Sueldo);
		}else
		{
			System.out.println("Actualmente esta cobrando "+Sueldo + "€ Siendo el maximo actual\nNo recibira aumento");
		}
	}
	
	public static void main(String[] args) {
		AumentoSueldo op = new AumentoSueldo();
		op.Datos();
		op.CalcularAumento();
	}
	
}
