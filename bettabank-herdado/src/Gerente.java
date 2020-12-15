public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do Gerente " + this.nome);
		return super.salario + 400;
		
	}
}