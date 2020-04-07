package MesaMesaWhiles;

import java.util.Scanner;

public class Fores {
	Scanner sc = new Scanner(System.in);
	
	private int Cantidad,suma,promedio;
	
	public void primerFor() {
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("ingrese valores");
			Cantidad = sc.nextInt();
			suma += Cantidad;
		}
		promedio = suma / 10;
		
		
		System.out.println("La suma total es "+suma + " y el promedio " + promedio);
	}
	
	
	
	public void Aprobados() {
		int nota,aprobado = 0,suspensos = 0,suma = 0,aprobado2 = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese notas");
			nota=sc.nextInt();
			
			if (nota>=7) {
				
				aprobado++;
			}else if(nota>=5){
				aprobado2++;
				
			}else {
				suspensos++;
			}
			
		}
		System.out.println("Alumnos aprobados "+aprobado+"| Alumnos Justitos "+aprobado2+"| Alumnos suspensos "+suspensos+"|");
		
	}

	public static void main(String[] args) {
		Fores dd = new Fores();
//		dd.primerFor();
		dd.Aprobados();
	}
}
