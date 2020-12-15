public class Trainee extends Funcionario{
	
	public double getBonificacao() {
		return super.getBonificacao() + super.salario;
	}
}
