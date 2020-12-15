//classe abstract incluida  // � pode estanciar
public abstract class Funcionario {          

	protected String nome;
	protected String cpf;
	protected double salario;

	public abstract double getBonificacao();
		//return this.salario * 0.;
			//metodo abstract incluido   // � h� implementa��o                               

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
