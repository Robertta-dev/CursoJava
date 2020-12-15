
public class FuncionarioMod {

	protected String nome;
	protected String cpf;
	protected double salario;

	public FuncionarioMod(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		System.out.println("Funcionario: " + this.nome + " CPF: " + this.cpf + "Salario: " + this.salario);
		// Criei Função "FuncionarioMod" para que não fosse necessário usar os setters
		// em cada funcionario novo.

		// FuncionarioMod.total++;
		// System.out.println("O total due collaborators é: " + total);

	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}

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
