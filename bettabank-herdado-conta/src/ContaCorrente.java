
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;     //incluindo taxa de transferencia
		return super.saca(valorASacar);
	}

	public static void main(String[] args) {
		

	}

}
