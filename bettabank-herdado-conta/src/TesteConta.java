
public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1111, 1234567);
		cc.deposita(1000);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 1235678);
		cp.deposita(2000);
		
		ContaCorrente c1 = new ContaCorrente(3333, 3456734);
		c1.deposita(6000);
		
		ContaPoupanca cp2 = new ContaPoupanca(4444, 6754321);
		cp2.deposita(50);
		cp.transfere(500, cc);
		cc.transfere(600, cp2);
		
		
		System.out.println(cc.getSaldo());

		c1.saca(100);
	}

}
