package Sucursal;

public class Cliente {
	private String nombre;
	private int saldo;

	public Cliente(String nombres) {
		this.nombre = nombres;
		this.saldo = 0;
	}
	public void Depositar(int moneda) {
		saldo = saldo+moneda;
		
	}
	public void Extraer(int moneda) {
		saldo -=moneda;
	}
	public int RetornarSaldo() {
		return saldo;
		
	}
	
	public void Implrimir() {
		System.out.println(nombre + " Tiene depositado en su cuenta la suma de: "+saldo);
	}
}
