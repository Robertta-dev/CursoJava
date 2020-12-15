
	public class Designer extends FuncionarioMod {
	
		public Designer(String nome, String cpf, double salario) {
			super(nome, cpf, salario);
		}

		
		public double getBonificacao() {
			return super.getBonificacao() + super.salario;
		}
	}
