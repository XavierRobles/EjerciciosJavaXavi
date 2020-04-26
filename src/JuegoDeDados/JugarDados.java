package JuegoDeDados;

public class JugarDados {
	private Dado Dado1, Dado2, Dado3;

	public JugarDados() {
		super();
		Dado1 = new Dado();
		Dado2 = new Dado();
		Dado3 = new Dado();
	}
	
	public void Tirada() {
		Dado1.Tirar();
		Dado1.Imprimir();
		Dado2.Tirar();
		Dado2.Imprimir();
		Dado3.Tirar();
		Dado3.Imprimir();
	}
	
	public void Comparar() {
		if (Dado1.DevolverDado()==Dado2.DevolverDado() && Dado1.DevolverDado()==Dado3.DevolverDado()) {
			System.out.println("Felicidades Has Ganado!!!");
		}else
		System.out.println("Ooooo Has perdido");
	}

	public static void main(String[] args) {
		JugarDados jugador1 = new JugarDados();
		jugador1.Tirada();
		jugador1.Comparar();
	}
	
}
