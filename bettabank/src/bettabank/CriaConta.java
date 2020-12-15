package bettabank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		
		System.out.println("Saldo primeira conta: " + primeiraConta);
		System.out.println("Saldo segunda conta: " + segundaConta);
	
		System.out.println(primeiraConta);
	}
}
