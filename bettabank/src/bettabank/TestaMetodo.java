package bettabank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDaCaliope = new Conta();
		Conta contaDaAna = new Conta();
		Conta contaDaBeatriz = new Conta();
		
		contaDaCaliope.deposita(2000);
		contaDaCaliope.deposita(500);
		
		
		boolean conseguiuRetirar = contaDaCaliope.saca(40);
		
		System.out.println(conseguiuRetirar);
		
		
		contaDaAna.deposita(2000);
		
		
		contaDaAna.transfere(300, contaDaCaliope);
		contaDaCaliope.transfere(300, contaDaAna);
		
		
		contaDaBeatriz.deposita(700);
		
		
		System.out.println(contaDaCaliope.saldo);
		System.out.println(contaDaCaliope.saldo);
		System.out.println(contaDaAna.saldo);
	}
		}

