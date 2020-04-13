package Arrais;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class TamañosArray {
Scanner sc = new Scanner(System.in);

private int[] Sueldos;
private int cantidad;
private int sueldo,Suma;

private void PedirSueldos() {
System.err.println("Ingrese la cantidad de sueldos por meter");
	cantidad = sc.nextInt();
	Sueldos = new int [cantidad];

	for (int i = 0; i < Sueldos.length; i++) {
		System.out.println("Ingrese el sueldo "+ (i+1));
		Sueldos[i] = sc.nextInt();
		
	}
	
		System.out.println(Arrays.toString(Sueldos));

	
	
	for (int i = 0; i < Sueldos.length; i++) {
		System.err.print(Sueldos[i]+" ");
		Suma += Sueldos[i];
	}
	
	System.out.println("Total Sueldos "+Suma);
}

public static void main(String[] args) {
	TamañosArray dd = new TamañosArray();
	dd.PedirSueldos();
}

}
