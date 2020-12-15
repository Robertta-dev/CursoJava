public class Analista extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do Analista " + this.nome);
		return super.salario + 200;
	}
}
