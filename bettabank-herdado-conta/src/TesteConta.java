
public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1111, 1234567);
		cc.deposita(1000);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 1235678);
		cp.deposita(2000);
		
		cp.transfere(500, cc);
		
		System.out.println(cc.getSaldo());

	}

}
