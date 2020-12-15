package bettabankComposto;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente betta = new Cliente();
		
		betta.nome = "Calíope Longoni";
		betta.cpf = "255.255.255.01";
		betta.profissao = "Estudante";
	
		Conta contaDaBetta = new Conta();
		contaDaBetta.titular = betta;
		
		System.out.println(contaDaBetta.titular.cpf);
		System.out.println(contaDaBetta.titular.nome);
		System.out.println(contaDaBetta.titular.profissao);
		
		contaDaBetta.deposita(1000);
		System.out.println(contaDaBetta.getSaldo());
	}
	

}
