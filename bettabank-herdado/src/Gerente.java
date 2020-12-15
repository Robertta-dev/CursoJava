public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	private int senha;

	public void Cliente() {

		this.autenticador = new AutenticacaoUtil();
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		return this.autenticador.setSenha(senha);
		}

		
	public int getSenha() {
		return senha;
	}

	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do Gerente " + this.nome);
		return super.salario + 400;
		
	}
}
	