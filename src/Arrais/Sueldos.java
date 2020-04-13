package Arrais;

import java.util.Scanner;

public class Sueldos {
	Scanner sc = new Scanner(System.in);
	private int[] sueldos;
	
	
	private void VectorSueldo() {
        sueldos = new int [5];
       
        for (int i = 0; i < sueldos.length; i++) {
        	 System.out.println("Introdusca sueldo");
        	 sueldos[i]=sc.nextInt();
		}

	}
    
    public void Imprimir() {
    	for (int i = 0; i < sueldos.length; i++) {
			System.out.print(sueldos[i]+"  ");
		}
    	
    }
    public static void main(String[] args) {
		Sueldos ss = new Sueldos();
		ss.VectorSueldo();
		ss.Imprimir();
	}
}
