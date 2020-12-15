public class Administrador extends FuncionarioAutenticavel {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
