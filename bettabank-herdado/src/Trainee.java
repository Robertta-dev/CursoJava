public class Trainee extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando m�todo de bonifica��o do Trainee " + this.nome);
		return super.salario + 100;
	}
}
