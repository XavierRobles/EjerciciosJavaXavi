package MesaMesaWhiles;
import java.util.Scanner;

public class PiezasHierro {

	Scanner sc = new Scanner(System.in);
	
	private float piezas,apta,mala,Buenas,medidas;
	
	public void Datos() {
		System.out.println("Introduzca el nuymero de piezas a procesa");
		piezas = sc.nextFloat();
		
	}
	
	public void Operaciones() {
		int iter = 1;
		
		while (iter<=piezas) {
		System.out.println("Introduzca medidas");
		medidas = sc.nextFloat();
		iter++;
			if (medidas >= 1.20 && medidas <= 1.30 ) {
				Buenas++;
				
			}	
	
		}
		
		System.out.println("numero de piezas aptas "+ (int)Buenas);
		
		
	
	}

	public static void main(String[] args) {
		PiezasHierro pz = new PiezasHierro();
		pz.Datos();
		pz.Operaciones();
	}
}
