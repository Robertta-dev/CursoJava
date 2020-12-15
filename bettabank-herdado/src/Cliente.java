
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	private int senha;

	public Cliente() {

		this.autenticador = new AutenticacaoUtil();
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		}
	}
