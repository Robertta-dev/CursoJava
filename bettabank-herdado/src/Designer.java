
public class Designer extends Funcionario {

	
	public double getBonificacao() {
		System.out.println("Chamando m�todo de bonifica��o do Designer " + this.nome);
		return super.salario + 100;
	}
}

