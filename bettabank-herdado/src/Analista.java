
	public class Analista extends FuncionarioMod{

		public Analista(String nome, String cpf, double salario) {
			super(nome, cpf, salario);
		}
	

			
		public double getBonificacao() {
			return super.getBonificacao() + super.salario;
		}
}
