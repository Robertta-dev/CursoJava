
public class Gerente extends FuncionarioMod {

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
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
		return super.getBonificacao() + super.salario;
	}
}