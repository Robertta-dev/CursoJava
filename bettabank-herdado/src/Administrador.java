public class Administrador extends Funcionario implements Autenticavel {
	
	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}


	public double getBonificacao() {
		return 100;
	}
	
	public int getSenha(int senha) {
		return senha;
	}
}