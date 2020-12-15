public class Trainee extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do Trainee " + this.nome);
		return super.salario + 100;
	}
}
