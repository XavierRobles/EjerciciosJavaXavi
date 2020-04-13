import java.util.Scanner;

public class Dowhiles {
	Scanner sc = new Scanner(System.in);
	private int num,suma,count;
	
	public void digitos() {
		do {
			System.out.println("Ingrese un numero entre 1 y 999");
			num = sc.nextInt();
			count++;
			if (num<10) {
				System.out.println("Tiene un Digito");
				
			}else if (num<100) {
				System.out.println("Tiene dos Digitos");
				
				
			} else if (num<1000) {
				
				System.out.println("Tiene tres digitos");
			} else {
				System.out.println("Fuera del rango");
			} {
			}  if (num == 0) {
				System.out.println("********************************************************");
				System.out.println("Adios");
				
			}

			suma += num;
			suma/= count;
			System.out.println("********************************************************");
			
		} while (num!=0);
		System.out.println("Promedio: "+suma);
		System.out.println("********************************************************");
	}
	
	public static void main(String[] args) {
		Dowhiles ss = new Dowhiles();
		ss.digitos();
	}
}
