package Sucursal;

import java.util.Scanner;

public class Banco {
	Scanner sc = new Scanner(System.in);
	private Cliente Cliente1, Cliente2, Cliente3;

	public Banco() {
		Cliente1 = new Cliente("Xavier");
		Cliente2 = new Cliente("Sara");
		Cliente3 = new Cliente("Marta");
	}
	public void Operar() {
		Cliente1.Depositar(500);
		Cliente2.Depositar(1200);
		Cliente3.Depositar(200);
		
		Cliente1.Extraer(400);
	}
	
	public void ImprimirTotales() {
		Cliente1.Implrimir();
		Cliente2.Implrimir();
		Cliente3.Implrimir();
		System.out.println("*********************************");
		System.out.println("*************Total***************");
		System.out.println(Cliente1.RetornarSaldo()+Cliente2.RetornarSaldo()+Cliente3.RetornarSaldo());
	}

	public static void main(String[] args) {
		Banco ss = new Banco();
		ss.Operar();
		ss.ImprimirTotales();
	}
}
