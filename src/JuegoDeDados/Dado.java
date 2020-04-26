package JuegoDeDados;

public class Dado {
	private int dado=1;


	public void Tirar() {
		dado += (int) Math.round(Math.random()*5
				);
	}
	public void Imprimir() {
		System.out.println("El numero del dado es:"+dado);
	}



	public int DevolverDado() {
		return dado;
		
	}
}
