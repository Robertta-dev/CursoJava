
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;     //incluindo taxa de transferencia
		return super.saca(valorASacar);
	}

	
	public double getValorImposto() {
		
		return super.saldo * 0.1;
	}
}
