package Mesa;
import java.util.*;

public class Iguales {

	Scanner sc = new Scanner(System.in);
	private int num1,num2,num3;
	
	
	public void CargarValor() {
		
			System.out.println("Introduzca un valor 1");
			num1=sc.nextInt();
			System.out.println("Introduzca un valor 2");
			num2=sc.nextInt();
			System.out.println("Introduzca un valor 3");
			num3=sc.nextInt();
		
	}
	
	public void ComparacionOperacion() {
		if (num1==num2 && num1==num3) {
			
			int Suma = num1 + num2;
			int X = Suma * num3;
			
			System.out.println("La suma del los dos primero es:" + Suma + " y la Multiplicacion de la Suma por el tercer numero es: " + X);
			
		}else
			System.out.println("Los numeros no coinciden");
	}
	
	public static void main(String[] args) {
		Iguales ope = new Iguales();
		ope.CargarValor();
		ope.ComparacionOperacion();
	}
}
