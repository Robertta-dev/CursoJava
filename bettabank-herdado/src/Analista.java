public class Analista extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando m�todo de bonifica��o do Analista " + this.nome);
		return super.salario + 200;
	}
}
