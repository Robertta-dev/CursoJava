
public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1111, 1234567);
		cc.deposita(1000);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 1235678);
		cp.deposita(2000);
		
		ContaCorrente c1 = new ContaCorrente(4444, 3456734);
		c1.deposita(6000);
		
		cp.transfere(500, cc);
		
		System.out.println(cc.getSaldo());

		c1.saca(100);
	}

}
