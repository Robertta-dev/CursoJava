
public class Designer extends Funcionario {

	
	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do Designer " + this.nome);
		return super.salario + 100;
	}
}

