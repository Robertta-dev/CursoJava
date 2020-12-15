public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

		
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

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
	}
}
	@Override
	public int getSenha(int senha) {
		// TODO Auto-generated method stub
		return 0;
	}
}