public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	private int senha;

	public void Cliente() {

		this.autenticador = new AutenticacaoUtil();
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		}


	public double getBonificacao() {
		return 100;
	}
	
	public int getSenha(int senha) {
		return senha;
	}
}